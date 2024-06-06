package Modelos;

import java.time.LocalDate;

public class AlquilerTransporte extends ServicioSimple {
	
	
	private String pais;
	private String ciudadAlquiler;
	private LocalDate fechaSalida;
	private LocalDate fechaDevolucion;
	private double costoPorDia;
	private double importeGarantia;
	
	
	public AlquilerTransporte(double costoBase, int cantPersonas, String pais, String ciudadAlquiler,
			LocalDate fechaSalida, LocalDate fechaDevolucion, double costoPorDia, double importeGarantia) {
		super(costoBase, cantPersonas);
		if(cantPersonas > 10 || cantPersonas <= 0) {
			new RuntimeException("La cantidad de personas limite es de 10");
		}
		
		if(pais.isEmpty() || ciudadAlquiler.isEmpty()) {
			new RuntimeException("Pais y ciudad no pueden estar vacíos");
		}
		
		if(fechaSalida == null || fechaDevolucion == null) {
			new RuntimeException("La fecha de salida y la fecha de devolucion no pueden estar nulos");
		}
		
		if(costoPorDia <= 0 || importeGarantia <= 0) {
			new RuntimeException("El costo y la garantia no pueden ser menores o iguales a 0");
		}
		this.pais = pais;
		this.ciudadAlquiler = ciudadAlquiler;
		this.fechaSalida = fechaSalida;
		this.fechaDevolucion = fechaDevolucion;
		this.costoPorDia = costoPorDia;
		this.importeGarantia = importeGarantia;
	}


	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
