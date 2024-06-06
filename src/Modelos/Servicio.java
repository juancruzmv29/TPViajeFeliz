package Modelos;

public abstract class Servicio {
	
	private Integer codigo;

	public Servicio() {
		this.codigo++;
	}
	
	
	public abstract double calcularCostoServicio();
	
	
}
