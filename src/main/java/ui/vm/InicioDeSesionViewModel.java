package ui.vm;

import java.util.List;
import org.uqbar.commons.utils.Observable;

import model.Auth;
import model.Estudiante;
import model.repositories.Repositorios;

@Observable
public class InicioDeSesionViewModel {

	private List<Estudiante> estudiantes;
	private String code;
	private String password;

	public InicioDeSesionViewModel() {
		this.estudiantes = Repositorios.estudiantes.all();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String legajo) {
		this.code = legajo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login() {
		Boolean loginCorrecto = Auth.loginEstudiante(this.getCode(), this.getPassword());
		return loginCorrecto;
	}
}