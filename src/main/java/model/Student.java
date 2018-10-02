package model;

public class Student {

	private String firstName;
	private String lastName;
	private String code;
	private String githubUser;
	private String password;

	public Student(String firstName, String lastName, String code, String githubUser, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.code = code;
		this.githubUser = githubUser;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGithubUser() {
		return githubUser;
	}

	public void setGithubUser(String githubUser) {
		this.githubUser = githubUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}