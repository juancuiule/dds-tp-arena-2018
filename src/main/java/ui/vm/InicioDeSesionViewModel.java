package ui.vm;

import java.util.List;
import org.uqbar.commons.utils.Observable;

import model.Auth;
import model.Estudiante;
import model.repositories.Repositorios;

@Observable
public class InicioDeSesionViewModel {

	private List<Estudiante> estudiantes;
	private String legajo;
	private String password;

	public InicioDeSesionViewModel() {
		this.estudiantes = Repositorios.estudiantes.all();
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login() {
		Boolean loginCorrecto = Auth.loginEstudiante(this.getLegajo(), this.getPassword());
		return loginCorrecto;
	}
}