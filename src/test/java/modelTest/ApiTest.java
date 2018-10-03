package modelTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.ClientResponse;

import json.JSONParser;
import model.Assignment;
import model.Student;
import model.StudentController;

public class ApiTest {
	@Test
	public void sePideUnEstudiante() {
		ClientResponse response = new StudentController().getStudent();
//		Student student = JSONParser.parseStudent(response.getEntity(String.class));
//		System.out.println(student.getFirstName());
//		System.out.println(student.getLastName());
//		System.out.println(student.getCode());
//		System.out.println(student.getGithubUser());
		assertEquals(200, response.getStatus());
	}

	@Test
	public void sePidenLasAsignaciones() {
		ClientResponse response = new StudentController().getAssignments();
		// List<Assignment> assignments =
		// JSONParser.parseAssignments(response.getEntity(String.class));
		// System.out.println(assignments.get(0).getTitle());
		// System.out.println(assignments.get(0).getDescription());
		// System.out.println(assignments.get(0).getGrade());
		assertEquals(200, response.getStatus());
	}
}
