package ar.edu.unq.po2.tp5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Caja caja1;
	private MercadoCentral mercado1;
	private List<Producto> productos;
	private Producto arroz;
	private Producto leche;
	private Producto agua;
	private Cliente cliente1;
	private List<Producto> productosAComprar;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 500d);
		leche = new Producto("leche", 200d);
		agua = new Producto("agua", 300d);
		
		productos.add(arroz);
		productos.add(leche);
		productos.add(agua);
		productosAComprar.add(leche);
		mercado1 = new MercadoCentral(productos);
		caja1 = new Caja(mercado1);
		cliente1 = new Cliente("lucrecia", productosAComprar);
	}

	@Test
	public void calcularTotalCompra() {
		assertEquals(200d, caja1.cobrarCliente(cliente1));
	}

}
