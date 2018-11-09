package controllers;

import java.util.List;
import json.JSONParser;
import model.Assignment;
import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Respositories;
import spark.Request;
import spark.Response;

public class StudentController {
	public static Student studentFromSession(Request req, Response res) throws StudentNotFoundException {
		Student student = req.session().attribute("student");
		String code = student.getCode();
		Student studentObject = Respositories.estudiantes().findByCode(code);
		return studentObject;
	}

	public static Student getStudent(Request req, Response res) throws StudentNotFoundException {
		Student student = StudentController.studentFromSession(req, res);
		res.type("application/json");
		return student;
	}

	public static List<Assignment> getAssignments(Request req, Response res) throws StudentNotFoundException {
		Student student = StudentController.studentFromSession(req, res);
		res.type("application/json");
		return student.getAssignments();
	}

	public static String putStudent(Request req, Response res) {
		Student student = JSONParser.fromJson(req.body(), Student.class);
		Respositories.estudiantes().updateStudent(student);
		return "";
	}
}
