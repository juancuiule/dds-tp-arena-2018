package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.Estudiante;
import model.exceptions.NoHayEstudianteException;
import model.repositories.Repositorios;

@Observable
public class PerfilViewModel {
	private Estudiante estudiante;

	private String nombreInput;
	private String legajoInput;
	private String usuarioGithubInput;
	private String passwordInput;
	private String passwordConfirmationInput;

	public PerfilViewModel(String legajoEstudiante) {
		try {
			this.estudiante = Repositorios.estudiantes().findByLegajo(legajoEstudiante);
			this.nombreInput = this.estudiante.getNombre();
			this.legajoInput = this.estudiante.getLegajo();
			this.usuarioGithubInput = this.estudiante.getUsuarioGithub();
			this.passwordInput = this.estudiante.getPassword();
			this.passwordConfirmationInput = this.estudiante.getPassword();
		} catch (NoHayEstudianteException e) {
			System.out.println(e.toString());
		}
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getNombreInput() {
		return nombreInput;
	}

	public void setNombreInput(String nombreInput) {
		this.nombreInput = nombreInput;
	}

	public String getLegajoInput() {
		return legajoInput;
	}

	public void setLegajoInput(String legajoInput) {
		this.legajoInput = legajoInput;
	}

	public String getUsuarioGithubInput() {
		return usuarioGithubInput;
	}

	public void setUsuarioGithubInput(String usuarioGithubInput) {
		this.usuarioGithubInput = usuarioGithubInput;
	}

	public String getPasswordInput() {
		return passwordInput;
	}

	public void setPasswordInput(String passwordInput) {
		this.passwordInput = passwordInput;
	}

	public String getPasswordConfirmationInput() {
		return passwordConfirmationInput;
	}

	public void setPasswordConfirmationInput(String passwordConfirmationInput) {
		this.passwordConfirmationInput = passwordConfirmationInput;
	}

	public void guardar() {
		if (passwordInput.equals(passwordConfirmationInput)) {
			this.estudiante.setNombre(nombreInput);
			this.estudiante.setLegajo(legajoInput);
			this.estudiante.setUsuarioGithub(usuarioGithubInput);
			this.estudiante.setPassword(passwordInput);
		} else {
			System.out.println("No coinciden las contraseñas");
		}

	}
}
