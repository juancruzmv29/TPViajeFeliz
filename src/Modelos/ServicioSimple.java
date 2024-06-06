package Modelos;

public abstract class ServicioSimple extends Servicio {
	
	private double costoBase;
	private int cantPersonas;
	
	
	
	public ServicioSimple(double costoBase, int cantPersonas) {
		super();
		this.costoBase = costoBase;
		this.cantPersonas = cantPersonas;
	}
	
	
	
	
}
