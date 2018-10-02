package model;

import java.util.List;
import java.util.Optional;

import model.repositories.Repositorios;

public class Auth {
	static public Boolean loginEstudiante(String code, String password) {
		List<Student> estudiantes = Repositorios.estudiantes.all();

		Optional<Student> posibleEstudiante = estudiantes.stream().filter(
				estudiante -> estudiante.getCode().equals(code) && estudiante.getPassword().equalsIgnoreCase(password))
				.findFirst();

		// Devuelve true si encuentra un usuario con esa combinacion legajo/password
		return posibleEstudiante.isPresent();
	}
}
