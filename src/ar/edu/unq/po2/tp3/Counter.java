package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> n;
	
	public Counter() {
		n = new ArrayList<Integer>();
	}

	public void addNumber (int x) {
		this.n.add(x);
	}

	public int pares() {
		int x = 0;
		for (int i = 0; i > this.n.size(); i++) {
			if(this.n.get(i) % 2 == 0) {
				x++;
		}
	}
	return x;
	}

	public int impares() {
		int x = 0;
		for (int i = 0; i > this.n.size(); i++) {
			if(this.n.get(i) % 2 != 0) {
			x++;
		}
	}
	return x;
	}
}

