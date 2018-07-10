package model;

import model.repositories.EstudiantesRepository;
import model.repositories.Repositorios;

public class Fixture {
	public static void initialize() {
		// Agregar algunos estudiantes ejemplo
		EstudiantesRepository repoEstudiantes = Repositorios.estudiantes();
		
		Estudiante juan = new Estudiante("juan", "1589386", "1234abcd", "juancuiule");
		
		repoEstudiantes.agregar(juan);
	}

}
