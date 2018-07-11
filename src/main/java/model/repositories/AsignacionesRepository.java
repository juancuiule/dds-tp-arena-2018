package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import model.Asignacion;

public class AsignacionesRepository {

	private List<Asignacion> asignaciones = new LinkedList<>();

	public void agregar(Asignacion asignacion) {
		this.asignaciones.add(asignacion);
	}

	public List<Asignacion> all() {
		return asignaciones;
	}

	public Stream<Asignacion> asignacionesPara(String legajoEstudiante) {
		return asignaciones.stream().filter((Asignacion asignacion) -> asignacion.esDe(legajoEstudiante));
	}
}