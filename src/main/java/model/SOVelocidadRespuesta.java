package model;

public enum SOVelocidadRespuesta {

	Nula,
	Lenta,
	Normal;
	
	public Boolean isa(SOVelocidadRespuesta data) {
		return this.toString() == data.toString();
	}

}
