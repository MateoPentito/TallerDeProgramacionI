package Empleado;

public class Asalariado extends Empleado {

	private float sueldo;

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public float calcularPago() {
		return sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + calcularPago();
	}

}
