package model;

public enum PantallaEstado {
	Prendida,
	Apagado;
	
	public Boolean isa(PantallaEstado data) {
		return this.toString() == data.toString();
	}
}
