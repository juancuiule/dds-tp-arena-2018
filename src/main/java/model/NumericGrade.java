package model;

public class NumericGrade implements Grade {
	private Double value;
	public NumericGrade(Double value) {
		this.value = value;
	}
	@Override
	public boolean approved() {
		return value >= 6;
	}
	@Override
	public String stringValue() {
		return this.value.toString();
	}
}
