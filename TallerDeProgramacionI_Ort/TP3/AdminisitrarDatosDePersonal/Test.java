package AdminisitrarDatosDePersonal;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("ORT");
		EmpleadoAComision psf1 = new EmpleadoAComision("42576380","Morena","Pentito",2023,20,8000);
		EmpleadoAComision psf2 = new EmpleadoAComision("42176240","Mateo","Pentito",2021,30,9000);
		EmpleadoAComision psf3 = new EmpleadoAComision("40576550","Martina","Pentito",2020,10,14000);
		EmpleadoSalarioFijo pac1 = new EmpleadoSalarioFijo("42565436","Santino","De parasis",2022,70000);
		EmpleadoSalarioFijo pac2 = new EmpleadoSalarioFijo("42565438","Bautista","De parasis",2010,10000);
		
		empresa.agregarPersonal(psf1);
		empresa.agregarPersonal(psf2);
		empresa.agregarPersonal(psf3);
		empresa.agregarPersonal(pac1);
		empresa.agregarPersonal(pac2);
		
		empresa.mostrarSalarios();
		System.out.println("-----------");
		System.out.println(empresa.empleadoConMasClientes()); 
	}

}
