package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Asignacion {
	private Estudiante estudiante;
	private Tarea tarea;
	private List<Nota> notas;

	public Asignacion(Estudiante estudiante, Tarea tarea, List<Nota> notas) {
		this.estudiante = estudiante;
		this.tarea = tarea;
		this.notas = notas;
	}

	public void agregarNota(Nota nota) {
		this.notas.add(nota);
	}

	public boolean esDe(String legajoEstudiante) {
		return this.estudiante.getCode().equals(legajoEstudiante);
	}

	public String getNota() {
		// Esto podría filtrarse por ultima fecha si es necesario...
		return this.notas.get(this.notas.size() - 1).valorTexto();
	}

	public boolean aprobada() {
		return this.notas.stream().anyMatch(nota -> nota.aprobada());
	}

	public String getAprobada() {
		return this.aprobada() ? "Si" : "No";
	}

	public String getTitulo() {
		return this.tarea.titulo();
	}
}