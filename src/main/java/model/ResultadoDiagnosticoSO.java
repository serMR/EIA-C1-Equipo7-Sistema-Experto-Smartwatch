package model;

public enum ResultadoDiagnosticoSO {

	ErrorBooteoSistema,
	VelocidadLentaPorSaturacionMemoria,
	NoDeterminado;
	
	public Boolean isa(ResultadoDiagnosticoSO data) {
		return this.toString() == data.toString();
	}

}
