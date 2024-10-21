package ar.edu.unq.po2.tp6;

public class Planta extends Empleado {

	public Planta(String nombre, Double sueldoBasico, int horasTrabajadas, int cantHijos) {
		super(nombre, sueldoBasico, horasTrabajadas, cantHijos);
	}

	@Override
	public void setsueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = 3000d;
	}
	
	@Override
	public Double sueldoNeto() {
		return this.sueldoBasico + this.cantHijos * 150d;
	}
}
