package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import json.JSONParser;
import model.Assignment;
import model.ConceptualGrade;
import model.NumericGrade;
import model.Student;

public class ParserTest {

	@Test
	public void testParseStudent() {
		String studentJson = "{ \"code\": \"1214731\", \"first_name\": \"Franco\", "
				+ "\"last_name\": \"Bulgarelli\", \"github_user\": \"flbulgarelli\" }";
		Student student = JSONParser.parseStudent(studentJson);
		assertEquals("1214731", student.getCode());
		assertEquals("Franco", student.getFirstName());
		assertEquals("Bulgarelli", student.getLastName());
		assertEquals("flbulgarelli", student.getGithubUser());
	}

	@Test
	public void testParseGrade_NumericGrade() {
		String gradeJson = "{"
				+ "\"value\": \"8\""
				+ "}";
		JsonObject gradeJsonObject = new JsonParser().parse(gradeJson).getAsJsonObject();
		NumericGrade grade = (NumericGrade) JSONParser.parseGrade(gradeJsonObject);
		assertEquals(new Double(8), grade.getValue());
	}

	@Test
	public void testParseGrade_ConceptualGrade() {
		String gradeJson = "{"
				+ "\"value\": \"B+\""
				+ "}";
		JsonObject gradeJsonObject = new JsonParser().parse(gradeJson).getAsJsonObject();
		ConceptualGrade grade = (ConceptualGrade) JSONParser.parseGrade(gradeJsonObject);
		assertEquals(new String("B+"), grade.getValue());
	}

	@Test
	public void testParseAssignment() {
		String assignmentJson = "{"
				+ "\"title\":\"Primer Parcial\","
				+ "\"description\":\"parcial del primer cuatrimestre\","
				+ "\"grades\": []"
				+ "}";
		JsonObject assignmentJsonObject = new JsonParser().parse(assignmentJson).getAsJsonObject();
		Assignment assignment = JSONParser.parseAssignment(assignmentJsonObject);
		assertEquals("Primer Parcial", assignment.getTitle());
		assertEquals("parcial del primer cuatrimestre", assignment.getDescription());
	}
	
	@Test
	public void testParseAssignmentConGradesAprueba() {
		String assignmentJson = "{"
				+ "\"title\":\"Primer Parcial\","
				+ "\"description\":\"parcial del primer cuatrimestre\","
				+ "\"grades\": [{"
				+ "\"value\": \"B+\""
				+ "}]"
				+ "}";
		JsonObject assignmentJsonObject = new JsonParser().parse(assignmentJson).getAsJsonObject();
		Assignment assignment = JSONParser.parseAssignment(assignmentJsonObject);
		assertEquals("Primer Parcial", assignment.getTitle());
		assertEquals("parcial del primer cuatrimestre", assignment.getDescription());
		assertEquals("B+", assignment.getGrade());
		assertEquals("Si", assignment.getApproved());
	}
	
	@Test
	public void testParseAssignmentConGradesDesaprueba() {
		String assignmentJson = "{"
				+ "\"title\":\"Primer Parcial\","
				+ "\"description\":\"parcial del primer cuatrimestre\","
				+ "\"grades\": [{"
				+ "\"value\": \"3\""
				+ "}]"
				+ "}";
		JsonObject assignmentJsonObject = new JsonParser().parse(assignmentJson).getAsJsonObject();
		Assignment assignment = JSONParser.parseAssignment(assignmentJsonObject);
		assertEquals("Primer Parcial", assignment.getTitle());
		assertEquals("parcial del primer cuatrimestre", assignment.getDescription());
		assertEquals("3.0", assignment.getGrade());
		assertEquals("No", assignment.getApproved());
	}
}
