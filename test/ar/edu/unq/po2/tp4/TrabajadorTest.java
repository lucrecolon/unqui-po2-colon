package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador lucrecia;	
	
	@BeforeEach
	public void setUp() {
		Ingreso ingresoSalarioEnero = new Ingreso("Enero", "concepto", 2000d);
		Ingreso ingresoHorasExtraFebrero = new IngresoPorHorasExtras("Febrero", "concepto", 500d, 20);
		Ingreso ingresoSalarioMarzo = new Ingreso("Marzo", "concepto", 2000d);
		
		lucrecia = new Trabajador("Lucrecia");
		
		lucrecia.agregarIngreso(ingresoSalarioEnero);
		lucrecia.agregarIngreso(ingresoHorasExtraFebrero);
		lucrecia.agregarIngreso(ingresoSalarioMarzo);
	}

	@Test
	public void testCalcularTotalPercibido() {
		assertEquals(4500d, lucrecia.getTotalPercibido());
	}
	
	@Test
	public void testCalcularMontoImponible() {
		assertEquals(4000d, lucrecia.getMontoImponible());
	}
	
	@Test
	public void testCalcularImpuestoAPagar() {
		assertEquals(80d, lucrecia.getImpuestoAPagar());
	}
}














