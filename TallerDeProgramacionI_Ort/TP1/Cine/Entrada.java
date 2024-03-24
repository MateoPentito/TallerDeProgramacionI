package Cine;

public class Entrada {

	private Funcion funcion;
	private Asiento asiento;


	public Entrada(Funcion funcion,Asiento asiento) {
		this.funcion=funcion;
		this.asiento=asiento;
	}

	
	
	public void reservarAsiento() {
		asiento.modificarEstado(Estado.RESERVADO);	
	}
	
	public void cumplirAsiento() {
		asiento.modificarEstado(Estado.CUMPLIDO);	
	}


	public String mostrarEntrada() {
		return "Dia: "+funcion.getDia() +"  -  Hora: "+ funcion.getHora()+"\n"+
				"Fila: "+asiento.getFila()+"  -  Asiento: "+asiento.getLetra() + "  =  Estado del asiento: "+ asiento.getEstado();
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
