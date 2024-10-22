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
	public String diezCorazones;
	public String dosCorazones;
	public String seisCorazones;
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
		diezCorazones = "10C";
		dosCorazones = "2C";
		seisCorazones = "6C";
	}

	@Test
	void testVerificar() {
		assertEquals("Poker", pokerStatus.verificar(asPicas, asDiamantes, asCorazones, asTreboles, sietePicas));
		assertEquals("Trio", pokerStatus.verificar(asPicas, reinaCorazones, asCorazones, asTreboles, sietePicas));
		assertEquals("Color", pokerStatus.verificar(reinaCorazones, dosCorazones, asCorazones, seisCorazones, diezCorazones));
		assertEquals("Nada", pokerStatus.verificar(asPicas, reinaCorazones, dosCorazones, asTreboles, sietePicas));
	}
}


