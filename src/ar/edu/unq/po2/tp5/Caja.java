package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	public MercadoCentral mercado;
	
	public Caja(MercadoCentral mercado) {
		this.mercado = mercado;
	}

	public MercadoCentral getMercadoCentral() {
		return mercado;
	}

	public void setMercadoCentral(MercadoCentral mercado) {
		this.mercado = mercado;
	}
	
	public Double cobrarCliente(Cliente cliente) {
		Double precioTotal = 0d;
		List<Producto> productos = cliente.getProductosAComprar();
		for (int i=0; i < productos.size(); i++) {
			precioTotal += productos.get(i).getPrecio();
			this.mercado.decrementarStock(productos.get(i));
		}
		return precioTotal;
	}
}


