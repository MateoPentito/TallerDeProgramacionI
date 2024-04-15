package ConcesionAutopista;

import java.util.ArrayList;

public class Cabina {

	private int id;
	private MedioDePago medioDePago;
	private ArrayList<Vehiculo> vehiculos;
	
	public Cabina(int id, MedioDePago medioDePago) {
		this.id = id;
		this.medioDePago = medioDePago;
		this.vehiculos = new ArrayList<>() ;
	}
	
	
	public double cobrar(Vehiculo vehiculo) {
		return calcularDescuento(vehiculo);
	}
	
	private double calcularDescuento(Vehiculo vehiculo) {
		double descuento = (vehiculo.tarifaACobrar() - (vehiculo.tarifaACobrar() * medioDePago.descuento(getMedioDePago())));
		return descuento ;
	}


	public int getId() {
		return id;
	}


	public TipoDePago getTipoDeMedioDePago() {
		return medioDePago.getTipo();
	}
	
	public MedioDePago getMedioDePago() {
		return medioDePago;
	}


	@Override
	public String toString() {
		return "Cabina id= "+id+" se cobra con "+getTipoDeMedioDePago();
	}
	
	
}
