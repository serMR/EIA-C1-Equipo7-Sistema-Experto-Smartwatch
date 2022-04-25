package model;

public class DiagnosticoSO {

	ResultadoDiagnosticoSO resultado;
	
	public DiagnosticoSO() {
		this.resultado = ResultadoDiagnosticoSO.NoDeterminado;
	}

	public ResultadoDiagnosticoSO getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDiagnosticoSO resultado) {
		this.resultado = resultado;
	}

}
