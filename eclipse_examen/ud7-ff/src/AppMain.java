import java.io.IOException;
import java.util.ArrayList;

public class AppMain {

	
	public static void main(String[] args) {
		
		ManejaJSON mj = new ManejaJSON();
		
		
		// Obtener un objeto Empleado desde un string json
		
		String json = "{\"id\":40,\"nombre\":\"Jorge\",\"empresa\":\"Clesa\"}";
		
		System.out.println("\nConversion de cadena a objeto: ");
		System.out.println("-------------------------------");
		Empleado emple = mj.JsonToObject(json);
		System.out.println(emple);
		
		System.out.println("\nConversion de objeto a Json simple: ");
		System.out.println("-------------------------------");
		String empleadojson = mj.objectToJson(emple);
		System.out.println(empleadojson);
		
		
		System.out.println("\nConversion de objeto a Json Formateado: ");
		System.out.println("-------------------------------");
		empleadojson = mj.objectToPrettyJson(emple);
		System.out.println(empleadojson);
		
		System.out.println("\nLista de empleados desde un archivo: ");
		System.out.println("-------------------------------");
		
		ArrayList<Empleado> misEmple = new ArrayList<Empleado>();
		
		try {
			misEmple = mj.objectFromJsonFile("c:\\rms\\empleados.json");
			
			for (Empleado e : misEmple) {
				
				System.out.println(e);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nGenera Archivo desde array: ");
		System.out.println("-------------------------------");		
		mj.escribeFichJSON(misEmple, "c:\\rms\\miFichero.json");
		
		// ----------- Manejar ficheros csv 
		// -- Crear objeto a partir de string CSV
		Empleado e2 = new Empleado("90,carlos,Celta",",");
		// -- Obtener un string a partir de un objeto
		String cadena = e2.toString();
		
		
		
	}
}
