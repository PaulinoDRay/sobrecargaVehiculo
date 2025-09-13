package tiposDeVehiculos;

public class Automovil {
	// Campos o atributos
	private String idAutomovil; 
	private String marca;
	private String modelo;
	private String color;
	private int año;
	
	// Métodos constructores
	public Automovil() {
	}

	public Automovil(String idAutomovil, String marca, String modelo, String color, int año) {
		this.idAutomovil = idAutomovil;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}

	public String getIdAutomovil() {
		return idAutomovil;
	}

	public void setIdAutomovil(String idAutomovil) {
		this.idAutomovil = idAutomovil;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Automovil \tidAutomovil = " + idAutomovil + 
				"\tMarca = " + marca + 
				"\tModelo = " + modelo + 
				"\tColor = " + color + 
				"\tAño = " + año + "\n";
	}
}
