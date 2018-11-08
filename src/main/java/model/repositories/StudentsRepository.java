package model.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import model.Assignment;
import model.Student;
import model.exceptions.StudentNotFoundException;

public class StudentsRepository {

	private List<Student> students = new ArrayList<Student>();

	public void agregar(Student student) {
		this.students.add(student);
	}

	public List<Student> all() {
		return students;
	}

	public Student findByCode(String code) throws StudentNotFoundException {
		Optional<Student> maybeStudent = this.students.stream().filter(student -> student.getCode().equals(code))
				.findFirst();
		if (maybeStudent.isPresent()) {
			return maybeStudent.get();
		} else {
			throw new StudentNotFoundException("No se encontre un estudiante con legajo: " + code);
		}
	}
	
	public void updateStudent(Student student) {
		Student prev = this.students.stream().filter(s -> s.getCode().equals(student.getCode())).findFirst().get();
		List<Assignment> prevAssignments = prev.getAssignments();
		student.setAssignments(prevAssignments);
		Collections.replaceAll(this.students, prev, student);
	}
}