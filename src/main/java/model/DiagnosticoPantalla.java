package model;

public class DiagnosticoPantalla {

	ResultadoDiagnosticoPantalla resultado;

	public DiagnosticoPantalla() {
		this.resultado = ResultadoDiagnosticoPantalla.NoDeterminado;
	}

	public ResultadoDiagnosticoPantalla getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDiagnosticoPantalla resultado) {
		this.resultado = resultado;
	}
	
}
