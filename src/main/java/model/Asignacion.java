package model;

import java.util.List;
import java.util.stream.Stream;

public class Asignacion {
	Estudiante estudiante;
	Tarea tarea;
	List<Nota> notas;
	
	public Asignacion(Estudiante estudiante, Tarea tarea) {
		this.estudiante = estudiante;
		this.tarea = tarea;
	}
	
	public void agregarNota(Nota nota) {
		this.notas.add(nota);
	}
	
	public Stream<String> getNotas() {
		return notas.stream().map((Nota nota) -> nota.toString());
	}
}