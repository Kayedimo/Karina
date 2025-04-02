import modelo.Medida;


import java.io.FileNotFoundException;
import java.io.IOException;

//--- Clases de controladores de ficheros
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
//----------------------------------------

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Clase principal para la ejecuci�n de los ejemplos
 * @author rmsvdp
 *
 */
public class FilesMain {

	public static ArrayList<Medida> misMedidas = new ArrayList<Medida>();
	
	
	public static void main(String[] args) {
		/*
		System.out.println("--------------------------------------");		
		FicherosTexto();
		System.out.println("--------------------------------------");
		FicherosBinarios();
		System.out.println("--------------------------------------");
		*/
		LeerarchivoCsv();
		System.out.println("Fin del programa");
	} // main
		
	public static void LeerarchivoCsv() {
		
		String ruta_csv = "c:\\rms\\medida.csv";
		File f = new File(ruta_csv);		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			// Leer archivo y presentar en pantalla
			String linea;
			int posicion = 1;
					try {
					while ((linea = br.readLine())!=null) {
						//System.out.println(posicion + " : " + linea);
						Medida m = new Medida(linea);
						misMedidas.add(m);
						posicion++;
					}
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			System.out.println("MEDIDAS CARGADAS DESDE : "+ ruta_csv);	
			System.out.println("--------------------------------------");
			System.out.println("FECHA      T    H");
			System.out.println("--------------------------------------");
			for(Medida m : misMedidas) {
				System.out.println(m.getFecha()+ "  " + m.getTemperatura() + "  "+ m.getHumedad());
				//m.setHumedad(10+m.getHumedad());
			}
			System.out.println("--------------------------------------");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2 = new File("c:\\rms\\nuevasMedidas.csv");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
			bw.write("[");
			int i=0;
			for(Medida m : misMedidas) {			
				// Formato csv ----------------------
				//bw.write(m.toString());  
				//bw.newLine();
				// -----------------------------------
				// Formato json ----------------------
				i++;
				bw.write(m.toJson());
				if (i<misMedidas.size())bw.write(",");
				// -----------------------------------				
			}
			bw.write("]");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} // archivos csv
	
	
	
	
	
	
	public static void FicherosTexto() {
		
		String ruta;
		String contenido;
		ruta = "c:\\rms\\FicheroTexto.txt";
		System.out.println("Lectura y Escritura de archivos de texto");
		System.out.println("--------------------------------------");
		ReadWriteText rwt = null;
		int _EOF = -1;

		// Empezamos con la escritura
		try {
			rwt = new ReadWriteText(ruta);
			System.out.println(" --  1.- Escribe  en modo texto ...");
			
			rwt.writeBuffered("Primera Linea de Texto");
			rwt.writeBufferednewLine();
			rwt.writeBuffered("Segunda Linea de Texto");
			rwt.writeBufferednewLine();
			rwt.CloseBWrite();
		} catch (IOException e) {
			System.out.println(" -- Error no se puede escribir del archivo ...");
			//e.printStackTrace();
		}

		System.out.println(" --  2.- Lee líneas y lo muestra por consola ...");
	

		String linea;
		try {
			while ((linea = rwt.readBuffered())!=null) {
				   System.out.println("LECTURA: "+ linea);		   
			   }
			rwt.CloseRead();
			
		} catch (IOException e) {
			System.out.println(" -- Error no se puede leer del archivo ...");
			//e.printStackTrace();
		}
		
		   try {
			while ((linea = rwt.readBuffered())!=null) {
				   System.out.println("LECTURA:"+ linea);		   
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	} // ficheros de texto
	
		public static void FicherosBinarios() {
			
			String ruta;
			String contenido;
			ruta = "c:\\rms\\FicheroBinario.bin";
			System.out.println("Lectura y Escritura de archivos binarios");
			System.out.println("--------------------------------------");

			ReadWriteRaw rwr = null;

			int _EOF = -1;

			// Empezamos con la escritura de ficheros binarios byte a byte
			try {
				rwr = new ReadWriteRaw(ruta,false);
				System.out.println(" --  1.- Escribe en modo binario  ...");
				// Escribir 8 bytes ( #00 - #07)
				byte[] _datos = {0,1,2,3,4,5,6,7};
					rwr.WriteBytes(_datos);
				rwr.CloseWrite();
			} catch (IOException e) {
				System.out.println(" -- Error no se puede escribir en el archivo ...");
				//e.printStackTrace();
			}
			
			System.out.println(" --  2.- Lee archivo y lo muestra por consola ...");
			try {
				int j = 0;
				byte[] payload = {0};
				int off = 0;
				int tam = 1; // Leer solo un byte
				while (rwr.ReadBytes(payload,off,tam)!= _EOF) {
					   System.out.print(String. format("%02x", payload[0]).toUpperCase());
				       System.out.print(" | ");
				       } // while				   
				System.out.println("<EOF>");    
		
				rwr.CloseRead();
				
			} catch (IOException e) {
				System.out.println(" -- Error no se puede leer del archivo ...");
				//e.printStackTrace();
			}

		
	}   // ficheros binarios



}
