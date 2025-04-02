
import java.io.*;
public class FileDataSheet {
	
	private String getTipo(File _f) {
		return _f.isFile() ? "Fichero" : "Direcotorio";
	}
	private String SiNo(Boolean q) {
		return q ? "Sí­" : "No";
	}
	public void GetFicha(String ruta) {
		
		File f = new  File(ruta);		// Crear objeto File
		
		if (f.exists()) {
			
			System.out.println("Nombre        : " + f.getName());
			System.out.println("Ruta relativa : " + f.getPath());
			System.out.println("Ruta absoluta : " + f.getAbsolutePath());
			System.out.println("Lectura       : " + SiNo(f.canRead()));
			System.out.println("Escritura     : " + SiNo(f.canWrite()));
			System.out.println("Tamaño        : " + f.length() + " Bytes");
			System.out.println("Tipo          : " + getTipo(f));
				
			
		}
		else {
			
			System.out.println("No se ha podido obtener información\n");
		}
			
	
		
	} // GetFicha
	
} // FileDataSheet
