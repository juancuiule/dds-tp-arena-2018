package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.Student;
import model.exceptions.StudentNotFoundException;
import model.repositories.Repositorios;

@Observable
public class PerfilViewModel {
	private Student student;

	private String firstNameInput;
	private String lastNameInput;
	private String codeInput;
	private String githubUserInput;
	private String passwordInput;
	private String passwordConfirmationInput;

	public PerfilViewModel(String code) {
		try {
			this.student = Repositorios.estudiantes().findByCode(code);
			this.firstNameInput = this.student.getFirstName();
			this.lastNameInput = this.student.getLastName();
			this.codeInput = this.student.getCode();
			this.githubUserInput = this.student.getGithubUser();
			this.passwordInput = this.student.getPassword();
			this.passwordConfirmationInput = this.student.getPassword();
		} catch (StudentNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getFirstNameInput() {
		return firstNameInput;
	}

	public void setFirstNameInput(String firstNameInput) {
		this.firstNameInput = firstNameInput;
	}

	public String getLastNameInput() {
		return lastNameInput;
	}

	public void setLastNameInput(String lastNameInput) {
		this.lastNameInput = lastNameInput;
	}

	public String getCodeInput() {
		return codeInput;
	}

	public void setCodeInput(String codeInput) {
		this.codeInput = codeInput;
	}

	public String getGithubUserInput() {
		return githubUserInput;
	}

	public void setGithubUserInput(String githubUserInput) {
		this.githubUserInput = githubUserInput;
	}

	public String getPasswordInput() {
		return passwordInput;
	}

	public void setPasswordInput(String passwordInput) {
		this.passwordInput = passwordInput;
	}

	public String getPasswordConfirmationInput() {
		return passwordConfirmationInput;
	}

	public void setPasswordConfirmationInput(String passwordConfirmationInput) {
		this.passwordConfirmationInput = passwordConfirmationInput;
	}

	public void save() {
		if (passwordInput.equals(passwordConfirmationInput)) {
			this.student.setFirstName(firstNameInput);
			this.student.setLastName(lastNameInput);
			this.student.setCode(codeInput);
			this.student.setGithubUser(githubUserInput);
			this.student.setPassword(passwordInput);
		} else {
			System.out.println("No coinciden las contraseņas");
		}

	}
}
