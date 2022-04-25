package model;

public class CargadorSmartwatch {
	
	static Double MIN_DIF_POT = 0.0;
	static Double MAX_DIF_POT = 5.0;
	
	DiferencialPotencialCargador nivelDiferencialPotencial;
	private Double diferencialPotencial;
	
	public CargadorSmartwatch() {
		this.nivelDiferencialPotencial = DiferencialPotencialCargador.NoDeterminado;
	}

	public DiferencialPotencialCargador getNivelDiferencialPotencial() {
		return nivelDiferencialPotencial;
	}

	public void setNivelDiferencialPotencial(DiferencialPotencialCargador nivelDiferencialPotencial) {
		this.nivelDiferencialPotencial = nivelDiferencialPotencial;
	}

	public Double getDiferencialPotencial() {
		return diferencialPotencial;
	}

	public void setDiferencialPotencial(Double diferencialPotencial) {
		this.diferencialPotencial = diferencialPotencial;
	}

}
