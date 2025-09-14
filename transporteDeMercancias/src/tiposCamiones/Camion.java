package tiposCamiones;

public class Camion {
	// Campos o atributos
	private String idCamion;
	private String marca;
	private String modelo;
	private int año;
	
	// A partir de esta parte están los Métodos Constructores
	public Camion() {
	}


	
	public Camion(String idCamion, String marca, String modelo, int año) {
		this.idCamion = idCamion;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}


	// Método constructor de escritura y lectura (set/get)
	public String getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}



	@Override
	 Método toString
	public String toString() {
		return "Camion [IdCAMIÓN=" + idCamion + 
				"\nMARCA=" + marca + 
				"\nMODELO=" + modelo + 
				"\nAÑO=" + año + "\t]";
	}
}
