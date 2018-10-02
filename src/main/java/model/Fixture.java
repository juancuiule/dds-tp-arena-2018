package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.repositories.AsignacionesRepository;
import model.repositories.EstudiantesRepository;
import model.repositories.Repositorios;

public class Fixture {
	public static void initialize() {
		// Agregar algunos estudiantes ejemplo
		EstudiantesRepository repoEstudiantes = Repositorios.estudiantes();
//		AsignacionesRepository repoAsignaciones = Repositorios.asignaciones();
//
//		Tarea parcialDDS = new Tarea("1° Parcial - Diseño");
//		Tarea tpGDD = new Tarea("Trabjo Practico - Gestión");
//		Tarea parcialSuperior = new Tarea("Parcial - Matematica Superior");

		Estudiante juan = new Estudiante("1589386", "Juan", "Cuiule", "1234abcd", "juancuiule");

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
