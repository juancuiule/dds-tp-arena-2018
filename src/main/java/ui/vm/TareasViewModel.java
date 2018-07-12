package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Tarea;
import model.Estudiante;
import model.exceptions.NoHayEstudianteException;
import model.repositories.Repositorios;

@Observable
public class TareasViewModel {
	Estudiante estudiante;

	public TareasViewModel(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public List<Tarea> getTareas() {
		return this.estudiante.tareas();
	}
}
