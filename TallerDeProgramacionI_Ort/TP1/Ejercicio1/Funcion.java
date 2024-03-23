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
	
	public void agregarAsientos(Asiento asiento) {
		this.asientos.add(asiento);
	}


	
	public String mostrarFuncion() {
		return "Dia: "+dia+"  -  Hora: "+hora;
	}
	
	@Override
	public String toString() {
		return "Funcion [dia=" + dia + ", hora=" + hora + "]  | Asientos " + asientos;
	}




	public String getDia() {
		return dia;
	}




	public String getHora() {
		return hora;
	}

	
	
	
	
	
	
	
	
	
}
