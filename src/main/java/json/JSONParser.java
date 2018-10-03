package json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import model.Assignment;
import model.ConceptualGrade;
import model.Grade;
import model.NumericGrade;
import model.Student;

public class JSONParser {
	public static <T> T objetoDesdeString(String jsonString, Class<T> claseDeObjeto) {
		Gson gson = generarGson();
		T jsonToObject = gson.fromJson(jsonString, claseDeObjeto);
		return jsonToObject;
	}

	private static Gson generarGson() {
		Gson gson = new GsonBuilder().create();
		return gson;
	}

	private static JsonObject jsonStringToObject(String jsonString) {
		JsonElement jelement = new JsonParser().parse(jsonString);
		JsonObject jobject = jelement.getAsJsonObject();
		return jobject;
	}

	public static Student parseStudent(String jsonString) {
		JsonObject student = JSONParser.jsonStringToObject(jsonString);
		String firstName = student.get("first_name").getAsString();
		String lastName = student.get("last_name").getAsString();
		String githubUser = student.get("github_user").getAsString();
		String code = student.get("code").getAsString();
		return new Student(firstName, lastName, code, githubUser, "");
	}

	public static List<Assignment> parseAssignments(String jsonString) {
		JsonObject object = JSONParser.jsonStringToObject(jsonString);
		JsonArray assignments = object.getAsJsonArray("assignments");
		List<Assignment> assignmentsList = new ArrayList<Assignment>();
		assignments.forEach(assignment -> {
			Assignment assignmentObject = JSONParser.parseAssignment(assignment.getAsJsonObject());
			assignmentsList.add(assignmentObject);
		});
		return assignmentsList;
	}

	public static Assignment parseAssignment(JsonObject assignment) {
		String title = assignment.get("title").getAsString();
		String description = assignment.get("description").getAsString();
		JsonArray grades = assignment.getAsJsonArray("grades");
		List<Grade> gradesList = new ArrayList<Grade>();
		grades.forEach(grade -> {
			Grade gradeObject = JSONParser.parseGrade(grade.getAsJsonObject());
			gradesList.add(gradeObject);
		});
		return new Assignment(title, description, gradesList);
	}

	public static Grade parseGrade(JsonObject grade) {
		try {
			Double value = grade.get("value").getAsDouble();
			return new NumericGrade(value);
		} catch (NumberFormatException e) {
			String concepto = grade.get("value").getAsString();
			return new ConceptualGrade(concepto);
		}
	}
}