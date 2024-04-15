package AdminisitrarDatosDePersonal;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Personal> personal;
	private String nombre;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.personal = new ArrayList<>();
	}

	public void mostrarSalarios() {
		for (Personal personal : this.personal) {
			if (personal instanceof EmpleadoSalarioFijo) {
				System.out.println(personal.toString() + " cobra $" + personal.obtenerSalarios());
			}
			if (personal instanceof EmpleadoAComision) {
				System.out.println(personal.toString() + " cobra $" + personal.obtenerSalarios());
			}
		}
	}

	public Personal empleadoConMasClientes() {
		EmpleadoAComision empleadoARet = null;
		int max = 0;
		for (Personal personal : this.personal) {
			if (personal instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision)personal;
				int cantCli = eac.getNumeroClientesCaptados();
				if(cantCli > max) {
					empleadoARet = eac;
					max = cantCli;
				}
			}
		}
		return empleadoARet;
	}

	public void agregarPersonal(Personal persona) {
		this.personal.add(persona);
	}

}
