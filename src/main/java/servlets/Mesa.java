package servlets;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="MESA")

public class Mesa extends Mobiliario{
	
	private String estilo;
	
// CONSTRUCTORES	

	public Mesa() {
		super();
	}

	public Mesa(String nombre, double precio, String estilo) {
		super(nombre, precio);
		this.estilo = estilo;
	}
	
// GETTERS AND SETTERS	

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	
		
	}


