package model;

public enum PantallaTouchscreen {
	Daniado,
	NoDaniado;
	
	public Boolean isa(PantallaTouchscreen data) {
		return this.toString() == data.toString();
	}
}
