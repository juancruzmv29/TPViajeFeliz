package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeFeliz {

	
	private Integer numeroCuit;
	ArrayList<Cliente> clientes;
	ArrayList<Servicio> catalogoServicios;
	
	
	
	public ViajeFeliz(Integer numeroCuit) {
		if(numeroCuit < 0) {
			new RuntimeException("El numero de cuit tiene que se rmayor a 0");
		}
		this.numeroCuit = numeroCuit;
		this.clientes = new ArrayList<>();
		this.catalogoServicios = new ArrayList<>();
	}
	
	
	public void registrarCliente(String nombre, String dni, String direccion) {
		
	}
	
	public void crearServicioVuelo(double costoBase, int cantPersonas, String pais, String ciudadDestino, LocalDate fechaSalida, LocalDate fechaVuelta, double costo, double tasaImpuestos) {
		
	}
	
	public void crearServicioAlojamiento(double costoBae, int cantPersonas, String nombreHotel, String pais, String ciudadDestino, LocalDate fechaEntrada, LocalDate fechaSalida, double costoPorDia, double costoTraslado) {
		
	}
	
	public void crearServicioTransporte(double costoBase, int cantPersonas, String pais, String ciudadAlquiler, LocalDate fechaSalida, LocalDate fechaDevolucion, double costoPorDia, double importeGarantia) {
		
	}
	
	public void crearServicioExcursion(double costoBase, int cantPersonas, LocalDate fecha, String lugarSalida, double costoPersona) {
		
	}
	
	
	
}
