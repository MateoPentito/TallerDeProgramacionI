package Ejercicio1;

public class Entrada {

	private Funcion funcion;
	private Asiento asiento;


	public Entrada(Funcion funcion,Asiento asiento) {
		this.funcion=funcion;
		this.asiento=asiento;
	}

	
	
	public void reservarAsiento() {
		
		
	}


	public String mostrarEntrada() {
		return "Dia: "+funcion.getDia() +"  -  Hora: "+ funcion.getHora()+"\n"+
				"Fila: "+asiento.getFila()+"  -  Asiento: "+asiento.getLetra();
	}
	

	public Funcion getFuncion() {
		return funcion;
	}


	public Asiento getAsiento() {
		return asiento;
	}



	@Override
	public String toString() {
		return "Entrada [funcion=" + funcion + ", asiento=" + asiento + "]";
	}

	

	
	
	
	
	
	
	
	








}
