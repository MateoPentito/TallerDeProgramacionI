package Ejercicio2;

public class ArchivoDeTexto extends Archivo{

	private String codificacion;
	private boolean puedeCifrarContenido;
	
	public ArchivoDeTexto(String nombre, double peso, String localizacion, boolean estaAbierto,String codificacion,boolean puedeCifrarContenido) {
		super(nombre, peso, localizacion, estaAbierto);
		this.codificacion=codificacion;
		this.puedeCifrarContenido=puedeCifrarContenido;
	}
	
	
	public void cifrar() {
		if(codificacion.equals("utf-8".toUpperCase())) {
			System.out.println("Se esta cifrando el archivo: "+super.getNombre());
		}
	}

	@Override
	public void abrirse() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void moverseDeUbicacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString()+ " -- ArchivoDeTexto [codificacion=" + codificacion + ", puedeCifrarContenido=" + puedeCifrarContenido + "]";
	}

}
