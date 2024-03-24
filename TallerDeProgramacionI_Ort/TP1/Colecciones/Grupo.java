package Colecciones;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = 0;
		int i = 0;
		boolean integranteEncontrado = false;

		while (i < this.integrantes.size() && integranteEncontrado == false) {
			if (this.integrantes.get(i).equals(nombreIntegrante)) {
				integranteEncontrado = true;
			}
			posicion++;
			i++;
		}

		return posicion;
	}

	public void agregarIntegrantes(String nombreIntegrante) {
		int i = 0;
		boolean encontrado = false;
		if (this.integrantes.isEmpty()) {
			this.integrantes.add(nombreIntegrante);
			System.out.println("Se agrego "+nombreIntegrante);
		} else {
			
			while(i < this.integrantes.size() && encontrado ==false) {
				
				if (!this.integrantes.get(i).equals(nombreIntegrante)) {
					this.integrantes.add(nombreIntegrante);
					System.out.println("Se agrego "+nombreIntegrante);
					encontrado = true;
					
					for(int j =0; j < this.integrantes.size();j++) {
						if(this.integrantes.get(j).equals(nombreIntegrante)) {
							System.out.println("Se remueve: "+this.integrantes.remove(j));
						}
					}
					
				}
				i++;
				

			}

		}

	}

	public int getCantidadIntegrantes() {
		int cantidadIntegrantes = this.integrantes.size();
		return cantidadIntegrantes;
	}

	public void coleccion() {
		System.out.println("Size: " + this.integrantes.size());
		for (int i = 0; i < this.integrantes.size(); i++) {
			System.out.println("Integrante: " + this.integrantes.get(i));
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
