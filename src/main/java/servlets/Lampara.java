package servlets;

public class Lampara extends Mobiliario {
	
	private String potencia;

	public Lampara(String nombre, double precio, String potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	

}
