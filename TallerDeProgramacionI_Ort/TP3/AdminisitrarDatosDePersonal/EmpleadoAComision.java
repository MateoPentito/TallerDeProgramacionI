package AdminisitrarDatosDePersonal;

public class EmpleadoAComision extends Personal{

	private static final int SALARIO_FIJO=20000;
	private int numeroClientesCaptados;
	private double montoACobrarPorCliente;
	
	
	public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso,int numeroClientesCaptados,double montoACobrarPorCliente) {
		super(dni, nombre, apellido, anioIngreso);
		this.numeroClientesCaptados=numeroClientesCaptados;
		this.montoACobrarPorCliente=montoACobrarPorCliente;
	}


	@Override
	public double obtenerSalarios() {
		double valor=numeroClientesCaptados * montoACobrarPorCliente;
		if(valor < SALARIO_FIJO) {
			valor = SALARIO_FIJO;
		}
		return valor;
	}


	public int getNumeroClientesCaptados() {
		return numeroClientesCaptados;
	}
	

	
	
	
	
	
	
	
	

}
