package model;

import model.repositories.StudentsRepository;
import model.repositories.Respositories;

public class Fixture {
	public static void initialize() {
		// Agregar algunos estudiantes ejemplo
		StudentsRepository repoEstudiantes = Respositories.estudiantes();
//		AsignacionesRepository repoAsignaciones = Repositorios.asignaciones();
//
//		Tarea parcialDDS = new Tarea("1° Parcial - Diseño");
//		Tarea tpGDD = new Tarea("Trabjo Practico - Gestión");
//		Tarea parcialSuperior = new Tarea("Parcial - Matematica Superior");

		Student juan = new Student("Juan", "Cuiule", "1589386", "juancuiule", "1234abcd");

//		List<Nota> notasParcial = new ArrayList<Nota>(Arrays.asList(new NotaNumerica(6.0)));
//		Asignacion parcialJuan = new Asignacion(juan, parcialDDS, notasParcial);
//
//		List<Nota> notasTP = new ArrayList<Nota>(Arrays.asList(new NotaConceptual("R"), new NotaConceptual("B-")));
//		Asignacion tpJuan = new Asignacion(juan, tpGDD, notasTP);
//		
//		List<Nota> notasParcialSuperior = new ArrayList<Nota>(Arrays.asList(new NotaNumerica(2.0), new NotaNumerica(1.0)));
//		Asignacion parcialSuperiorJuan = new Asignacion(juan, parcialSuperior, notasParcialSuperior);

		repoEstudiantes.agregar(juan);
//		repoAsignaciones.agregar(tpJuan);
//		repoAsignaciones.agregar(parcialJuan);
//		repoAsignaciones.agregar(parcialSuperiorJuan);
	}

}
