package ConcesionAutopista;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacion {

	private ArrayList<Cabina> cabinas;
	private ArrayList<Cabina> cabinasEncontradas ;
	private int id;
	private String descripcion;

	public Estacion(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<>();
		this.cabinasEncontradas = new ArrayList<>();
	}

	public int dameHoraActual() {
		LocalDateTime locaDate = LocalDateTime.now();
		int hours = locaDate.getHour();
		// System.out.println("Hora actual: " + hours);
		return hours;
	}
	
	public void cabinasConEfectivo() {
		int i=0;
		boolean encontrada = false;
		
		while(i<this.cabinas.size() && encontrada == false) {
			if(this.cabinas.get(i).getTipoDeMedioDePago() == TipoDePago.EFECTIVO) {
				cabinasEncontradas.add(this.cabinas.get(i));
				encontrada = true;
			}else {
				i++;
			}
		}
		//⧹n
		System.out.println(toString());
		System.out.println(this.cabinas.get(i).toString());
	}
	

	public double cobrar(Vehiculo vehiculo) {
		double importeFinal = 0;
		boolean importeEncontrado = false;
		int i = 0;
		
		while (i < this.cabinas.size() && importeEncontrado == false) {

			if (horaPico() == true) {
				importeFinal = this.cabinas.get(i).cobrar(vehiculo) * porcentajeHoraPico();
				importeEncontrado = true;
			} else {
				importeFinal = this.cabinas.get(i).cobrar(vehiculo);
			}
			i++;
		}

		System.out.println("Importe a cobrar al vehiculo " + vehiculo.getPatente() + ": $" + importeFinal);
		return importeFinal;

	}

	public void agregarCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	private boolean horaPico() {
		boolean esHoraPico = false;
		if (dameHoraActual() >= 6 && dameHoraActual() <= 10 || dameHoraActual() >= 17 && dameHoraActual() <= 20) {
			esHoraPico = true;
		}
		return esHoraPico;
	}

	private double porcentajeHoraPico() {
		return 1.08;
	}

	@Override
	public String toString() {
		return "Estacion -- "+descripcion;
	}

}
