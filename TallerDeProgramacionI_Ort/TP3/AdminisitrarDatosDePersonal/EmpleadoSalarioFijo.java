package AdminisitrarDatosDePersonal;

import java.time.LocalDateTime;

public class EmpleadoSalarioFijo extends Personal{

	private double sueldoBasico;
	private LocalDateTime hoy = LocalDateTime.now();  
	
	public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso,double sueldoBasico) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoBasico=sueldoBasico;
	}

	@Override
	public double obtenerSalarios() {
		double salario = calcularSueldo();
		return salario;
	}
	
	private double calcularPorcentajeAdicional() {  
	        int resultado = hoy.getYear() - getAnioIngreso();
	        double porcentaje = 0;
	        
	        if(resultado < 2) {
	        	porcentaje = 0;
	        }if(resultado >= 2 && resultado <= 5) {
	        	porcentaje = 5;
	        }if(resultado >= 6 && resultado <= 10) {
	        	porcentaje = 10;
	        }if(resultado >= 10) {
	        	porcentaje = 15;
	        }
		return porcentaje;
	}
	
	private double calcularSueldo() {
		return sueldoBasico * calcularPorcentajeAdicional();
	}
	

}
