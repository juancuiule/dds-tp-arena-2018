package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.ConceptualGrade;
import model.Grade;
import model.NumericGrade;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

	private Gson gson = JSONParser.generarGson();

	@Override
	public String render(Object model) {
		return gson.toJson(model);
	}
}