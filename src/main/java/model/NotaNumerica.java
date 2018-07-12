package model;

public class NotaNumerica implements Nota {
	private Double valor;
	public NotaNumerica(Double valor) {
		this.valor = valor;
	}
	@Override
	public boolean aprobada() {
		return valor >= 6;
	}
	@Override
	public String valorTexto() {
		return this.valor.toString();
	}
}
