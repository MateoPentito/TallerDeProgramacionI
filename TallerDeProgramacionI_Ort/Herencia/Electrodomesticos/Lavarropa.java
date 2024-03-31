package Electrodomesticos;

public class Lavarropa extends Producto{
	
	private int cargaMaxima;
	private boolean esAutomatico;

	public Lavarropa(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, double precio,int cargaMaxima,boolean esAutomatico) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
			this.cargaMaxima=cargaMaxima;
			this.esAutomatico=esAutomatico;
	}

	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+" [cargaMaxima=" + cargaMaxima + ", esAutomatico=" + esAutomatico + "]";
	}
	
	
	
	
	
	
	
	
	

}
