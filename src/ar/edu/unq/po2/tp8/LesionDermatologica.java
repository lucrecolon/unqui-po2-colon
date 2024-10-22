package ar.edu.unq.po2.tp8;

public enum LesionDermatologica {
	
	ROJO("lastimado", 3), 
	GRIS("cicatrizando", 2), 
	AMARILLO("casi curado", 1), 
	MIEL("curado", 0);
	
	private String descripcion;
	private int nivelDeRiesgo;

	private LesionDermatologica(String descripcion, int nivelDeRiesgo) {
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	public LesionDermatologica getProximoColor() {
		return values()[(this.ordinal() + 1) % values().length];
	}
	
	@Override
    public String toString() {
        return this.name() + " (Descripcion: " + descripcion + ", Nivel de riesgo: " + nivelDeRiesgo + 
          " y Proximo color: " + getProximoColor().name() + ")";
    }
}

