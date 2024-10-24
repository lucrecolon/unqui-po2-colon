package ar.edu.unq.po2.tp8;

	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;
	
public class Municipio {
	private List<ActividadSemanal> actividades;
	
	public Municipio(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}
		
	public void agregarActividad(ActividadSemanal actividad) {
		this.actividades.add(actividad);
	}
		
	public List<ActividadSemanal> todasLasDeFutbol(){
		return this.actividades.stream().filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL).collect(Collectors.toList());
	}
	
	public List<ActividadSemanal> todasLasDeComplejidad(int complejidad){
		return this.actividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).collect(Collectors.toList());
	}
		
	public Double horasTotalesDeActividades() {
        return this.actividades.stream()
            .mapToDouble(ActividadSemanal::getDuracion).sum();
    }
	
	public ActividadSemanal laDeMenorCostoDeDeporte (Deporte deporte) {
		return this.actividades.stream()
		        .filter(actividad -> actividad.getDeporte().equals(deporte))  // Filtra por deporte
		        .min(Comparator.comparing(actividad -> actividad.calcularCosto()))  // Compara por costo
		        .orElse(null);
	}
	
	public String infoTodasLasActividades() {
		return this.actividades.stream().map(actividad -> actividad.toString()).collect(Collectors.joining("\n"));
	}
	
}

