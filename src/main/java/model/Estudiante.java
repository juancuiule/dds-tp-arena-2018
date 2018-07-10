package model;

public class Estudiante {

	String nombre;
	String legajo;
	String password;
	String usuarioGithub;

	public Estudiante(String nombre, String legajo, String password, String usuarioGithub) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.password = password;
		this.usuarioGithub = usuarioGithub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getUsuarioGithub() {
		return usuarioGithub;
	}

	public void setUsuarioGithub(String usuarioGithub) {
		this.usuarioGithub = usuarioGithub;
	}

	public boolean esCorrecto(String legajo, String password) {
		return legajo == this.legajo && password == this.password;
	}
}