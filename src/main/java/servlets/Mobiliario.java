package servlets;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
@Table(name="TB_MOBILIARIO")

public class Mobiliario {
	
	private String nombre;
	private double precio;

	@Id
	@SequenceGenerator(name = "MUEBLESGEN", sequenceName = "MUEBLES_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUEBLESGEN")
	@Column(name = "ID", nullable = false, updatable = false)
    private long id;
	
	
// CONSTRUCTORES	
	
	public Mobiliario() {
		super();
	}

	public Mobiliario(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	
// GETTERS AND SETTERS	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	

}
