package controllers;

import json.JSONParser;
import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Respositories;
import spark.Request;
import spark.Response;

public class StudentController {

	public static Student studentFromSession(Request req, Response res) {
		Student student = req.session().attribute("student");
		String code = student.getCode();
		Student studentObject = null;
		try {
			studentObject = Respositories.estudiantes().findByCode(code);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentObject;
	}

	public static String getStudent(Request req, Response res) {
		Student student = StudentController.studentFromSession(req, res);
		res.type("application/json");
		return JSONParser.toJson(student);
	}

	public static String getAssignments(Request req, Response res) {
		Student student = StudentController.studentFromSession(req, res);
		res.type("application/json");
		return JSONParser.toJson(student.getAssignments());

	}

	public static String putStudent(Request req, Response res) {
		Student student = JSONParser.fromJson(req.body(), Student.class);
		Respositories.estudiantes().updateStudent(student);
		return "";
	}
}
