package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String direccion;
	private static Integer codigoUnico = 0;
	ArrayList<ServicioSimple> serviciosSimples;
	ArrayList<Paquete> paquetes;
	ArrayList<Servicio> paquetesDePaquetes;  // ver si eliminar o no
	
	
	public Cliente(String dni, String nombre, String direccion) {
		if(dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty()) {
			new RuntimeException("Nombre, dni o dirección no pueden estar vacíos");
		}
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoUnico++;
		this.serviciosSimples = new ArrayList<>();
		this.paquetes = new ArrayList<>();
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public static Integer getCodigoUnico() {
		return codigoUnico;
	}


	public static void setCodigoUnico(Integer codigoUnico) {
		Cliente.codigoUnico = codigoUnico;
	}


	public ArrayList<ServicioSimple> getServicios() {
		return serviciosSimples;
	}


	public void setServicios(ArrayList<ServicioSimple> serviciosSimples) {
		this.serviciosSimples = serviciosSimples;
	}
	
	
	
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//=================================================================== FUNCIONES PARA HACER
	public void aplicarDescuento() {
		
	}
	
	
	public void crearPaquete(String tipoPaquete, LocalDate fechaInicio) {
		Paquete paquete = new Paquete(tipoPaquete, fechaInicio);
		paquetes.add(paquete);
	}
	
	public void agregarServicioAPaquete(int codigoPaquete, ServicioSimple servicioSimple) {
		// si el paquete no fue pagado y no paso la fecha de inicio podemos agregar servicio al paquete
	}
	
	
	
	
	
	
	
}
