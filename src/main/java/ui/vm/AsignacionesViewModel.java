package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.Estudiante;
import model.exceptions.NoHayEstudianteException;
import model.repositories.Repositorios;

@Observable
public class AsignacionesViewModel {
	String legajoEstudiante;
	
	public AsignacionesViewModel() {
		this.legajoEstudiante = "1589386";
	}
}
