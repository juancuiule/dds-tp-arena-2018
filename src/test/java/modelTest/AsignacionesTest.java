package modelTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Assignment;
import model.Student;
import model.Grade;
import model.ConceptualGrade;
import model.NumericGrade;

public class AsignacionesTest {
	Student juan;
	List<Grade> notasParcial;
	Assignment parcialJuan;

	List<Grade> notasTP;
	Assignment tpJuan;

	@Before
	public void fixture() {
		juan = new Student("Juan", "Cuiule", "1589386", "juancuiule", "1234abcd");

		notasParcial = new ArrayList<Grade>(Arrays.asList(new NumericGrade(6.0)));
		parcialJuan = new Assignment("Primer Parcial", "parcial primer cuatrimestre", notasParcial);

		notasTP = new ArrayList<Grade>(Arrays.asList(new ConceptualGrade("R")));
		tpJuan = new Assignment("TP GDD", "trabajo practico segundo cuatrimestre 2018", notasTP);
	}

	@Test
	public void elParcialEstaAprobado() {
		assertTrue(parcialJuan.approved());
	}

	@Test
	public void elTpNoEstaAprobado() {
		assertFalse(tpJuan.approved());
	}

	@Test
	public void elTpPasaAEstarAprobado() {
		tpJuan.agregarNota(new ConceptualGrade("B-"));
		assertTrue(tpJuan.approved());
	}
}
