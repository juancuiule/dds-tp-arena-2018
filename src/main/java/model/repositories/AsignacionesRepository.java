package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Asignacion;
import model.StudentController;
import json.JsonParser;

public class AsignacionesRepository {

	private List<Asignacion> asignaciones = new LinkedList<>();

	public void agregar(Asignacion asignacion) {
		this.asignaciones.add(asignacion);
	}

	public List<Asignacion> all() {
		return asignaciones;
	}

	public List<Asignacion> asignacionesPara(String legajoEstudiante) {
		String response = new StudentController().getAssignments().getEntity(String.class);
		System.out.println(response);
//		AsignacionList x = JsonParser.objetoDesdeString(response, AsignacionList.class);
//  	System.out.println(x.getAssignments().get(0).getTitulo());
		return asignaciones.stream().filter((Asignacion asignacion) -> asignacion.esDe(legajoEstudiante)).collect(Collectors.toList());
	}
}