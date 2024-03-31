package Electrodomesticos;

import java.util.ArrayList;
import java.util.Scanner;

public class CasaElectrodomestico {

	Scanner input = new Scanner(System.in);

	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Producto> productosComprados;
	
	public CasaElectrodomestico(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.productosComprados = new ArrayList<>();
	}

	public void cargarProductos(Producto producto) {
		this.productos.add(producto);

	}

	public void ofrecerProductos() {
		int cantidad = 1;
		String opcion;

		System.out.println("Bienvenido/a a " + nombre + ", estos son nuestros productos:\n");

		for (Producto producto : this.productos) {
			System.out.println(cantidad + "_" + producto.toString());
			cantidad++;
		}
		do {
			System.out.println("\nEscriba el producto que desee agregar al carrito ---/--- escriba FIN para salir:");
			opcion = input.nextLine();
			validarProducto(opcion);						
		}while(!opcion.equals("fin".toLowerCase())); 
		mostrarCompras();
		

	}

	private void validarProducto(String nombre) {
		int i = 0;
		boolean encontrado = false;

		while (i < this.productos.size() && encontrado == false) {
			if (this.productos.get(i).getClass().getSimpleName().toLowerCase().equals(nombre.toLowerCase())) {
				System.out.println(this.productos.get(i).mostrarDatos());
				productosComprados.add(this.productos.get(i));
				encontrado = true;
			}
			i++;
		}

	}
	
	private void mostrarCompras() {
		double precio = 0;
		System.out.println("-----------------TICKET-----------------\n");
		for(Producto producto : this.productosComprados) {
			System.out.println("ARTICULO: "+producto.toString());
			precio += producto.getPrecio();
		}
		System.out.println("TOTAL: $"+precio);
	}
	

}
