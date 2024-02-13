package servlets;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="LAMPARA")

public class Lampara extends Mobiliario {
	
	private String potencia;

// CONSTRUCTORES	
	
	public Lampara() {
		super();
	}

	public Lampara(String nombre, double precio, String potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}
	
// GETTERS AND SETTERS	

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	

}
