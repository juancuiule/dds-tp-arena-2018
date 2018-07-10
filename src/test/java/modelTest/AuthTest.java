package modelTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Auth;
import model.Estudiante;
import model.repositories.EstudiantesRepository;
import model.repositories.Repositorios;


public class AuthTest {
	EstudiantesRepository repoEstudiantes;

	@Before
	public void fixture() {
		repoEstudiantes = Repositorios.estudiantes();
		Estudiante juan = new Estudiante("juan", "1589386", "1234abcd", "juancuiule");
		repoEstudiantes.agregar(juan);
	}
	
	@Test
	public void unEstudianteSeLoguea() {
		assertTrue(Auth.loginEstudiante("1589386", "1234abcd"));
	}
	
	@Test
	public void unEstudianteNoSeLogueaPorPasswordIncorrecta() {
		assertFalse(Auth.loginEstudiante("1589386", "12345678"));
	}
	
	@Test
	public void intentoFallidoDeLoginCuandoNoExisteEstudiante() {
		assertFalse(Auth.loginEstudiante("1111111", "111"));
	}
}
