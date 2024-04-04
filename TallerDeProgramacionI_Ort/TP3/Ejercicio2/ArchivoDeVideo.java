package Ejercicio2;

public class ArchivoDeVideo extends ArchivoMultimedia{


	private Formato formato;
	private int alto;
	private int ancho;
	

	public ArchivoDeVideo(String nombre, double peso, String localizacion, boolean estaAbierto, int duracionEnSegundo,
			boolean estaEnReproduccion,Formato formato,int alto,int ancho) {
		super(nombre, peso, localizacion, estaAbierto, duracionEnSegundo, estaEnReproduccion);
		this.formato=formato;
		this.alto=alto;
		this.ancho=ancho;

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
	public void reproducirse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pararse() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return super.toString()+" -- ArchivoDeVideo [formato=" + formato + ", alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	
	
}
