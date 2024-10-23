package ar.edu.unq.po2.tp10;

public class MaquinaJuegos {

	private EstadoJuego modoJuego;
	private int cantFichas;
	
	
	public MaquinaJuegos(EstadoJuego modoJuego, int cantFichas) {
		this.modoJuego = modoJuego;
		this.cantFichas = cantFichas;
	}


	public EstadoJuego getModoJuego() {
		return modoJuego;
	}


	public void setModoJuego(EstadoJuego modoJuego) {
		this.modoJuego = modoJuego;
	}

	public void setCantFichas(int cantFichas) {
		this.cantFichas = cantFichas;
	}
	
	public int getCantFichas() {
		return cantFichas;
	}
	
	public void ingresarFicha() {
		if (this.cantFichas == 2) {
			System.out.println("PRESIONE EL BOTON DE INICIO");
		} else {
			this.setCantFichas(getCantFichas() + 1); 
		}
	}
	
}
