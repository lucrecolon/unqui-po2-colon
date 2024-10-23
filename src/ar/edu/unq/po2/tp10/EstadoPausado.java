package ar.edu.unq.po2.tp10;

public class EstadoPausado implements EstadoMP3 {

	@Override
	public void play(ReproductorMP3 reproductor) {
		reproductor.errorEstado();
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		reproductor.setEstado(new EstadoReproduccion());
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		reproductor.setEstado(new EstadoSeleccionCancion());
	}

}
