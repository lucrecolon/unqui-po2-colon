package ar.edu.unq.po2.tp5;

import java.util.List;

public class MercadoCentral {
	
	List<Producto> stockProductos;
	
	public MercadoCentral(List<Producto> stockProductos) {
		this.stockProductos = stockProductos;
	}

	public List<Producto> getStockProductos() {
		return stockProductos;
	}

	public void setStockProductos(List<Producto> stockProductos) {
		this.stockProductos = stockProductos;
	}

	public void decrementarStock(Producto producto) {
	        this.stockProductos.remove(producto);
	    }
}
