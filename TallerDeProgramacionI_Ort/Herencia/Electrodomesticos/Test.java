package Electrodomesticos;

public class Test {

	public static void main(String[] args) {

		//CASA DE ELECTRODOMESTICOS//
		CasaElectrodomestico fravega = new CasaElectrodomestico("Fravega");
		//PRODUCTOS//
		Heladera heladera = new Heladera("Whirlpool","H2745",12,220,true,14999,250,false);
		Televisor televisor = new Televisor("Philips","49PGFS",13,220,true,14370,49,true);
		Lavarropa lavarropa = new Lavarropa("Drean","CONCEPT",14,220,true,6799,6,true);
		
		
		fravega.cargarProductos(heladera);
		fravega.cargarProductos(televisor);
		fravega.cargarProductos(lavarropa);
		
		fravega.ofrecerProductos();
		
	}

}
