package TallerDeBicicletas;

import java.util.ArrayList;

public class Taller {

	private String razonSocial;
	private ArrayList<Bicicleta> bicicletas;
	private ArrayList<Bicicleta> bicicletasAdmitidas;
	
	public Taller(String razonSocial) {
		this.razonSocial = razonSocial;
		this.bicicletas = new ArrayList<>();
		this.bicicletasAdmitidas = new ArrayList<>();
	}

	public ArrayList<Bicicleta>cantServiciosPosibles() {
		for(Bicicleta bicileta : this.bicicletas) {
			if(bicileta instanceof Bicicleta) {
				if(bicileta.getCantidadDeKm() <= 2000) {
					this.bicicletasAdmitidas.add(bicileta);
				}
			}else {
				if(((BicicletaElectrica) bicileta).getPotenciaEnWatts()<= 250 && ((BicicletaElectrica) bicileta).getCantidadDeKm() < 2000) {
					this.bicicletasAdmitidas.add(bicileta);
				}
			}			
		}
		return this.bicicletasAdmitidas;
	}

	public void agregarBicicleta(Bicicleta bicicleta) {
		this.bicicletas.add(bicicleta);
	}

}
