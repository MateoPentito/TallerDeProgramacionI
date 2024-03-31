package Colecciones;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = 0;
		int i = 0;
		boolean integranteEncontrado = false;

		while(i < this.integrantes.size() && integranteEncontrado == false) {
			if(this.integrantes.get(i).equals(nombreIntegrante)) {
				posicion = this.integrantes.size();
			}
			i++;
		}


		return posicion;
	}

	public void agregarIntegrantes(String nombreIntegrante) {
		this.integrantes.add(nombreIntegrante);

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
