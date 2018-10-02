package model.repositories;

public class Respositories {
	public static StudentsRepository estudiantes = new StudentsRepository();
	public static AssignmentsRepository asignaciones = new AssignmentsRepository();
	public static StudentsRepository estudiantes() {
		return estudiantes;
	}
	public static AssignmentsRepository asignaciones() {
		return asignaciones;
	}
}
