
import java.io.File;
import java.io.IOException;


public class FilesMain {

	public static int v;

	public static void main(String[] args) {
		
		String argumento1;

		argumento1 = "c:" + File.separator + "Windows"; // Entrada directa

//****************************************************************************
//***** Listar un directorio

		ListDir contenido = new ListDir();
		System.out.println("Lista de Archivos:");
		System.out.println("Ruta : " + argumento1);
		System.out.println("----------------------------------------------------------------------");
		contenido.Listadir(argumento1);

//****************************************************************************
//***** Obtener las propiedades de un archivo		
		FileDataSheet archivo = new FileDataSheet();
		argumento1 = "c:" + File.separator + "Windows" + File.separator + "win.ini"; // Entrada directa	
		System.out.println("\nFicha del archivo:");
		System.out.println("----------------------------------------------------------------------");
		archivo.GetFicha(argumento1);

		
	} // main
		
} // Class Files Main

