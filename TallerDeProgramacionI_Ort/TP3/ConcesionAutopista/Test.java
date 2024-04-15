package ConcesionAutopista;

public class Test {

	public static void main(String[] args) {
		//ESTACION PANAMERICANA//
		Estacion estacion = new Estacion(001,"Panamericana");
		//MEDIOS DE PAGO//
		MedioDePago sube =new MedioDePago(TipoDePago.SUBE);
		MedioDePago pase =new MedioDePago(TipoDePago.PASE);
		MedioDePago efectivo =new MedioDePago(TipoDePago.EFECTIVO);
		//CABINAS//
		Cabina c1 = new Cabina(1,sube);
		Cabina c2 = new Cabina(2,pase);
		Cabina c3 = new Cabina(3,efectivo);
		//CATEGORIAS DE VEHICULOS//
		Categoria catAuto = new Categoria(TipoDeVehiculo.AUTO,250);
		Categoria catMoto = new Categoria(TipoDeVehiculo.MOTO,150);
		Categoria catCamion = new Categoria(TipoDeVehiculo.CAMION,400);
		//VEHICULOS//
		Vehiculo auto = new Vehiculo("ABC123",catAuto);
		Vehiculo moto = new Vehiculo("QWE456",catMoto);
		Vehiculo camion = new Vehiculo("ZXC321",catCamion);

		//SE AGREGAN LAS CABINAS A LA ESTACION//
		estacion.agregarCabina(c1);
		estacion.agregarCabina(c2);
		estacion.agregarCabina(c3);
		
		//HORA ACTUAL
		estacion.dameHoraActual();		
		
		System.out.println("--------");
		estacion.cobrar(auto);
		System.out.println("--------");
		estacion.cobrar(moto);
		System.out.println("--------");
		estacion.cobrar(camion);
		System.out.println("--------");
		estacion.cabinasConEfectivo();
	
		
		
		
	
	}
}
