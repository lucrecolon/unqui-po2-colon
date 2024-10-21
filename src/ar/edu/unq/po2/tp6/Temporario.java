package ar.edu.unq.po2.tp6;

public class Temporario extends Empleado {

	public boolean estaCasado;
	
	public Temporario(String nombre, Double sueldoBasico, int horasTrabajadas, int cantHijos) {
		super(nombre, sueldoBasico, horasTrabajadas, cantHijos);
	}
	
	@Override
	public void setsueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = 1000d;
	}
	
	@Override
	public Double sueldoNeto() {
		if (this.cantHijos > 0 || estaCasado){
			return 100d + this.sueldoBasico + this.horasTrabajadas * 5d;
		}
		return this.sueldoBasico + this.horasTrabajadas * 5d;
	}
	
}
