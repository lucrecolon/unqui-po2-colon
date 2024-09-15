package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horasExtra;
	
	public IngresoPorHorasExtras(String mes, String concepto, Double monto, int horasExtra) {
		super(mes, concepto, monto);
		this.horasExtra = horasExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	@Override
	public Double getMontoImponible() {
		return 0d;
	}
}
