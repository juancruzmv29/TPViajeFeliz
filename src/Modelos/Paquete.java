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
	
	
	public Paquete(String tipoPaquete, LocalDate fechaInicio) {
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
		this.fechaPago = null;
		this.fechaInicio = null;
		this.efectivo = false;
		this.tipoPaquete = tipoPaquete;
		this.serviciosSimples = new ArrayList<>();
	}
	
	


	public ArrayList<ServicioSimple> getServiciosSimples() {
		return serviciosSimples;
	}




	public void setServiciosSimples(ArrayList<ServicioSimple> serviciosSimples) {
		this.serviciosSimples = serviciosSimples;
	}



	// Recorremos los servicios del paquete y calculamos
	public double getCosto() {
		return costo;
	}




	public void setCosto(double costo) {
		this.costo = costo;
	}




	public boolean isPagoHecho() {
		return pagoHecho;
	}




	public void setPagoHecho(boolean pagoHecho) {
		if(this.pagoHecho == true) {
			this.pagoHecho = false;
		} else {
			this.pagoHecho = true;
		}
	}




	public boolean isPagoIniciado() {
		return pagoIniciado;
	}




	public void setPagoIniciado(boolean pagoIniciado) {
		if(this.pagoIniciado == true) {
			this.pagoIniciado = false;
		} else { 
			this.pagoIniciado = true;
		}
	}




	public LocalDate getFechaPago() {
		return fechaPago;
	}




	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}




	public LocalDate getFechaInicio() {
		return fechaInicio;
	}




	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}




	public boolean isEfectivo() {
		return efectivo;
	}




	public void setEfectivo(boolean efectivo) {
		if(this.efectivo == true) {
			this.efectivo = false;
		} else {
			this.efectivo = true;
		}
	}




	public String getTipoPaquete() {
		return tipoPaquete;
	}




	public void setTipoPaquete(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
	}




	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
