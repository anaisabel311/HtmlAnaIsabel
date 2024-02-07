package servlets;

public class Sofa extends Mobiliario{
	
	private String color;

	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
