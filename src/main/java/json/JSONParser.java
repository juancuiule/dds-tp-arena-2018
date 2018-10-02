package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
	
	public static String parseAssignments(String jsonLine) {
	    JsonElement jelement = new JsonParser().parse(jsonLine);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    System.out.println(jobject);
	    JsonArray assignments = jobject.getAsJsonArray("assignments");
	    JsonObject assignment = assignments.get(0).getAsJsonObject();
	    String result = assignment.get("title").getAsString();
	    return result;
	}
	
	public static String parseAssignment(JsonObject assignment) {
		String title = assignment.get("title").getAsString(); 
		String description = assignment.get("description").getAsString();
		JsonArray grades = assignment.getAsJsonArray("grades");
		return "";
	}
}