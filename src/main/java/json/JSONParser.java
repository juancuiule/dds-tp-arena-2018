package json;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.ConceptualGrade;
import model.Grade;
import model.NumericGrade;

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
		RuntimeTypeAdapterFactory<Grade> typeFactory = RuntimeTypeAdapterFactory
				.of(Grade.class, "type")
				.registerSubtype(ConceptualGrade.class)
				.registerSubtype(NumericGrade.class);

		Gson gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();
		return gson;
	}
}