package ui.vm;

import java.util.List;
import org.uqbar.commons.utils.Observable;

import model.Auth;
import model.Estudiante;
import model.repositories.Repositorios;

@Observable
public class InicioDeSesionViewModel {

	private List<Estudiante> estudiantes;
	private String loginLegajo;
	private String loginPassword;

	public InicioDeSesionViewModel() {
		this.estudiantes = Repositorios.estudiantes.all();
	}

	public String getLoginLegajo() {
		return loginLegajo;
	}

	public void setLoginLegajo(String loginLegajo) {
		this.loginLegajo = loginLegajo;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public boolean login() {
		Boolean loginCorrecto = Auth.loginEstudiante(loginLegajo.toString(), loginPassword.toString());
		Boolean loginAManoCorrecto = Auth.loginEstudiante("1589386", "1234abcd");
		System.out.println(loginCorrecto);
		System.out.println(loginAManoCorrecto);
		return loginAManoCorrecto;
	}
}