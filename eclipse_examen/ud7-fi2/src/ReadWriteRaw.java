

import java.io.*;
public class ReadWriteRaw {

	
	private 	FileInputStream filein ;
	private		FileOutputStream fileout;
	
	
	
	
	public ReadWriteRaw(String _rutaFich,Boolean _mode) throws IOException {
		
		File fichero = new File(_rutaFich);//declara fichero
		fileout = new FileOutputStream(fichero,_mode);
		filein = new FileInputStream(fichero); 
	}

	public void CloseWrite() throws IOException {
		
		fileout.close();
	}
	
	public void CloseRead() throws IOException {
		
		filein.close();
	}
	
	
	
	
	public int ReadBytes(byte[] payload, int off,int tam) throws IOException {
		 int i;
		   i = filein.read(payload,off,tam);
 
		   return i;
	}
	
	void WriteBytes(byte[] Datos) {
		   int i;
		   //crea flujo de salida hacia el fichero  
		   try  {   
		   //escribe datos en el flujo de salida 	
			   for (i=0; i<Datos.length; i++)
			       fileout.write(Datos[i]);   
			   fileout.close(); //cerrar stream de salida   
		   }
		   catch(IOException e) {System.out.println(e);}
  	} // WriteBytes
} // ReadWriteRaw