package ar.edu.unq.po2.tp8;

public class ActividadSemanal {
	
	private DiaDeSemana diaDeSemana;
	private Double horaDeInicio;
	private Double duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeSemana diaDeSemana, Double horaDeInicio, Double duracion, Deporte deporte) {
		this.diaDeSemana = diaDeSemana;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeSemana getDiaDeSemana() {
		return diaDeSemana;
	}

	public void setDiaDeSemana(DiaDeSemana diaDeSemana) {
		this.diaDeSemana = diaDeSemana;
	}

	public Double getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(Double horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public Double calcularCosto() {
        float costoPorHora;

        // Costo base por hora dependiendo del día
        switch (diaDeSemana) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
                costoPorHora = 500;
                break;
            default:
                costoPorHora = 1000;
                break;
        }

        //Costo adicional por la complejidad del deporte.
        Double costoComplejidad = deporte.getComplejidad() * 200d;

        // Cálculo total: costo por hora + costo de complejidad, multiplicado por la duración
        return (costoPorHora + costoComplejidad) * duracion;
    }
	
	@Override
	public String toString() {
		return "Deporte" + this.deporte + "Dia:" + this.diaDeSemana + "Duracion:" + this.duracion;
	}
	
}
