package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9d, arroz.getPrecio());
		assertTrue(arroz.esPrecioCiudado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55d, vino.getPrecio());
		assertFalse(vino.esPrecioCiudado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4d, arroz.getPrecio());
	}
}