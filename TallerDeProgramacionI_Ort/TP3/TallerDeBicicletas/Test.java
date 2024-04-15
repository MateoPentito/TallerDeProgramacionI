package TallerDeBicicletas;

public class Test {

	public static void main(String[] args) {
		
		//SE CREA EL TALLER//
		Taller taller = new Taller("Taller Vicente Lopez");
		//SE CREAN BICICLETAS//
		Bicicleta b1 = new Bicicleta("BMX","2023",1300);
		BicicletaElectrica b2 = new BicicletaElectrica("BMX","2021",200,220);
		//SE AGREGAN BICICLETAS AL TALLER//
		taller.agregarBicicleta(b1);
		taller.agregarBicicleta(b2);		
	 	
		System.out.println(taller.cantServiciosPosibles()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
