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

	public void procesarEntradas(ArrayList<Entrada> entrada) {
		for (int i = 0; i < this.funciones.size(); i++) {
			

			for (int j = 0; j < this.entradas.size(); j++) {
				
				if (this.funciones.get(i).equals(entrada.get(j).getFuncion())){
					System.out.println("Sala: "+sala+ " - "+this.entradas.get(j).mostrarEntrada()+"\n");

				}
				
			}
		}

	}

	public ArrayList<Entrada> emitirEntradas() {
		ArrayList<Entrada> entrada;
		entrada = this.entradas;
		return entrada;
	}

	public void agregarEntrada(Entrada entrada) {
		this.entradas.add(entrada);
	}

	public void agregarFuncion(Funcion funcion) {
		this.funciones.add(funcion);
	}
	
}
