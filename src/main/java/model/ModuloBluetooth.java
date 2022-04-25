package model;

public class ModuloBluetooth {
	Boolean permiteEmparejamiento;
	
	public ModuloBluetooth() {
		this.permiteEmparejamiento = true;
	}

	public Boolean getPermiteEmparejamiento() {
		return permiteEmparejamiento;
	}

	public void setPermiteEmparejamiento(Boolean permiteEmparejamiento) {
		this.permiteEmparejamiento = permiteEmparejamiento;
	}

	@Override
	public String toString() {
		return "ModuloBluetooth [permiteEmparejamiento=" + permiteEmparejamiento + "]";
	}

}
