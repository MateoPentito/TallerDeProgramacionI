package Colecciones;

public class Test {

	public static void main(String[] args) {
		
		//SE CREA EL GRUPO//
		Grupo grupo = new Grupo("Grupo 1 - ORT");

		//SE AGREGAN LOS INTEGRANTES//
		grupo.agregarIntegrantes("Mateo");
		grupo.agregarIntegrantes("Santino");
		grupo.agregarIntegrantes("Martina");	
		grupo.agregarIntegrantes("Morena");	

		//SE CONSULTA LA CANTIDAD DE INTEGRANTES//
		grupo.getCantidadIntegrantes(); 
		
		//SE OBTIENE EL INTEGRANTE POR POSICION//
		grupo.obtenerIntegrante(2); 

		//SE OBTIENE EL INTEGRANTE POR NOMBRE//
		grupo.buscarIntegrante("Morena");

		//SE REMUEVE UN INTEGRANTE//
		grupo.removerIntegrante("Santino");
		
		//SE MUESTRAN LOS INTEGRANTES//
		grupo.mostrar();
		System.out.println("------------");
		
		//SE VACIAN TODOS LOS INTEGRANTES//
		grupo.vaciar();
		
		//SE MUESTRAN LOS INTEGRANTES NUEUVAMENTES VACIOS//
		grupo.mostrar();
		
		
	}

}
