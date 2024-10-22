package ar.edu.unq.po2.tp9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> listaDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		Map<String, Integer> contador = new HashMap<>();
		for(String carta: listaDeCartas) {
			String valor = extraerValor(carta);
            contador.put(valor,contador.getOrDefault(valor, 0) + 1 );
        }
        return contador.values().stream().anyMatch(cantidad -> cantidad >=4);
	}
	
	private static String extraerValor(String carta) {
        if (carta.length() == 3) {
            // Para cartas con valor 10 (que tienen tres caracteres, ej. "10D")
            return carta.substring(0, 2);  // Los dos primeros caracteres son el valor
        } else {
            // Para el resto de las cartas (que tienen dos caracteres)
            return carta.substring(0, 1);  // El primer carácter es el valor
        }
    }
	
}
