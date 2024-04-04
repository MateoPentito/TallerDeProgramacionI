package Ejercicio2;

public class ArchivoDeAudio extends ArchivoMultimedia{


	private Formato formato;
	private String artista;
	private String album;
	
	public ArchivoDeAudio(String nombre, double peso, String localizacion, boolean estaAbierto, int duracionEnSegundo,
			boolean estaEnReproduccion,Formato formato,String artista,String album) {
		super(nombre, peso, localizacion, estaAbierto, duracionEnSegundo, estaEnReproduccion);
		this.formato=formato;
		this.artista=artista;
		this.album=album;

	}

	@Override
	public void abrirse() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isEstaAbierto() {
		// TODO Auto-generated method stub
		return super.isEstaAbierto();
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
		return super.toString()+" -- ArchivoDeAudio [formato=" + formato + ", artista=" + artista + ", album=" + album + "]";
	}

}
