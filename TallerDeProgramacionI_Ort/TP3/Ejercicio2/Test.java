package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		
		//SE CREA UNA COMPUTADORA//
		Computadora compu = new Computadora();
		
		//SE CREAN ARCHIVOS//
		ArchivoDeAudio ada = new ArchivoDeAudio("Paradise city", 345.00, "GnR", true, 1000,false,Formato.MP3,"GnR","Appetite for destruction");
		ArchivoDeVideo adv = new ArchivoDeVideo("Patience", 455.50,"Gnr",true,1200,false,Formato.MP4,350,480);
		ArchivoDeTexto adt1 = new ArchivoDeTexto("Clases", 5550,"Ort",true,"UTF-8",true);
		ArchivoDeTexto adt2 = new ArchivoDeTexto("Entrenamiento", 5550,"Ort",true,"UTF-8",true);
		ArchivoDeTexto adt3 = new ArchivoDeTexto("Musica", 5550,"Ort",false,"UTF-8",true);
		//SE AGREGAN ARCHIVOS A LA COMPUTADORA//
		compu.agregarArchivos(ada);
		compu.agregarArchivos(adv);
		compu.agregarArchivos(adt1);
		compu.agregarArchivos(adt2);
		compu.agregarArchivos(adt3);
		compu.mostrarArchivos();
		System.out.println("------------------------------");
		compu.cerrarTodos();
	
		System.out.println("------------------------------");
		compu.cantArchivosDeTexto();
		
		System.out.println("------------------------------");
		compu.cifrarArchivos();
	}

}
