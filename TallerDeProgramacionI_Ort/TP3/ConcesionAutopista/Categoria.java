package ConcesionAutopista;

public class Categoria {
	
	private TipoDeVehiculo tipoDeVehiculo;
	private double tarifa;
	
	public Categoria(TipoDeVehiculo tipoDeVehiculo, double tarifa) {
		this.tipoDeVehiculo = tipoDeVehiculo;
		this.tarifa = tarifa;
	}

	public TipoDeVehiculo getTipoDeVehiculo() {
		return tipoDeVehiculo;
	}

	public double getTarifa() {
		return tarifa;
	}
	
	public double tarifaSegunCategoria() {
		return tarifa;
	}

	
	
	
	
	
	
	
	
	
	
}

