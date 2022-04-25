package model;

public enum SOArranque {

	Normal,
	Tildado;
	
	public Boolean isa(SOArranque data) {
		return this.toString() == data.toString();
	}
}
