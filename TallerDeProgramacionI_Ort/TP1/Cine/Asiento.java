package Cine;

public class Asiento {

	private int fila;
	private char letra;
	private Estado estado;

	public Asiento(int fila, char letra) {
		setFila(fila);
		setLetra(letra);
		this.estado = estado;
	}

	@Override
	public String toString() {
		return " Asiento [fila=" + fila + ", letra=" + letra + ", estado=" + estado + "] ";
	}
	
	private void setFila(int fila) {
		if(fila >= 1 && fila <= 20) {
			this.fila=fila;
		}else {
			System.out.println("Error, debe ingresar un fila entre 1 y 20");
		}
	}
	
	private void setLetra(char letra) {
		if(letrasDispobiles(letra)) {
			this.letra=letra;
		}else {
			System.out.println("Error, debe ingresar una letra entre A y K");
		}
	}
	
	
	private boolean letrasDispobiles(char letra) {
		boolean letraEncontrada=false;
		if(letra=='a'||letra=='b'||letra=='c'||letra=='d'||letra=='e'||letra=='f'||
				letra=='g'||letra=='h'||letra=='i'||letra=='j'||letra=='k') {
			letraEncontrada = true;
		}
		return letraEncontrada;
	}
	
	public void modificarEstado(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}

	public int getFila() {
		return fila;
	}

	public char getLetra() {
		return letra;
	}
	
	
}
