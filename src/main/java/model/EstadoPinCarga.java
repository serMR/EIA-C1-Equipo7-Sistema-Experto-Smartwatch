package model;

public enum EstadoPinCarga {

	Normal,
	Daniado;
	
	public Boolean isa(EstadoPinCarga data) {
		return this.toString() == data.toString();
	}

}
