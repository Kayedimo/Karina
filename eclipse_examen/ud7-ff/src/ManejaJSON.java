import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ManejaJSON {

	
	/**
	 * Convierte un String en formato Json a un objeto de tipo coincidente
	 * @param documento
	 * @return
	 */
	public Empleado JsonToObject(String documento) {
		
		Empleado e = new Empleado();
		
		Gson json = new Gson();
		
		e = json.fromJson(documento, Empleado.class);
		
		return e;
	}  // stringToJson


	/**
	 * Convierte un objeto propio en un String en formato Json 
	 * @param objeto a convertir
	 * @return String en formato json del objeto
	 */
	public String objectToJson(Empleado e) {
		
		String s;
		
		Gson json = new Gson();
		
		s = json.toJson(e, Empleado.class);
		
		return s;
	}  // stringToJson
	
	
	public String objectToPrettyJson(Empleado e) {
		
		final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		final String JsonBonito = prettyGson.toJson(e);
		
		return JsonBonito;
		
	}

	public ArrayList<Empleado> objectFromJsonFile(String fileName) throws IOException{
		
		 Reader reader = Files.newBufferedReader(Paths.get(fileName));
		 ArrayList<Empleado> datosemp = new Gson().fromJson(reader, new TypeToken<List<Empleado>>() {}.getType());
		return datosemp;
	}

	
	public void escribeFichJSON(ArrayList<Empleado> ae,String nfich) {
		
		
		try {
			BufferedWriter fbw = new BufferedWriter(new FileWriter(nfich,false));
		
			fbw.write("[");
			for ( int i=0; i<ae.size();i++) {
				
				String reg = this.objectToJson(ae.get(i));
				fbw.write(reg);
				
				if (i!= ae.size()-1) fbw.write(",");
				fbw.newLine();		
			}
			fbw.write("]");
		
			fbw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
