package model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.TransactionalAndObservable;


@Observable
public class Tarea {
	String titulo;
	List<Nota> notas = new ArrayList<Nota>();
	Nota ultimaNota;
	
	public Tarea(String titulo) {
		this.titulo = titulo;
	}

	public void agregarNota(Nota nota) {
		this.notas.add(nota);
		ultimaNota = nota;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public boolean aprobada() {
		return this.ultimaNota.aprobada();
	}
	
	public String getAprobada() {
		return this.aprobada() ? "Si" : "No";
	}
}