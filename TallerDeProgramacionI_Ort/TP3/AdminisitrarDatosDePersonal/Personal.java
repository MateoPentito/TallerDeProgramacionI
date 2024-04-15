package AdminisitrarDatosDePersonal;

public abstract class Personal {

	private String dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;
	
	public Personal(String dni, String nombre, String apellido, int anioIngreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}
	
	public abstract double obtenerSalarios();

	public int getAnioIngreso() {
		return anioIngreso;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +" [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", anioIngreso=" + anioIngreso
				+ "]";
	}

	public String getDni() {
		return dni;
	}
	
	
	
	
}
