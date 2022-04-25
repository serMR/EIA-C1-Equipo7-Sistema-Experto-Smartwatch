package model;

public enum SOInterfaz {

	ImagenNormal,
	SinImagen,
	SinRespuesta,
	NoDeterminado;
	
	public Boolean isa(SOInterfaz data) {
		return this.toString() == data.toString();
	}

}
