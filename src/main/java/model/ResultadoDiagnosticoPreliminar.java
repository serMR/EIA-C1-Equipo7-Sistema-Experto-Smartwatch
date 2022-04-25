package model;

public enum ResultadoDiagnosticoPreliminar {

	BateriaBaja,
	VoltajeInsuficiente,
	PinCargaDaniado,
	NoDeterminado;
	
	public Boolean isa(ResultadoDiagnosticoPreliminar data) {
		return this.toString() == data.toString();
	}

}
