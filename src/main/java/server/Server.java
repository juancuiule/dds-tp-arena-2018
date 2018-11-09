package server;

import spark.Spark;
import spark.debug.DebugScreen;
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
		Assignment tpa1 = new Assignment("TPA1", "Primera parte del TP Anual", Arrays.asList(nota1, nota2));

		ConceptualGrade notac1 = new ConceptualGrade("B");
		ConceptualGrade notac2 = new ConceptualGrade("B-");
		Assignment tp2 = new Assignment("TP2", "2° TP Objetos", Arrays.asList(notac1, notac2));

		juan.addAssignment(tpa1);
		juan.addAssignment(tp2);

		Respositories.estudiantes().agregar(juan);
	}
}

public class Server {
	public static void main(String[] args) {

		Fixture.excecute();

		Spark.port(9000);
		Router.configure();

		DebugScreen.enableDebugScreen();
	}
}