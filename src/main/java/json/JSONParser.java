package json;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONParser {
	public static <T> T fromJson(String jsonString, Class<T> claseDeObjeto) {
		Gson gson = generarGson();
		T jsonToObject = gson.fromJson(jsonString, claseDeObjeto);
		return jsonToObject;
	}
	
	public static <T> T fromJson(String jsonString, Type typeDeObjeto) {
		Gson gson = generarGson();
		T jsonToObject = gson.fromJson(jsonString, typeDeObjeto);
		return jsonToObject;
	}

	public static String toJson(Object any) {
		Gson gson = generarGson();
		return gson.toJson(any);
	}

	private static Gson generarGson() {
		Gson gson = new GsonBuilder().create();
		return gson;
	}

//	public static List<Assignment> parseAssignments(String jsonString) {
//		JsonObject object = JSONParser.jsonStringToObject(jsonString);
//		JsonArray assignments = object.getAsJsonArray("assignments");
//		List<Assignment> assignmentsList = new ArrayList<Assignment>();
//		assignments.forEach(assignment -> {
//			Assignment assignmentObject = JSONParser.parseAssignment(assignment.getAsJsonObject());
//			assignmentsList.add(assignmentObject);
//		});
//		return assignmentsList;
//	}
//
//	public static Assignment parseAssignment(JsonObject assignment) {
//		String title = assignment.get("title").getAsString();
//		String description = assignment.get("description").getAsString();
//		JsonArray grades = assignment.getAsJsonArray("grades");
//		List<Grade> gradesList = new ArrayList<Grade>();
//		grades.forEach(grade -> {
//			Grade gradeObject = JSONParser.parseGrade(grade.getAsJsonObject());
//			gradesList.add(gradeObject);
//		});
//		return new Assignment(title, description, gradesList);
//	}
//
//	public static Grade parseGrade(JsonObject grade) {
//		try {
//			Double value = grade.get("value").getAsDouble();
//			return new NumericGrade(value);
//		} catch (NumberFormatException e) {
//			String concepto = grade.get("value").getAsString();
//			return new ConceptualGrade(concepto);
//		}
//	}
//	
//	public static String studentToJson(Student student) {
//    	return "{"
//		+ "\"code\": \"" + student.getCode() + "\","
//		+ "\"first_name\":\"" + student.getFirstName() + "\","
//		+ "\"last_name\":\"" + student.getLastName() + "\","
//		+ "\"github_user\":\"" + student.getGithubUser() + "\"}";
//	}
}