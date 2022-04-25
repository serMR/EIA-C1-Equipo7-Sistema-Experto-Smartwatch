package model;

public enum NivelBateria {
	NoDeterminado,
	Baja,
	Media,
	Alta;

	public Boolean isa(NivelBateria nivel) {
		return this.toString() == nivel.toString();
	}
}
