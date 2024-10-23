package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusTest {
	
	public Carta c1;
	public Carta c2; 
	public Carta c3; 
	public Carta c4;
	public Carta c5;
	public PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pokerStatus = new PokerStatus();
		c1 = mock(Carta.class);
		c2 = mock(Carta.class);
		c3 = mock(Carta.class);
		c4 = mock(Carta.class);
		c5 = mock(Carta.class);
		
		when(c1.getValor()).thenReturn("A");
		when(c2.getValor()).thenReturn("A");
		when(c3.getValor()).thenReturn("A");
		when(c4.getValor()).thenReturn("A");
		
	}

	@Test
	void testVerificar() {
		
		
	}
}


