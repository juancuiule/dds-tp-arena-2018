package model;

import java.util.List;
import java.util.Optional;

import model.repositories.Repositorios;

public class Auth {
	static public Boolean loginEstudiante(String legajo, String password) {
		List<Estudiante> estudiantes = Repositorios.estudiantes.all();

		Optional<Estudiante> posibleEstudiante = estudiantes.stream()
				.filter(estudiante -> estudiante.getLegajo().equals(legajo)
						&& estudiante.getPassword().equalsIgnoreCase(password))
				.findFirst();

		// Devuelve true si encuentra un usuario con esa combinacion legajo/password
		return posibleEstudiante.isPresent();
	}
}
