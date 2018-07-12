package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotaConceptual implements Nota {
	private String concepto;
	public NotaConceptual(String concepto) {
		this.concepto = concepto;
	}
	@Override
	public boolean aprobada() {
		List<String> conceptosAprobados = new ArrayList<String>(Arrays.asList("R+", "B-", "B", "B+", "MB"));
		return conceptosAprobados.contains(concepto);
	}
	@Override
	public String valorTexto() {
		return this.concepto;
	}
}
