package Electrodomesticos;

public class Licuadora extends Producto {

	private int potencia;
	private int cantVelocidad;
	
	
	public Licuadora(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, double precio,int potencia,int cantVelocidad) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.potencia=potencia;
		this.cantVelocidad=cantVelocidad;
	}


	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+" [potencia=" + potencia + ", cantVelocidad=" + cantVelocidad + "]";
	}

	
	
	
	
}
