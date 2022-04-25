package model;

public class PinCarga {

	static Double MIN_DIF_POT = 0.0;
	static Double MAX_DIF_POT = 5.0;
	
	public EstadoPinCarga estadoPinDeCarga;
	public Double diferencialPotencialPin;

	public PinCarga() {
		this.estadoPinDeCarga = EstadoPinCarga.Normal;
	}

	public EstadoPinCarga getEstadoPinDeCarga() {
		return estadoPinDeCarga;
	}

	public void setEstadoPinDeCarga(EstadoPinCarga estadoPinDeCarga) {
		this.estadoPinDeCarga = estadoPinDeCarga;
	}

	public Double getDiferencialPotencialPin() {
		return diferencialPotencialPin;
	}

	public void setDiferencialPotencialPin(Double diferencialPotencialPin) {
		this.diferencialPotencialPin = diferencialPotencialPin;
	}
}
