package Modelos;

import java.time.LocalDate;

public class Excursiones extends ServicioSimple {
	
	
	private LocalDate fechaSalida;
	private String lugarSalida;
	private double costoPersona;
	private String medioDia_diaEntero;
	private int descuento;
	
	
	public Excursiones(double costoBase, int cantPersonas, LocalDate fechaSalida, String lugarSalida, double costoPersona, String medioDia_diaEntero, int descuento) {
		super(costoBase, cantPersonas);
		if(cantPersonas < 1) {
			new RuntimeException("La cantidad de personas no puede ser menor a 1");
		}
		if(fechaSalida == null) {
			new RuntimeException("La fecha de salida no puede ser nula");
		}
		
		if(lugarSalida.isEmpty() || medioDia_diaEntero.isEmpty()) {
			new RuntimeException("El lugar de salida o el dia no pueden estar vacios");
		}
		
		if(costoPersona <= 0) {
			new RuntimeException("El costo por persona no puede ser menor o igual a 0");
		}
		
		if(descuento <= 0) {
			new RuntimeException("Descuento no puede ser menor o igual a 0");
		}
		
		this.fechaSalida = fechaSalida;
		this.lugarSalida = lugarSalida;
		this.costoPersona = costoPersona;
		this.medioDia_diaEntero = medioDia_diaEntero;
		this.descuento = descuento;
	}


	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
