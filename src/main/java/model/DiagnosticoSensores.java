package model;

public class DiagnosticoSensores {
	ResultadoDiagnosticoSensores resultado;
	
	public DiagnosticoSensores() {
		this.resultado = ResultadoDiagnosticoSensores.NoDeterminado;
	}

	public ResultadoDiagnosticoSensores getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDiagnosticoSensores resultado) {
		this.resultado = resultado;
	}

}
