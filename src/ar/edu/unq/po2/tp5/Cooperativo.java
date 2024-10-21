package ar.edu.unq.po2.tp5;

public class Cooperativo extends Producto {

	public Cooperativo(String nombre, Double precio) {
		super(nombre, precio);
	}

	@Override
	public Double getPrecio() {
		return (this.precio * 0.9d) ;
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
