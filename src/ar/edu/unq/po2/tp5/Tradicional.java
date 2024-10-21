package ar.edu.unq.po2.tp5;

public class Tradicional extends Producto {

	public Tradicional(String nombre, Double precio) {
		super(nombre, precio);
	}

	@Override
	public Double getPrecio() {
		return precio;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
