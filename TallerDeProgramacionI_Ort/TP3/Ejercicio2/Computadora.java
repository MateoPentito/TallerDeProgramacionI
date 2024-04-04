package Ejercicio2;

import java.util.ArrayList;

public class Computadora {

	private ArrayList<Archivo> archivos;

	public Computadora() {
		this.archivos = new ArrayList<>() ;
	}
	
	
	public void duracionPromedio() {
		
	}
	
	public void cifrarArchivos() {
		for(Archivo archivo : this.archivos) {
			if(archivo instanceof ArchivoDeTexto) {
				((ArchivoDeTexto) archivo).cifrar();
			}
		}
	}
	
	public int cantArchivosDeTexto() {
		int cantidad=0;
		for(Archivo archivo : this.archivos) {
			if(archivo instanceof ArchivoDeTexto) {
				cantidad++;
			}
			
		}
		System.out.println(cantidad);
		return cantidad;
	}
	
	public void cerrarTodos() {
		for(Archivo archivo : this.archivos) {
			if(archivo.isEstaAbierto()) {
				archivo.cerrarse();
			}
		}
	}
	
	public void mostrarArchivos() {
		for(Archivo archivo : this.archivos) {
			System.out.println(archivo.toString());
		}
	}
	
	public void agregarArchivos(Archivo archivos) {
		this.archivos.add(archivos);
	}
	
	
	
	
	
}
