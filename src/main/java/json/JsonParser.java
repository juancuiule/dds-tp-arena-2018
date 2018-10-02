package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParser {
	public static <T> T objetoDesdeString(String jsonString, Class<T> claseDeObjeto) {
		Gson gson = generarGson();
		T jsonToObject = gson.fromJson(jsonString, claseDeObjeto);
		return jsonToObject;
	}

	private static Gson generarGson() {
		Gson gson = new GsonBuilder().create();
		return gson;
	}
}