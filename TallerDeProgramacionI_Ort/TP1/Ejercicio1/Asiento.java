package Ejercicio1;

public class Asiento {

	private int fila;
	private char letra;
	private Estado estado;

	public Asiento(int fila, char letra, Estado estado) {
		this.fila = fila;
		this.letra = letra;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", letra=" + letra + ", estado=" + estado + "]";
	}
	
	
	
	
}
