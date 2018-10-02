package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Respositories;

@Observable
public class DashboardViewModel {
	private	Student estudiante;
	public DashboardViewModel(String legajoEstudiante) {
		try {
			this.estudiante = Respositories.estudiantes().findByCode(legajoEstudiante);
		} catch (StudentNotFoundException e) {
			System.out.println(e.toString());
		}
		
	}
	public Student estudiante() {
		return estudiante;
	}
	public String getLegajo() {
		return this.estudiante.getCode();
	}
}