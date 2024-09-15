package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private String nombre;
	private List<Ingreso> ingresos;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
		this.ingresos = new ArrayList<Ingreso>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public void agregarIngreso(Ingreso ingrNuevo) {
		ingresos.add(ingrNuevo);
	}
	
	public Double getTotalPercibido() {
		Double totalPercibido = 0d;
		for (Ingreso i : ingresos) {
			totalPercibido += i.getMonto();
		}
		return totalPercibido;
	}
	
	public Double getMontoImponible() {
		Double totalImponible = 0d;
		for (Ingreso i : ingresos) {
			totalImponible += i.getMontoImponible();
		}
		return totalImponible;
	}
	
	public Double getImpuestoAPagar() {
		Double totalImponible = 0d;
		for (Ingreso i : ingresos) {
			totalImponible += i.getMontoImponible();
		};
		return totalImponible * 0.02;
	}

}
