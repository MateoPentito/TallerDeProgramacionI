package Electrodomesticos;

public class Televisor extends Producto{

	private int dimension;
	private boolean esSmart;
	
	public Televisor(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, double precio,int dimension,boolean esSmart) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.dimension=dimension;
		this.esSmart=esSmart;
	}
	


	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+ " [dimension=" + dimension + ", esSmart=" + esSmart + "]";
	}
	
	

}
