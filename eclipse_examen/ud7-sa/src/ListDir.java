

import java.io.*;

/**
 * ListDir : obtiene la lista de ficheros existentes en la ruta facilitada y la muestra en pantalla
 * @author root
 *
 */

public class ListDir {

	public String archivos[];
	
	/**
	 * Listadir		Muestra en pantalla la lista de archivos de la ruta especificada
	 * @param ruta
	 */
	public void Listadir(String ruta) {
		
		File f = new  File(ruta);		// Crear objeto File
		
		archivos = f.list();			// 'dir'		
		if (archivos.length > 0) {	    // Directorio con archivos
		for (int i=0; i< archivos.length; i++){
			
			System.out.println(archivos[i]);			
		}
		} else {						// directorio vacío
			
			System.out.println("No archivos en la ruta especificada\n");
		}
	} 	// Listadir
	
	/**
	 * Getdir	Devuelve un array con la lista de nombres de los archivos encontrados en la ruta
	 * @param ruta
	 * @return archivos : Lista con los nombres de los ficheros 
	 */
	
	public String[] Getdir(String ruta) {
		
		File f = new  File(ruta);		// Crear objeto File
		
		archivos = f.list();			// 'dir'
		
		return archivos;
	}	// Getdir
}		// Listdir
