package Colecciones;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	public void vaciar() {
		this.integrantes.clear();
	}

	public void mostrar() {
		System.out.println(nombre);
		mostrarIntegrantes();
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: " + this.integrantes.size());
		for (String integrante : this.integrantes) {
			System.out.println(integrante);
		}
	}

	public String removerIntegrante(String nombreIntegrante) {
		int i = 0;
		String valorEncontrado = null;
		while (i < this.integrantes.size() && valorEncontrado == null) {
			if (this.integrantes.get(i).equals(nombreIntegrante)) {
				valorEncontrado = this.integrantes.get(i);
				this.integrantes.remove(nombreIntegrante);
			}
			i++;
		}
		return valorEncontrado;
	}

	public String buscarIntegrante(String nombre) {
		int i = 0;
		String valorEncontrado = null;
		while (i < this.integrantes.size() && valorEncontrado == null) {
			if (this.integrantes.get(i).equals(nombre)) {
				valorEncontrado = this.integrantes.get(i);
			}
			i++;
		}
		return valorEncontrado;
	}

	public String obtenerIntegrante(int posicion) {
		String valor = null;
		int i = 0;
		while (i < this.integrantes.size() && valor == null) {
			if (posicion < this.integrantes.size()) {
				valor = this.integrantes.get(posicion - 1);
			}
			i++;
		}
		return valor;
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = -1;
		int i = 0;
		boolean integranteEncontrado = false;

		while (i < this.integrantes.size() && integranteEncontrado == false) {
			if (this.integrantes.get(i).equals(nombreIntegrante)) {
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
