package Electrodomesticos;

public class Producto {

	private String marca;
	private String modelo;
	private int numeroSerie;
	private int voltaje;
	private boolean estado;
	private double precio;
	
	public Producto(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[producto="+getClass().getSimpleName()+", marca=" + marca + ", modelo=" + modelo+"]";
	}
	
	public String mostrarDatos() {
		return "Producto [marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", voltaje="
				+ voltaje + ", estado=" + estado + ", precio=" + precio + "]";
	}

	public double getPrecio() {
		return precio;
	}
	
}
