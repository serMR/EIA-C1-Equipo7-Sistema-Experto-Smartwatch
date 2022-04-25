package model;

public class SistemaOperativo {

	SOArranque arranque;
	SOInterfaz interfaz;
	SOVelocidadRespuesta velocidadRespuesta;
	
	public SistemaOperativo() {
		this.arranque = SOArranque.Normal;
		this.interfaz = SOInterfaz.NoDeterminado;
		this.velocidadRespuesta = SOVelocidadRespuesta.Normal;
	}

	public SOArranque getArranque() {
		return arranque;
	}

	public void setArranque(SOArranque arranque) {
		this.arranque = arranque;
	}

	public SOInterfaz getInterfaz() {
		return interfaz;
	}

	public void setInterfaz(SOInterfaz interfaz) {
		this.interfaz = interfaz;
	}

	public SOVelocidadRespuesta getVelocidadRespuesta() {
		return velocidadRespuesta;
	}

	public void setVelocidadRespuesta(SOVelocidadRespuesta velocidadRespuesta) {
		this.velocidadRespuesta = velocidadRespuesta;
	}
	
	
}
