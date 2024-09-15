package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	protected Double precio;
	private boolean esPrecioCiudado;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, Double precio, boolean esPrecioCiudado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCiudado = esPrecioCiudado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCiudado() {
		return esPrecioCiudado;
	}

	public void setEsPrecioCiudado(boolean esPrecioCiudado) {
		this.esPrecioCiudado = esPrecioCiudado;
	}
	
	public void aumentarPrecio(Double newPrice) {
		this.precio += newPrice;
	}
	
}