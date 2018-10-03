package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Assignment;
import model.StudentController;

@Observable
public class AssignmentsViewModel {
	private String legajoEstudiante;
	
	public AssignmentsViewModel(String legajoEstudiante) {
		this.legajoEstudiante = legajoEstudiante;
	}
	
	public List<Assignment> getAsignacionesDelEstudiante() {
		return new StudentController().getAssignments();
		// return Respositories.asignaciones.asignacionesPara(legajoEstudiante);
	}
}
