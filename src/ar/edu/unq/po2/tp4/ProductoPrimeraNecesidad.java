package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCiudado, Double descuento) {
		super(nombre, precio, esPrecioCiudado);
		this.descuento = descuento;
	}

	@Override
	public Double getPrecio() {
		return this.precio * this.descuento;
	}
	
}