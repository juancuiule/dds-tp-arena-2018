package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Asignacion;

public class AsignacionesRepository {

	private List<Asignacion> asignaciones = new LinkedList<>();

	public void agregar(Asignacion asignacion) {
		this.asignaciones.add(asignacion);
	}

	public List<Asignacion> all() {
		return asignaciones;
	}

	public List<Asignacion> asignacionesPara(String legajoEstudiante) {
		return asignaciones.stream().filter((Asignacion asignacion) -> asignacion.esDe(legajoEstudiante)).collect(Collectors.toList());
	}
}