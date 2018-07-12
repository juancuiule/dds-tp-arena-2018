package model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	String nombre;
	String legajo;
	String password;
	String usuarioGithub;
	List<Tarea> tareas = new ArrayList<Tarea>();

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

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public void agregarTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

	public boolean suLegajoEs(String legajoComparar) {
		return this.legajo.equals(legajoComparar);
	}
}