package model;

public class Smartwatch {
	
	public Bateria bateria;
	public PinCarga pinCarga;
	public Pantalla pantalla;
	public SistemaOperativo sistemaOperativo;
	public CargadorSmartwatch cargador;
	public ModuloBluetooth moduloBluetooth;
	public Recomendacion recomendacion;

	public Smartwatch(
			Bateria bateria,
			PinCarga pinCarga,
			Pantalla pantalla,
			SistemaOperativo so,
			ModuloBluetooth moduloBluetooth,
			CargadorSmartwatch cargador
	) {
		this.bateria = bateria;
		this.pinCarga = pinCarga;
		this.pantalla = pantalla;
		this.sistemaOperativo = so;
		this.cargador = cargador;
		this.moduloBluetooth = moduloBluetooth;
		this.recomendacion = new Recomendacion();
	}

	public Bateria getBateria() {
		return bateria;
	}


	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}


	public PinCarga getPinCarga() {
		return pinCarga;
	}


	public void setPinCarga(PinCarga pinCarga) {
		this.pinCarga = pinCarga;
	}


	public Pantalla getPantalla() {
		return pantalla;
	}


	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}


	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public CargadorSmartwatch getCargador() {
		return cargador;
	}


	public void setCargador(CargadorSmartwatch cargador) {
		this.cargador = cargador;
	}


	public Recomendacion getRecomendacion() {
		return recomendacion;
	}


	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}

	public ModuloBluetooth getModuloBluetooth() {
		return moduloBluetooth;
	}

	public void setModuloBluetooth(ModuloBluetooth moduloBluetooth) {
		this.moduloBluetooth = moduloBluetooth;
	}

	@Override
	public String toString() {
		return "Smartwatch [bateria=" + bateria + ", pinCarga=" + pinCarga + ", pantalla=" + pantalla
				+ ", sistemaOperativo=" + sistemaOperativo + ", cargador=" + cargador + ", moduloBluetooth="
				+ moduloBluetooth + ", recomendacion=" + recomendacion + "]";
	}
	
	
}
