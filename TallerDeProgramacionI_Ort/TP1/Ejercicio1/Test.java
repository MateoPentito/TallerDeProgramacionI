package Ejercicio1;

public class Test {

	public static void main(String[] args) {

		// SALA DE CINE//
		Cine sala = new Cine("Toy Story 4");

		// FUNCIONES//
		Funcion funcion1 = new Funcion("23/03/2024", "20:00");
		Funcion funcion2 = new Funcion("24/03/2024", "15:00");

		// SE AGREGAN FUNCIONES//
		
		sala.agregarFuncion(funcion1);
		sala.agregarFuncion(funcion2);

		// ASIENTOS//
		Asiento asiento1 = new Asiento(1, 'a');
		Asiento asiento2 = new Asiento(1, 'b');
		Asiento asiento3 = new Asiento(1, 'c');
		Asiento asiento4 = new Asiento(1, 'd');

		// ENTRADA//
		Entrada entrada1 = new Entrada(funcion1, asiento1);
		Entrada entrada2 = new Entrada(funcion1, asiento2);
		Entrada entrada3 = new Entrada(funcion2, asiento3);
		Entrada entrada4 = new Entrada(funcion2, asiento4);

		// SE AGREGAN ASIENTOS A LAS FUNCIONES//
		funcion1.agregarAsientos(asiento1);
		funcion1.agregarAsientos(asiento2);
		funcion2.agregarAsientos(asiento3);
		funcion2.agregarAsientos(asiento4);

		// SE AGREGAN ENTRADAS A LA SALA//
		sala.agregarEntrada(entrada1);
		sala.agregarEntrada(entrada2);
		sala.agregarEntrada(entrada3);
		sala.agregarEntrada(entrada4);

		// PROCESAR ENTRADAS//
		sala.procesarEntradas(sala.emitirEntradas());

		// MOSTRAR ENTRADAS//
		sala.mostrarEntradas();

	}

}
