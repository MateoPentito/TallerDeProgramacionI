package Empleado;

public class Test {

	public static void main(String[] args) {


		Asalariado asalariado = new Asalariado("Jose",30,10000);
		SubContratado subcontratado = new SubContratado("Carlos",23,50,100);
		Vendedor vendedor1 = new Vendedor("Pedro",25,100,200,5);
		Vendedor vendedor2 = new Vendedor("Maria",30,100,200,10);
		
		System.out.println( asalariado.toString());
		System.out.println(subcontratado.toString());
		System.out.println(vendedor1.toString());
		System.out.println(vendedor2.toString());
	}

}
