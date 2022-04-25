package model;

public class DiagnosticoPreliminar {
	
	public NivelBateria nivelBateria;
	public DiferencialPotencialCargador diferencialPotencialCargador;
	public EstadoPinCarga estadoPinCarga;
	public ResultadoDiagnosticoPreliminar resultado;

	public DiagnosticoPreliminar() {
		this.nivelBateria = NivelBateria.NoDeterminado;
		this.diferencialPotencialCargador = DiferencialPotencialCargador.NoDeterminado;
		this.estadoPinCarga = EstadoPinCarga.Normal;
		this.resultado = ResultadoDiagnosticoPreliminar.NoDeterminado;
	}

	public NivelBateria getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(NivelBateria nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	public DiferencialPotencialCargador getDiferencialPotencialCargador() {
		return diferencialPotencialCargador;
	}

	public void setDiferencialPotencialCargador(DiferencialPotencialCargador diferencialPotencialCargador) {
		this.diferencialPotencialCargador = diferencialPotencialCargador;
	}

	public EstadoPinCarga getEstadoPinCarga() {
		return estadoPinCarga;
	}

	public void setEstadoPinCarga(EstadoPinCarga estadoPinCarga) {
		this.estadoPinCarga = estadoPinCarga;
	}

	public ResultadoDiagnosticoPreliminar getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDiagnosticoPreliminar resultado) {
		this.resultado = resultado;
	}

}
