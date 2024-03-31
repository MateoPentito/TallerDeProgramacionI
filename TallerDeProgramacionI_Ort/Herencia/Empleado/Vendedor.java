package Empleado;

public class Vendedor extends SubContratado {

	private float porcentaje;

	public Vendedor(String nombre, int edad, int cantHora, float precioHora, float porcentaje) {
		super(nombre, edad, cantHora, precioHora);
		this.porcentaje = porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public float calcularPago() {
		return super.calcularPago() * ((porcentaje / 100)+1);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
