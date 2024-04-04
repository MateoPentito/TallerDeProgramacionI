package Ejercicio2;

public abstract class Archivo {

	private String nombre;
	private double peso;
	private String localizacion;
	private boolean estaAbierto;
	
	
	public Archivo(String nombre, double peso, String localizacion, boolean estaAbierto) {
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
		this.estaAbierto = estaAbierto;
	}
	
	
	public abstract void abrirse();
	
	public void cerrarse() {
		if(estaAbierto == true) {
			estaAbierto = false;
			System.out.println("Se cerrro el archivo...");
		}
	}
	public abstract void moverseDeUbicacion();


	public boolean isEstaAbierto() {
		return estaAbierto;
	}


	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", estaAbierto="
				+ estaAbierto + "]";
	}


	public String getNombre() {
		return nombre;
	}


	
	
	
}
