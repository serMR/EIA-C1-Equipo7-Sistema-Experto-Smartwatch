package model;

public enum ResultadoDiagnosticoPantalla {

	PantallaRota,
	TouchScreenDaniado,
	NoDeterminado;
	
	public Boolean isa(ResultadoDiagnosticoPantalla data) {
		return this.toString() == data.toString();
	}
}
