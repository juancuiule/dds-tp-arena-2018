package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import model.Estudiante;
import model.exceptions.NoHayEstudianteException;

public class EstudiantesRepository {

	private List<Estudiante> estudiantes = new LinkedList<>();

	public void agregar(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}

	public List<Estudiante> all() {
		return estudiantes;
	}

	public Estudiante findByLegajo(String legajo) throws NoHayEstudianteException {
		Optional<Estudiante> optionalEstudiante = this.estudiantes.stream()
				.filter(estudiante -> estudiante.getCode().equals(legajo)).findFirst();
		if (optionalEstudiante.isPresent()) {
			return optionalEstudiante.get();
		} else {
			throw new NoHayEstudianteException("No se encontre un estudiante con legajo: " + legajo);
		}
	}
}