package Ejercicio1;

import java.util.ArrayList;

public class Cine {

	private String sala;
	private ArrayList<Funcion> funciones;
	private ArrayList<Entrada> entradas;

	public Cine(String sala) {
		this.sala = sala;
		this.funciones = new ArrayList<>();
		this.entradas = new ArrayList<>();
	}

	public boolean procesarEntradas(ArrayList<Entrada> entrada) {
		boolean procesoEntrada = false;
		for (int i = 0; i < this.funciones.size(); i++) {

			for (int j = 0; j < this.entradas.size(); j++) {

				if (this.funciones.get(i).equals(entrada.get(j).getFuncion())) {
					if(this.entradas.get(j).getAsiento().getEstado() == Estado.RESERVADO) {
						this.entradas.get(j).cumplirAsiento();
						procesoEntrada = true;
					}
				}

			}
		}

		return procesoEntrada;
	}

	public ArrayList<Entrada> emitirEntradas() {
		ArrayList<Entrada> entrada = this.entradas;

		for (int i = 0; i < this.funciones.size(); i++) {
			for (int j = 0; j < this.entradas.size(); j++) {
				if (this.funciones.get(i).equals(entrada.get(j).getFuncion())) {
					this.entradas.get(j).reservarAsiento();
				}
			}
		}

		return entrada;
	}
	
	public void mostrarEntradas() {
		for(Entrada entrada : this.entradas) {
			System.out.println("Sala: " + sala + " - " + entrada.mostrarEntrada()+"\n");
		}
	}
	

	public void agregarEntrada(Entrada entrada) {
		this.entradas.add(entrada);
	}

	public void agregarFuncion(Funcion funcion) {
		this.funciones.add(funcion);
	}

}
