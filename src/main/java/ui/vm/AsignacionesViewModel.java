package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Assignment;
import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Repositorios;

@Observable
public class AsignacionesViewModel {
	private String legajoEstudiante;
	
	public AsignacionesViewModel(String legajoEstudiante) {
		this.legajoEstudiante = legajoEstudiante;
	}
	
	public List<Assignment> getAsignacionesDelEstudiante() {
		return Repositorios.asignaciones.asignacionesPara(legajoEstudiante);
	}
}
