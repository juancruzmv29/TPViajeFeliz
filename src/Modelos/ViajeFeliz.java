package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeFeliz {

	
	private Integer numeroCuit;
	ArrayList<Cliente> clientes;
	ArrayList<Servicio> catalogoServicios;
	// Hacer una tupla con codCliente, Servicio
	StringBuilder sb = new StringBuilder();
	
	
	
	public ViajeFeliz(Integer numeroCuit) {
		if(numeroCuit < 0) {
			new RuntimeException("El numero de cuit tiene que se rmayor a 0");
		}
		this.numeroCuit = numeroCuit;
		this.clientes = new ArrayList<>();
		this.catalogoServicios = new ArrayList<>();
	}
	
	
	public void registrarCliente(String nombre, String dni, String direccion) {
		Cliente cliente = new Cliente(nombre, dni, direccion);
		clientes.add(cliente);
	}
	
	public void crearServicioVuelo(double costoBase, int cantPersonas, String pais, String ciudadDestino, LocalDate fechaSalida, LocalDate fechaVuelta, double costo, double tasaImpuestos) {
		ServicioVuelo vuelo = new ServicioVuelo(costoBase, cantPersonas, pais, ciudadDestino, fechaSalida, fechaVuelta, costo, tasaImpuestos);
		catalogoServicios.add(vuelo);
	}
	
	public void crearServicioAlojamiento(double costoBase, int cantPersonas, String nombreHotel, String pais, String ciudadDestino, LocalDate fechaEntrada, LocalDate fechaSalida, double costoPorDia, double costoTraslado) {
		ServicioAlojamiento alojamiento = new ServicioAlojamiento(costoBase, cantPersonas, nombreHotel, pais, ciudadDestino, fechaEntrada, fechaSalida, costoPorDia, costoTraslado);
		catalogoServicios.add(alojamiento);
	}
	
	public void crearServicioTransporte(double costoBase, int cantPersonas, String pais, String ciudadAlquiler, LocalDate fechaSalida, LocalDate fechaDevolucion, double costoPorDia, double importeGarantia) {
		AlquilerTransporte transporte = new AlquilerTransporte(costoBase, cantPersonas, pais, ciudadAlquiler, fechaSalida, fechaDevolucion, costoPorDia, importeGarantia);
		catalogoServicios.add(transporte);
	}
	
	public void crearServicioExcursion(double costoBase, int cantPersonas, LocalDate fecha, String lugarSalida, double costoPersona) {
		Excursiones excursion = new Excursiones(costoBase, cantPersonas, fecha, lugarSalida, costoPersona, lugarSalida, cantPersonas);
		catalogoServicios.add(excursion);
	}
	
	public void crearPaquetePredefinido(String tipoPaquete, LocalDate fechaInicio) {
		Paquete paquetePredefinido = new Paquete(tipoPaquete, fechaInicio);
		catalogoServicios.add(paquetePredefinido);
	}
	
	// Funcion para eliminar servicio
	public void eliminarServicio(String dni, int codServicio) {
		
	}


	@Override
	public String toString() {
		return "ViajeFeliz [numeroCuit=" + numeroCuit + ", clientes=" + clientes + ", catalogoServicios="
				+ catalogoServicios + ", sb=" + sb + "]";
	}
	
	
	
}
