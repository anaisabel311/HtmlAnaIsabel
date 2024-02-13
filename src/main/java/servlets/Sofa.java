package servlets;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="SOFA")

public class Sofa extends Mobiliario{
	
	private String color;
	
// CONSTRUCTORES	

	public Sofa() {
		super();
	}

	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}
	
// GETTERS AND SETTERS	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
