package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		
		//SALA DE CINE//
		Cine cine = new Cine("Toy Story 4");
		
		//FUNCION//		
		Funcion funcion1 = new Funcion("23/03/2024","20:00");
		
		//ASIENTOS//
		Asiento asiento1 = new Asiento(1,'a',Estado.LIBRE);
		Asiento asiento2 = new Asiento(1,'b',Estado.LIBRE);
		Asiento asiento3 = new Asiento(1,'c',Estado.LIBRE);
		Asiento asiento4 = new Asiento(1,'d',Estado.LIBRE);

		//METODOS//
		funcion1.agregarAsientos(asiento1);
		funcion1.agregarAsientos(asiento2);
		funcion1.agregarAsientos(asiento3);
		funcion1.agregarAsientos(asiento4);
		System.out.println(funcion1.toString()); 
		
		
	}

}
