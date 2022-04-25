package model;

public enum DiferencialPotencialCargador {
	Optimo,
	Deficiente,
	NoDeterminado;
	
	public Boolean isa(DiferencialPotencialCargador data) {
		return this.toString() == data.toString();
	}
}
