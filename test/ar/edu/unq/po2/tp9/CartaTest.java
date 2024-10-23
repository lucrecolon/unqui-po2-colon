package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	public Carta C4;
	public Carta PJ;
	public Carta C7;
	
	@BeforeEach
	void setUp() throws Exception {
		
		C4 = new Carta("Corazones", "4");
		PJ = new Carta("Picas", "J");
		C7 = new Carta("Corazones", "7");
		
	}

	@Test
	void testPalo() {
		assertEquals("Corazones", C4.getPalo());
	}
	
	@Test
	void testValor() {
		assertEquals("4", C4.getValor());
	}
	
	@Test
	void testCartaSuperiorAOtra() {
		assertTrue(PJ.esSuperiorA(C4));
	}
	
	@Test
	void testCartaMismoValorAOtra() {
		assertTrue(C7.esMismoPaloQue(C4));
	}
	
	
	
}
