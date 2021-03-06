package model;

import java.util.List;
import java.util.Optional;

import org.uqbar.commons.utils.Observable;

import com.ibm.icu.util.StringTrieBuilder.Option;

@Observable
public class Assignment {
	private String title;
	private String description;
	private List<Grade> grades;

	public Assignment(String title, String description, List<Grade> grades) {
		this.title = title;
		this.description = description;
		this.grades = grades;
	}

	public void agregarNota(Grade grade) {
		this.grades.add(grade);
	}

	public boolean approved() {
		return this.grades.stream().anyMatch(grade -> grade.approved());
	}

	public String getApproved() {
		return this.approved() ? "Si" : "No";
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getGrade() {
		try {
			return this.grades.get(this.grades.size() - 1).stringValue();
		} catch (Exception e) {
			return "Sin nota";
		}
	}
}