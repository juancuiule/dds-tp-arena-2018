package model;

public class Nota<T> {
	T nota;
	public Nota(T nota) {
		this.nota = nota;
	}
	public T getNota() {
		return this.nota;
	}
}