package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import model.Student;
import model.exceptions.StudentNotFoundException;

public class StudentsRepository {

	private List<Student> students = new LinkedList<>();

	public void agregar(Student student) {
		this.students.add(student);
	}

	public List<Student> all() {
		return students;
	}

	public Student findByCode(String code) throws StudentNotFoundException {
		Optional<Student> maybeStudent = this.students.stream()
				.filter(student -> student.getCode().equals(code)).findFirst();
		if (maybeStudent.isPresent()) {
			return maybeStudent.get();
		} else {
			throw new StudentNotFoundException("No se encontre un estudiante con legajo: " + code);
		}
	}
}