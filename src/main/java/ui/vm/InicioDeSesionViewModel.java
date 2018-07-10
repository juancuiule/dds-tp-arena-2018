package ui.vm;

import java.util.List;
import org.uqbar.commons.utils.Observable;

import model.Estudiante;
import model.repositories.Repositorios;

@Observable
public class InicioDeSesionViewModel {
	
	private List<Estudiante> estudiantes;

	public InicioDeSesionViewModel() {
		this.estudiantes = Repositorios.estudiantes.all();
	}

	public List<Estudiante> getPrendas() {
		return estudiantes;
	}
}