package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tarea {
	String titulo;

	public Tarea(String titulo) {
		this.titulo = titulo;
	}

	public boolean estaAprobada(Double nota) {
		return nota >= 6;
	}

	public boolean estaAprobada(String concepto) {
		List<String> conceptosAprobados = new ArrayList<String>(Arrays.asList("R+", "B-", "B", "B+", "MB"));
		return conceptosAprobados.contains(concepto);
	}
}