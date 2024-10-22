package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	public String asPicas;
	public String asDiamantes; 
	public String asCorazones; 
	public String asTreboles;
	public String sietePicas;
	public String reinaCorazones;
	public PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pokerStatus = new PokerStatus();
		asPicas = "AP";
		asDiamantes = "AD";
		asCorazones = "AC";
		asTreboles = "AT";
		sietePicas = "7P";
		reinaCorazones = "QC";
	}

	@Test
	void testVerificar() {
		assertTrue(pokerStatus.verificar(asPicas, asDiamantes, asCorazones, asTreboles, sietePicas));

		assertFalse(pokerStatus.verificar(asPicas, reinaCorazones, asCorazones, asTreboles, sietePicas));
	}
}


