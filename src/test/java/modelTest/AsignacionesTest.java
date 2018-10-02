//package modelTest;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import com.sun.jersey.api.client.ClientResponse;
//
//import json.JSONParser;
//import model.Assignment;
//import model.Estudiante;
//import model.Grade;
//import model.NotaConceptual;
//import model.NotaNumerica;
//import model.StudentController;
//
//public class AsignacionesTest {
//	Estudiante juan;
//	List<Grade> notasParcial;
//	Assignment parcialJuan;
//
//	List<Grade> notasTP;
//	Assignment tpJuan;
//
//	@Before
//	public void fixture() {
////		parcialDDS = new Tarea("1° Parcial - Diseño");
////		tpGDD = new Tarea("Trabaoj Practico - Gestión");
//
//		juan = new Estudiante("1589386", "Juan", "Cuiule", "juancuiule", "1234abcd");
//
//		notasParcial = new ArrayList<Grade>(Arrays.asList(new NotaNumerica(6.0)));
//		parcialJuan = new Asignacion("Primer", notasParcial);
//
//		notasTP = new ArrayList<Nota>(Arrays.asList(new NotaConceptual("R")));
//		tpJuan = new Asignacion(juan, tpGDD, notasTP);
//	}
//
//	@Test
//	public void elParcialEstaAprobado() {
//		assertTrue(parcialJuan.aprobada());
//	}
//
//	@Test
//	public void elTpNoEstaAprobado() {
//		assertFalse(tpJuan.aprobada());
//	}
//
//	@Test
//	public void elTpPasaAEstarAprobado() {
//		tpJuan.agregarNota(new NotaConceptual("B-"));
//		assertTrue(tpJuan.aprobada());
//	}
//
//	@Test
//	public void requestStudent() {
//		ClientResponse response = new StudentController().getStudent();
//		//Estudiante x = JsonParser.objetoDesdeString(response.getEntity(String.class), Estudiante.class);
//		assertEquals(200, response.getStatus());
//	}
//
//	@Test
//	public void requestAssigments() {
//		ClientResponse response = new StudentController().getAssignments();
//		String x = JSONParser.parseAssignments(response.getEntity(String.class));
//		assertEquals(200, response.getStatus());
//		System.out.println(x);
//	}
//}
