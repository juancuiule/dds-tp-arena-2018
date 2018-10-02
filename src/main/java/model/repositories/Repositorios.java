package model.repositories;

public class Repositorios {
	public static StudentsRepository estudiantes = new StudentsRepository();
	public static AsignacionesRepository asignaciones = new AsignacionesRepository();
	public static StudentsRepository estudiantes() {
		return estudiantes;
	}
	public static AsignacionesRepository asignaciones() {
		return asignaciones;
	}
}
