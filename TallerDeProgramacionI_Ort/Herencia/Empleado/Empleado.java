package Empleado;

public class Empleado {
	
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	public float calcularPago() {
		return 0.0f;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+" "+nombre+" gana: ";
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}











	
	
	
	
	
	
	
	
	
	
	
}
