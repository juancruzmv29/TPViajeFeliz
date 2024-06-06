package Modelos;

import java.util.ArrayList;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String direccion;
	private static Integer codigoUnico = 0;
	ArrayList<Servicio> servicios;
	
	
	public Cliente(String dni, String nombre, String direccion) {
		if(dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty()) {
			new RuntimeException("Nombre, dni o dirección no pueden estar vacíos");
		}
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoUnico++;
		this.servicios = new ArrayList<>();
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


	public ArrayList<Servicio> getServicios() {
		return servicios;
	}


	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
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
	
	
	
	
	
	
	
}
