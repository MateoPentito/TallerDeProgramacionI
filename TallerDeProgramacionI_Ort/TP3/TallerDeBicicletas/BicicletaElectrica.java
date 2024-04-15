package TallerDeBicicletas;

public class BicicletaElectrica extends Bicicleta{

	private int potenciaEnWatts;
	
	public BicicletaElectrica(String marca, String modelo, double cantidadDeKm,int potenciaEnWatts) {
		super(marca, modelo, cantidadDeKm);
		this.potenciaEnWatts=potenciaEnWatts;
		}

	
	
	
	@Override
	public String toString() {
		return super.toString()+" potenciaEnWatts=" + potenciaEnWatts;
	}




	public int getPotenciaEnWatts() {
		return potenciaEnWatts;
	}
	
	@Override
	public double getCantidadDeKm() {
		return super.getCantidadDeKm();
	}

}
