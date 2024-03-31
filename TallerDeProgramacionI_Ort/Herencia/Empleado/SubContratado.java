package Empleado;

public class SubContratado extends Empleado {

	private int cantHora;
	private float precioHora;
	
	public SubContratado(String nombre, int edad,int cantHora,float precioHora) {
		super(nombre, edad);
		this.cantHora=cantHora;
		this.precioHora=precioHora;
	}

	@Override
	public float calcularPago() {
		return 	precioHora * cantHora;
	}

	
	@Override
	public String toString() {
		return super.toString()+calcularPago();
	}

	public int getCantHora() {
		return cantHora;
	}

	public void setCantHora(int cantHora) {
		this.cantHora = cantHora;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
