package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends Servicio {
	
	
	ArrayList<ServicioSimple> serviciosSimples;
	private double costo;
	private boolean pagoHecho;
	private boolean pagoIniciado;
	private LocalDate fechaPago;
	private LocalDate fechaInicio;
	private boolean efectivo;
	private String tipoPaquete;
	
	
	public Paquete(double costo, boolean pagoHecho, boolean pagoIniciado, LocalDate fechaPago,
			LocalDate fechaInicio, boolean efectivo, String tipoPaquete) {
		super();
		if(fechaPago == null || fechaInicio == null) {
			new RuntimeException("Las fechas de pago no pueden estar vacías");
		}
		if(tipoPaquete.isEmpty()) {
			new RuntimeException("Debe especificarse el tipo de paquete");
		}
		
		this.costo = 0;
		this.pagoHecho = false;
		this.pagoIniciado = false;
		this.fechaPago = fechaPago;
		this.fechaInicio = fechaInicio;
		this.efectivo = false;
		this.tipoPaquete = tipoPaquete;
		this.serviciosSimples = new ArrayList<>();
	}


	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
