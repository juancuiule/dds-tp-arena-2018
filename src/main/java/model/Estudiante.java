 package model;

public class Estudiante {

	private String nombre;
	private String legajo;
	private String password;
	private String usuarioGithub;

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

	public boolean suLegajoEs(String legajoComparar) {
		return this.legajo.equals(legajoComparar);
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
}