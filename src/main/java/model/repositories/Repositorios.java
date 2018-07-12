package model.repositories;

public class Repositorios {
	public static EstudiantesRepository estudiantes = new EstudiantesRepository();
	public static EstudiantesRepository estudiantes() {
		return estudiantes;
	}
}
