package ar.edu.unq.po2.tp9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> listaDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		Map<String, Integer> contador = new HashMap<>();
		Map<String, Integer> contadorPalos = new HashMap<>();
		
		for(Carta carta: listaDeCartas) {
			String valor = carta.getValor();
			String palo = carta.getPalo();
            contador.put(valor,contador.getOrDefault(valor, 0) + 1 );
            contadorPalos.put(palo, contadorPalos.getOrDefault(palo, 0) + 1);
        }

		boolean hayPoker = contador.values().stream().anyMatch(cantidad -> cantidad >=4);
		boolean hayColor = contadorPalos.values().stream().anyMatch(cantidad -> cantidad ==5);
		boolean hayTrio = contador.values().stream().anyMatch(cantidad -> cantidad >=3);
		
		if (hayPoker) {
			return "Poker";
		} else if (hayColor) {
			return "Color";
		} else if (hayTrio) {
			return "Trio";
		} else {
			return "Nada";
		}
	}
}
