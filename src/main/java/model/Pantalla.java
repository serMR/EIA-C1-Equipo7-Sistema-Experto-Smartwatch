package model;

public class Pantalla {
	public PantallaEstado estado;
	public Boolean presentaGolpes;
	public PantallaTouchscreen touchscreen;

	public Pantalla() {
		this.estado = PantallaEstado.Apagado;
		this.presentaGolpes = false;
		this.touchscreen = PantallaTouchscreen.NoDaniado;
	}

	public PantallaEstado getEstado() {
		return estado;
	}

	public void setEstado(PantallaEstado estado) {
		this.estado = estado;
	}

	public Boolean getPresentaGolpes() {
		return presentaGolpes;
	}

	public void setPresentaGolpes(Boolean presentaGolpes) {
		this.presentaGolpes = presentaGolpes;
	}

	public PantallaTouchscreen getTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(PantallaTouchscreen touchscreen) {
		this.touchscreen = touchscreen;
	}

}
