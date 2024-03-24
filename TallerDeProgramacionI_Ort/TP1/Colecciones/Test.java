package Colecciones;

public class Test {

	public static void main(String[] args) {

		Grupo grupo = new Grupo("Grupo 1 - ORT");

		System.out.println(grupo.getCantidadIntegrantes()); 
		
		grupo.agregarIntegrantes("Mateo");
		grupo.agregarIntegrantes("Mateo");
		grupo.agregarIntegrantes("Santino");
		grupo.agregarIntegrantes("Martina");	
		grupo.agregarIntegrantes("Morena");	
		grupo.agregarIntegrantes("Martina");	
		grupo.agregarIntegrantes("Morena");	

		System.out.println(grupo.getCantidadIntegrantes()); 
		
		
	}

}
