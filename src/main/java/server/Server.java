package server;

import server.security.SecurityService;
import spark.Spark;
import spark.debug.DebugScreen;
import controllers.StudentController;
import model.Student;
import model.repositories.Respositories;

import java.util.Arrays;

import model.Assignment;
import model.ConceptualGrade;
import model.NumericGrade;

class Fixture {
	public static void excecute() {

		Student juan = new Student("Juan Ignacio", "Cuiule", "1589386", "juancuiule", "12345678");

		NumericGrade nota1 = new NumericGrade(6d);
		NumericGrade nota2 = new NumericGrade(7d);
//		Assignment tpa1 = new Assignment("TPA1", "Primera parte del TP Anual", Arrays.asList(nota1, nota2));
		Assignment tpa1 = new Assignment("TPA1", "Primera parte del TP Anual", Arrays.asList());

		ConceptualGrade notac1 = new ConceptualGrade("B");
		ConceptualGrade notac2 = new ConceptualGrade("B-");
//		Assignment tp2 = new Assignment("TP2", "2° TP Objetos", Arrays.asList(notac1, notac2));
		Assignment tp2 = new Assignment("TP2", "2° TP Objetos", Arrays.asList());

		juan.addAssignment(tpa1);
		juan.addAssignment(tp2);

		Respositories.estudiantes().agregar(juan);
	}
}

public class Server {
	public static void main(String[] args) {

		Fixture.excecute();

		Spark.port(9000);
		DebugScreen.enableDebugScreen();
		Spark.get("/", (req, res) -> "Holiiiiii");

		Spark.get("/student", StudentController::getStudent);
		Spark.get("/student/assignments", StudentController::getAssignments);
		Spark.put("/student/assignments", StudentController::putStudent);

		SecurityService securityService = new SecurityService("dds-utn-2018");

		Spark.before((req, res) -> {
			try {
				Long userId = securityService.user(req.headers("Authorization").replace("Bearer ", ""));
				Student student = Respositories.estudiantes().findByCode(userId.toString());
				req.session().attribute("student", student);
				System.out.println(student);
			} catch (Exception e) {
				Spark.halt(401,
						"<h1><a href='https://www.youtube.com/watch?v=0Jx8Eay5fWQ'>Hack me </a></h1><br/><br/><br/><a href='https://www.youtube.com/watch?v=PtLmEARfStE'> El aleph </a>");
			}
		});
	}

}
