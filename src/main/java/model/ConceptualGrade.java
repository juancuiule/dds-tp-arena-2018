package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConceptualGrade implements Grade {
	private String concept;
	public ConceptualGrade(String concepto) {
		this.concept = concepto;
	}
	@Override
	public boolean approved() {
		List<String> conceptosAprobados = new ArrayList<String>(Arrays.asList("R+", "B-", "B", "B+", "MB"));
		return conceptosAprobados.contains(concept);
	}
	@Override
	public String stringValue() {
		return concept;
	}
	public String getValue() {
		return concept;
	}
}
