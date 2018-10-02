 package model;

public class Estudiante {

	private String first_name;
	private String last_name;
	private String code;
	private String github_user;
	private String password;
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGithub_user() {
		return github_user;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}
	
	public String getPassword() { return password; }
	
	public Estudiante() {}
	public Estudiante(String code, String first_name, String last_name, String password, String github_user) {
		this.code = code;
		this.first_name = first_name;
		this.last_name = last_name;
		this.github_user = github_user;
		this.password = password;
	}
}