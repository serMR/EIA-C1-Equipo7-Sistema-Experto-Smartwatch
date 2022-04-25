package model;

public enum AccionRecomendada {
	
	NoEncontrada,
	CambiarPantalla,
	CambiarCargador,
	ResetearSOFabrica,
	CambiarPinCarga,
	CargarBateria,
	ReempleazarModBluetooth;
	
	public Boolean isa(AccionRecomendada nivel) {
		return this.toString() == nivel.toString();
	}
	
}
