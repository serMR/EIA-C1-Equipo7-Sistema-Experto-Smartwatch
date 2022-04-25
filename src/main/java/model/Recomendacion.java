package model;

public class Recomendacion {
	
	public DiagnosticoPantalla diagnosticoPantalla;
	public DiagnosticoPreliminar diagnosticoPreliminar;
	public DiagnosticoSensores diagnosticoSensores;
	public DiagnosticoSO diagnosticoSO;
	public AccionRecomendada accion;
	
	public Recomendacion() {
		this.diagnosticoPantalla = new DiagnosticoPantalla();
		this.diagnosticoPreliminar = new DiagnosticoPreliminar();
		this.diagnosticoSO = new DiagnosticoSO();
		this.diagnosticoSensores = new DiagnosticoSensores();
		this.accion = AccionRecomendada.NoEncontrada;
	}

	public DiagnosticoPantalla getDiagnosticoPantalla() {
		return diagnosticoPantalla;
	}

	public void setDiagnosticoPantalla(DiagnosticoPantalla diagnosticoPantalla) {
		this.diagnosticoPantalla = diagnosticoPantalla;
	}

	public DiagnosticoPreliminar getDiagnosticoPreliminar() {
		return diagnosticoPreliminar;
	}

	public void setDiagnosticoPreliminar(DiagnosticoPreliminar diagnosticoPreliminar) {
		this.diagnosticoPreliminar = diagnosticoPreliminar;
	}

	public DiagnosticoSensores getDiagnosticoSensores() {
		return diagnosticoSensores;
	}

	public void setDiagnosticoSensores(DiagnosticoSensores diagnosticoSensores) {
		this.diagnosticoSensores = diagnosticoSensores;
	}

	public DiagnosticoSO getDiagnosticoSO() {
		return diagnosticoSO;
	}

	public void setDiagnosticoSO(DiagnosticoSO diagnosticoSO) {
		this.diagnosticoSO = diagnosticoSO;
	}

	public AccionRecomendada getAccion() {
		return accion;
	}

	public void setAccion(AccionRecomendada accion) {
		this.accion = accion;
	}

	@Override
	public String toString() {
		return "Recomendacion [diagnosticoPantalla=" + diagnosticoPantalla + ", diagnosticoPreliminar="
				+ diagnosticoPreliminar + ", diagnosticoSensores=" + diagnosticoSensores + ", diagnosticoSO="
				+ diagnosticoSO + ", accion=" + accion + "]";
	}

	
	
}
