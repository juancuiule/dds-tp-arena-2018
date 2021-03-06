package modelTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Auth;
import model.Student;
import model.repositories.StudentsRepository;
import model.repositories.Respositories;


public class AuthTest {
	StudentsRepository repoEstudiantes;

	@Before
	public void fixture() {
		repoEstudiantes = Respositories.estudiantes();
		Student juan = new Student("1589386", "Juan Ignacio", "Cuiule", "1234abcd", "juancuiule");
		repoEstudiantes.agregar(juan);
	}
	
//	@Test
//	public void unEstudianteSeLoguea() {
//		assertTrue(Auth.loginEstudiante("1589386", "1234abcd"));
//	}
	
	@Test
	public void unEstudianteNoSeLogueaPorPasswordIncorrecta() {
		assertFalse(Auth.loginEstudiante("1589386", "12345678"));
	}
	
	@Test
	public void intentoFallidoDeLoginCuandoNoExisteEstudiante() {
		assertFalse(Auth.loginEstudiante("1111111", "111"));
	}
}
