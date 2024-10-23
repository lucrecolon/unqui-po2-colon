package ar.edu.unq.po2.tp10;

public class SinglePlayer extends EstadoJuego {

	@Override
	public void botonInicio(MaquinaJuegos maquina) {
		maquina.setModoJuego(this);
		System.out.println("JUEGO INICIADO");
		this.terminarJuego(maquina);
	}

	@Override
	public void terminarJuego(MaquinaJuegos maquina) {
		System.out.println("JUEGO TERMINADO");
		maquina.setModoJuego(new EstadoInicial());
	}

}
