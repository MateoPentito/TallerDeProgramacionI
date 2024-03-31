package Electrodomesticos;

public class Heladera extends Producto{

	private int capacidadLitros;
	private boolean esFrost;
	
	public Heladera(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, double precio, int capacidadLitros,boolean esFrost) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.capacidadLitros=capacidadLitros;
		this.esFrost=esFrost;
	}




@Override
public String mostrarDatos() {
	return super.mostrarDatos()+ " [capacidadLitros=" + capacidadLitros + ", esFrost=" + esFrost + "]";
}
	
	
	
	
	
}
