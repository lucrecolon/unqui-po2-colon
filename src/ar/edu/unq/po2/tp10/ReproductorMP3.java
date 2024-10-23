package ar.edu.unq.po2.tp10;

public class ReproductorMP3 {

	private EstadoMP3 estado;
	private Song cancionSeleccionada;
	
	public ReproductorMP3(EstadoMP3 estado, Song cancionSeleccionada) {
		this.estado = estado;
		this.cancionSeleccionada = cancionSeleccionada;
	}

	public EstadoMP3 getEstado() {
		return estado;
	}

	public void setEstado(EstadoMP3 estado) {
		this.estado = estado;
	}

	public Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}

	public void setCancionSeleccionada(Song cancionSeleccionada) {
		this.cancionSeleccionada = cancionSeleccionada;
	}

	public String errorEstado() {
		return "ESTADO INCORRECTO";
	}
	
}
