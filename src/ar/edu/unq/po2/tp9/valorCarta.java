package ar.edu.unq.po2.tp9;

public enum valorCarta {
	
	A(1), J(10), Q(11), K(12);

	private int valorNum;
	
	valorCarta(int valorNum) {
		this.valorNum = valorNum;
	}

	public int getValorNum() {
		return valorNum;
	}

	public void setValorNum(int valorNum) {
		this.valorNum = valorNum;
	}
	
}
