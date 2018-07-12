package modelTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Asignacion;
import model.Estudiante;
import model.Nota;
import model.NotaConceptual;
import model.NotaNumerica;
import model.Tarea;

public class AsignacionesTest {
	Tarea parcialDDS;
	Tarea tpGDD;
	Estudiante juan;
	List<Nota> notasParcial;
	Asignacion parcialJuan;

	List<Nota> notasTP;
	Asignacion tpJuan;
	
	@Before
	public void fixture() {
		parcialDDS = new Tarea("1° Parcial - Diseño");
		tpGDD = new Tarea("Trabaoj Practico - Gestión");
		
		juan = new Estudiante("juan", "1589386", "1234abcd", "juancuiule");

		notasParcial = new ArrayList<Nota>(Arrays.asList(new NotaNumerica(6.0)));
		parcialJuan = new Asignacion(juan, parcialDDS, notasParcial);

		notasTP = new ArrayList<Nota>(Arrays.asList(new NotaConceptual("R")));
		tpJuan = new Asignacion(juan, tpGDD, notasTP);
	}
	
	@Test
	public void elParcialEstaAprobado() {
		assertTrue(parcialJuan.aprobada());
	}
	
	@Test
	public void elTpNoEstaAprobado() {
		assertFalse(tpJuan.aprobada());
	}
	
	@Test
	public void elTpPasaAEstarAprobado() {
		tpJuan.agregarNota(new NotaConceptual("B-"));
		assertTrue(tpJuan.aprobada());
	}
}
