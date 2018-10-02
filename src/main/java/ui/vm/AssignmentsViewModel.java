package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Assignment;
import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Respositories;

@Observable
public class AssignmentsViewModel {
	private String legajoEstudiante;
	
	public AssignmentsViewModel(String legajoEstudiante) {
		this.legajoEstudiante = legajoEstudiante;
	}
	
	public List<Assignment> getAsignacionesDelEstudiante() {
		return Respositories.asignaciones.asignacionesPara(legajoEstudiante);
	}
}
