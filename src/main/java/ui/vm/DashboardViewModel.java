package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.Estudiante;
import model.exceptions.NoHayEstudianteException;
import model.repositories.Repositorios;

@Observable
public class DashboardViewModel {
	Estudiante estudiante;
	public DashboardViewModel(String legajoEstudiante) {
		try {
			this.estudiante = Repositorios.estudiantes().findByLegajo(legajoEstudiante);
		} catch (NoHayEstudianteException e) {
			System.out.println(e.toString());
		}
		
	}
	public Estudiante estudiante() {
		return estudiante;
	}
}