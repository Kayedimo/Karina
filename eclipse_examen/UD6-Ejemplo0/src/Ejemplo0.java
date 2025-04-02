import java.util.HashMap;
import java.util.Map.Entry;

public class Ejemplo0 {

	public Ejemplo0() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String [] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(921, "Juan Alcántara");
		m.put(555, "Ana Diaz");
		m.put(212, "José Moreno");
		m.put(333, "Noelia");
		m.put(666, "Joao");
		m.put(888, "Roberto");

		System.out.println();
		System.out.println("Recupera elemento con clave 555");
		System.out.println(m.get(555));
		System.out.println("Recorrer HashMap por clave"); //Recorrerun HashMap: sino se claves
		for(Integer clave : m.keySet()) {
			System.out.println("Clave: "  + clave + " Valor: " + m.get(clave));
		}
		System.out.println("Recorrer HashMap con Entry"); //Recorrerun HashMap: sino se claves
		for (Entry<Integer, String> par : m.entrySet()) {
			System.out.println("Clave: "  + par.getKey() + " Valor: " + par.getValue());
	}
		
	}
}
