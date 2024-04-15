package ConcesionAutopista;

public class Vehiculo {

	private String patente;
	private Categoria categoria;
	
	public Vehiculo(String patente, Categoria categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}
	
	
	
	
	public double tarifaACobrar() {
		return categoria.tarifaSegunCategoria();
	}




	public String getPatente() {
		return patente;
	}
	
	
}
