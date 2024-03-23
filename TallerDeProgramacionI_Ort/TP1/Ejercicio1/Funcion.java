package Ejercicio1;

import java.util.ArrayList;

public class Funcion {
	
	private String dia;
	private String hora;
	private ArrayList<Asiento> asientos;

	public Funcion(String dia, String hora) {
		this.dia = dia;
		this.hora = hora;
		this.asientos = new ArrayList<>();
	}
	
	

	
	private void setDia(String dia) {
		
		this.dia=dia;
	}

	public void agregarAsientos(Asiento asiento) {
		this.asientos.add(asiento);
	}


	@Override
	public String toString() {
		return "Funcion [dia=" + dia + ", hora=" + hora + ", asientos=" + asientos + "]";
	}

	
	
	
	
	
	
	
	
	
}
