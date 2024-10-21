package ar.edu.unq.po2.tp6;

public class Pasante extends Empleado {

	public Pasante(String nombre, Double sueldoBasico, int horasTrabajadas, int cantHijos) {
		super(nombre, sueldoBasico, horasTrabajadas, cantHijos);
	}

	@Override
	public Double sueldoNeto() {
		return this.horasTrabajadas * 40d;
	}

	@Override
	public void setsueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = 0d;
	}
	
}
