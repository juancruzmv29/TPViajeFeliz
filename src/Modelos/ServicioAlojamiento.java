package Modelos;

import java.time.LocalDate;

public class ServicioAlojamiento extends ServicioSimple {
	
	private String nombreHotel;
	private String pais;
	private String ciudadDestino;
	private double costoDiario = 0;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private double costoPorDia;
	private double costoTraslado;
	
	
	public ServicioAlojamiento(double costoBase, int cantPersonas, String nombreHotel, String pais,
			String ciudadDestino, LocalDate fechaEntrada, LocalDate fechaSalida, double costoPorDia,
			double costoTraslado) {
		super(costoBase, cantPersonas);
		if(cantPersonas > 5 || cantPersonas <= 0) {
			new RuntimeException("Pueden alojarse hasta 5 personas");
		}
		if(nombreHotel.isEmpty() || pais.isEmpty() || ciudadDestino.isEmpty()) {
			new RuntimeException("El nombre del hotel, el país o la ciudad no pueden estar vacíos");
		}
		if(fechaEntrada == null || fechaSalida == null) {
			new RuntimeException("Las fechas no pueden ser nulas");
		}
		
		if(costoPorDia <= 0 || costoTraslado <= 0)
		
		this.nombreHotel = nombreHotel;
		this.pais = pais;
		this.ciudadDestino = ciudadDestino;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.costoPorDia = costoPorDia;
		this.costoTraslado = costoTraslado;
	}


	@Override
	public double calcularCostoServicio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
