package model.repositories;

public class Repositorios {
	public static EstudiantesRepository estudiantes = new EstudiantesRepository();
	public static AsignacionesRepository asignaciones = new AsignacionesRepository();
	public static EstudiantesRepository estudiantes() {
		return estudiantes;
	}
	public static AsignacionesRepository asignaciones() {
		return asignaciones;
	}
}
