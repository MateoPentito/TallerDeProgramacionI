package Ejercicio2;

public abstract class ArchivoMultimedia extends Archivo{

	private int duracionEnSegundo;
	private boolean estaEnReproduccion;
	
	public ArchivoMultimedia(String nombre, double peso, String localizacion, boolean estaAbierto,int duracionEnSegundo,boolean estaEnReproduccion) {
		super(nombre, peso, localizacion, estaAbierto);
		this.duracionEnSegundo=duracionEnSegundo;
		this.estaEnReproduccion=estaEnReproduccion;
	}

	
	
	public abstract void reproducirse();
	public abstract void pararse();



	@Override
	public String toString() {
		return super.toString()+" -- ArchivoMultimedia [duracionEnSegundo=" + duracionEnSegundo + ", estaEnReproduccion="
				+ estaEnReproduccion + "]";
	}
	
	
}
