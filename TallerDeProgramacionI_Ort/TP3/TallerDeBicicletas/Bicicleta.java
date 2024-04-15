package TallerDeBicicletas;

public class Bicicleta {
	
	private String marca;
	private String modelo;
	private double cantidadDeKm;
	
	public Bicicleta(String marca, String modelo, double cantidadDeKm) {
		this.marca = marca;
		this.modelo = modelo;
		this.cantidadDeKm = cantidadDeKm;
	}

	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getCantidadDeKm() {
		return cantidadDeKm;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+": marca=" + marca + ", modelo=" + modelo + ", cantidadDeKm=" + cantidadDeKm;
	}
	
	
	  
	
}
