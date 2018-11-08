package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Assignment;
import model.exceptions.StudentNotFoundException;

public class AssignmentsRepository {

	private List<Assignment> assignments = new LinkedList<>();

	public void agregar(Assignment asignacion) {
		this.assignments.add(asignacion);
	}

	public List<Assignment> all() {
		return assignments;
	}

	public List<Assignment> asignacionesPara(String code) {
		List<Assignment> assignmentsForStudent = null;
		try {
			assignmentsForStudent = Respositories.estudiantes().findByCode(code).getAssignments();
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assignmentsForStudent;
	}
}