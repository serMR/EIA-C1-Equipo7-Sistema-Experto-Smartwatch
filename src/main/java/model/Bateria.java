package model;

public class Bateria {

	public static final int MAX_LIMIT_LOW_LEVEL = 15;
	public static final int MAX_LIMIT_MEDIUM_LEVEL = 70;
	public static final int MAX_LIMIT_HIGH_LEVEL = 100;

	private int capacidadPorcentual;
	public NivelBateria nivelBateria;

	public Bateria() {
		this.nivelBateria = NivelBateria.NoDeterminado;
	}

	public int getCapacidadPorcentual() {
		return capacidadPorcentual;
	}

	public void setCapacidadPorcentual(int capacidadPorcentual) {
		this.capacidadPorcentual = capacidadPorcentual;
	}

	public NivelBateria getLevel() {
		return nivelBateria;
	}

	public void setLevel(NivelBateria level) {
		this.nivelBateria = level;
	}

	@Override
	public String toString() {
		return "Bateria [capacidadPorcentual=" + capacidadPorcentual + ", nivelBateria=" + nivelBateria + "]";
	}
	
}