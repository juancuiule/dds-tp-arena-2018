package model.exceptions;

public class StudentNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String errorMsg) {
		super(errorMsg);
	}
}
