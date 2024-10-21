package ar.edu.unq.po2.tp6;

public abstract class Empleado {
	
	public String nombre;
	public Double sueldoBasico;
	public int horasTrabajadas;
	public int cantHijos;
	
	public Empleado(String nombre, Double sueldoBasico, int horasTrabajadas, int cantHijos) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.horasTrabajadas = horasTrabajadas;
		this.cantHijos = cantHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getsueldoBasico() {
		return sueldoBasico;
	}

	public abstract void setsueldoBasico(Double sueldoBasico);

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	public abstract Double sueldoNeto();
	
	public Double sueldoTotal() {
		return this.sueldoNeto() * 0.13d;
	}
}
