package model;

import java.util.List;
import java.util.Optional;

import model.repositories.Repositorios;

public class Auth {
	static public Boolean loginEstudiante(String legajo, String password) {
		List<Estudiante> estudiantes = Repositorios.estudiantes.all();
		System.out.println(estudiantes);
		Optional<Estudiante> posibleEstudiante = estudiantes.stream()
				.filter(estudiante -> estudiante.esCorrecto(legajo, password))
				.findFirst();
		System.out.println(posibleEstudiante);
		return posibleEstudiante.isPresent();
	}
}
