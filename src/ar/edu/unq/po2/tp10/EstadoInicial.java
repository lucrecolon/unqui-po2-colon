package ar.edu.unq.po2.tp10;

public class EstadoInicial extends EstadoJuego {

	@Override
	public void botonInicio(MaquinaJuegos maquina) {
		if (maquina.getCantFichas() == 0) {
			System.out.println("INSERTAR FICHA(S)");
		} else if (maquina.getCantFichas() == 1) {
			maquina.setModoJuego(new SinglePlayer());
			maquina.getModoJuego().botonInicio(maquina);
		} else {
			maquina.setModoJuego(new TwoPlayers());
			maquina.getModoJuego().botonInicio(maquina);
		}		
	}

	@Override
	public void terminarJuego(MaquinaJuegos maquina) {
		System.out.println("INSERTAR FICHA(S)");
	}
	
}
