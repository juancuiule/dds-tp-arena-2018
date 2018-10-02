package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Assignment;

public class AsignacionesRepository {

	private List<Assignment> assignments = new LinkedList<>();

	public void agregar(Assignment asignacion) {
		this.assignments.add(asignacion);
	}

	public List<Assignment> all() {
		return assignments;
	}

	public List<Assignment> asignacionesPara(String code) {
//		String response = new StudentController().getAssignments().getEntity(String.class);
//		System.out.println(response);
		return assignments;
	}
}