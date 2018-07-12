package model;

import model.repositories.EstudiantesRepository;
import model.repositories.Repositorios;

public class Fixture {
	public static void initialize() {
		// Agregar algunos estudiantes ejemplo
		EstudiantesRepository repoEstudiantes = Repositorios.estudiantes();

		Tarea parcialDDS = new Tarea("1° Parcial - Diseño");
		Tarea tpGDD = new Tarea("Trabaoj Practico - Gestión");

		Estudiante juan = new Estudiante("juan", "1589386", "1234abcd", "juancuiule");

		juan.agregarTarea(parcialDDS);
		parcialDDS.agregarNota(new NotaNumerica(6.0));

		juan.agregarTarea(tpGDD);
		tpGDD.agregarNota(new NotaConceptual("R"));
		tpGDD.agregarNota(new NotaConceptual("B-"));

		// No puedo agregar notas así porque al ser observable dispara eventos que
		// rompen todo...
		// parcialJuan.agregarNota(new Nota<Double>(6.0));
		// tpJuan.agregarNota(new Nota<String>("R"));
		// tpJuan.agregarNota(new Nota<String>("B-"));

		repoEstudiantes.agregar(juan);
	}

}
