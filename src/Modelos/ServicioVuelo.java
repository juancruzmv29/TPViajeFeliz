package Modelos;

import java.time.LocalDate;

public class ServicioVuelo extends ServicioSimple {
	
	
	private String pais;
	private String ciudadDestino;
	private LocalDate fechaSalida;
	private LocalDate fechaVuelta;
	private double costoIdaYVuelta;
	private double tasaImpuestos;
	
	
	public ServicioVuelo(double costoBase, int cantPersonas, String pais, String ciudadDestino,
			LocalDate fechaSalida, LocalDate fechaVuelta, double costoIdaYVuelta, double tasaImpuestos) {
		super(costoBase, cantPersonas);
		if(cantPersonas != 1) {
			new RuntimeException("El numero de personas para un vuelo es 1");
		}
		if(pais.isEmpty() || ciudadDestino.isEmpty()) {
			new RuntimeException("País y ciudad no pueden estar vacíos");
		}
		
		if(fechaSalida == null || fechaVuelta == null) {
			new RuntimeException("La fecha de salida y la fecha de vuelta no pueden ser nulos");
		}
		
		if(tasaImpuestos <= 0 || costoIdaYVuelta <= 0) {
			new RuntimeException("La tasa de impuestos y el costo de ida y vuelta no pueden ser iguales o menores a 0");
		}
		this.pais = pais;
		this.ciudadDestino = ciudadDestino;
		this.fechaSalida = fechaSalida;
		this.fechaVuelta = fechaVuelta;
		this.costoIdaYVuelta = costoIdaYVuelta;
		this.tasaImpuestos = tasaImpuestos;
	}


	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
