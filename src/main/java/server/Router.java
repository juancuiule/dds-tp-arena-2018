package server;

import controllers.*;
import json.JsonTransformer;
import model.Student;
import model.repositories.Respositories;
import server.security.SecurityService;
import spark.Spark;

public class Router {
	public static void configure() {

		Spark.get("/student", StudentController::getStudent, new JsonTransformer());
		Spark.get("/student/assignments", StudentController::getAssignments, new JsonTransformer());
		Spark.put("/student", StudentController::putStudent);

		SecurityService securityService = new SecurityService("dds-utn-2018");

		Spark.before((req, res) -> {
			try {
				Long userId = securityService.user(req.headers("Authorization").replace("Bearer ", ""));
				Student student = Respositories.estudiantes().findByCode(userId.toString());
				req.session().attribute("student", student);
			} catch (Exception e) {
				Spark.halt(401,
						"<h1><a href='https://www.youtube.com/watch?v=0Jx8Eay5fWQ'>Hack me </a></h1><br/><br/><br/><a href='https://www.youtube.com/watch?v=PtLmEARfStE'> El aleph </a>");
			}
		});

	}
}