package model;

public enum ResultadoDiagnosticoSensores {
	
	ModuloBluetoothDaniado,
	NoDeterminado;
	
	public Boolean isa(ResultadoDiagnosticoSensores data) {
		return this.toString() == data.toString();
	}
}
