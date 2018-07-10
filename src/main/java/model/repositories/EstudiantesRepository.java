package model.repositories;
import java.util.LinkedList;
import java.util.List;

import model.Estudiante;

public class EstudiantesRepository {

	private List<Estudiante> estudiantes = new LinkedList<>();

	public void agregar(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}

	public List<Estudiante> all() {
		return estudiantes;
	}

}
