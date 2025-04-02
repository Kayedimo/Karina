import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//TODO	1 Añadir otro garaje
//TODO  2 Modificar la búsqueda para que se le pase el garaje a buscar
//TODO  3 Añadir un coche , eligiendo el garaje


public class MainApp {

	/**
	 * HashMap de pruebas
	 */
	public static HashMap<String,Coche> miGarajeMad = new HashMap<String,Coche>();
	
	
	
	public static void main(String[] args) {
	
		// 1.- Genera un garaje de pruebas
		System.out.println("\n** Crear el garaje");
		// Genera unos coches de prueba
		
		Coche c1 = new Coche("BCN-8080","BWM 311","Blanco",2011);
		Coche c2 = new Coche("MAD-8086","Audi A5","Rojo",1983);
		Coche c3 = new Coche("BCN-4001","Mazda 6 1.9D","Negro",2001);
		Coche c4 = new Coche("MAD-6809","Fiat Coupe","Amarillo",2008);
		Coche c5 = new Coche("MAD-6502","Rover 365","Verde",2020);
		
		// Añade los coches al garaje
		
		miGarajeMad.put(c1.getMatricula(), c1);
		miGarajeMad.put(c2.getMatricula(), c2);
		miGarajeMad.put(c3.getMatricula(), c3);
		miGarajeMad.put(c4.getMatricula(), c4);
		
		System.out.println("\n** Recorrido completo del garaje");
		// 1.- Lista el garaje
		listaGaraje(miGarajeMad);
		
		System.out.println("\n** Elimina coche C3");
		// 2.- Elimina el coche c3
		eliminaCoche(c3.getMatricula());
		
		System.out.println("\n** Comprobar si está en el garaje:");
		//- ¿Está en el garaje?
		
		System.out.print("El coche : "+ c3.getModelo());
		if (miGarajeMad.containsValue(c1)) System.out.print(" no ");// contains verificar uso
		System.out.println("está en el garaje.");

		System.out.print("El coche : "+ c2.getModelo());
		System.out.println(". Su ficha es:" + c2);
		System.out.println("\n** Añadir coche C5");
		// 3.- Añade el coche c5
		miGarajeMad.put(c5.getMatricula(), c5);
				
		System.out.println("** Total de coches en el garaje");
		// 4.- ¿Cuantos coches tiene el garaje?
		System.out.println("El garaje tiene :" +miGarajeMad.size()+ " coches.");
		   
		// 5.- Tratamiento de claves y valores

		System.out.println("\n** Obtiene y lista Claves\n");
		// -- Recupera claves primero
		Set<String> setMat = miGarajeMad.keySet();
		// Instanciar directamente en la definición
		//ArrayList<String> mmat = new ArrayList<String>(setMat);
		// Inicializar y utilizar addAll
		ArrayList<String> mmat = new ArrayList<String>();
		mmat.addAll(setMat);
		
		for (String matricula : mmat ) {			
			System.out.println(matricula);
		}
		System.out.println("\n** Obtiene y lista Coches\n");
		// --- Recupera todos los coches del garaje en un ArrayList()
		// Instanciar directamente en la definición
		//ArrayList<Coche> lc = new ArrayList<Coche>(miGarajeMad.values());
		// Inicializar y utilizar addAll
		ArrayList<Coche> lc = new ArrayList<Coche>();
		lc.addAll(miGarajeMad.values());
		System.out.println("Lista de Coches (objeto)");
		for (Coche coche : lc ) {			
			System.out.println(coche);
		}

	}
	
	
	/**
	 * Añade el coche al garaje
	 * @param c Coche a añadir
	 */
	public static void addCoche(Coche c) {
		miGarajeMad.put(c.getMatricula(), c);
	};
	
	
	public static boolean eliminaCoche(String mat) {
		miGarajeMad.remove(mat);
		return true;
	};
	
	/**
	 * Recupera el coche que se corresponde con la matrícula facilitada
	 * @param mat Matricula
	 * @return coche del garaje si existe
	 *         null no existe un coche con esa matrícula
	 */
	public static Coche getCoche(String mat) {
				
		if (miGarajeMad.containsKey(mat)) return miGarajeMad.get(mat);
		else return null;
	};
	
	
	
	/** Devuelve un array con la lista de matriculas del garaje
	 * @return ArrayList con las matrículas encontradas
	 */
	public static ArrayList<String> misMatriculas(HashMap<String,Coche> mg){
		
		Set<String> smat = mg.keySet();
		return (ArrayList<String>) mg.keySet();
	}
	
	/**
	 * Saca por pantalla la información del garaje que se
	 * le pasa como parámetro
	 * @param mg garaje de trabajo
	 */
	public static void listaGaraje(HashMap<String,Coche> mg) {
	
		
		// Navegar por el HasMap
		//Mediante un buble forEach
				
				System.out.println("\t- 1 - Bucle for : -----------------------");
				   for (Map.Entry<String, Coche> entry : miGarajeMad.entrySet()) {
			            String key = entry.getKey();
			            Coche value = entry.getValue();
			            
			            //System.out.println("\tKey=" + key + ", Value=" + value);		
			        	System.out.println("\tMatricula:" + entry.getKey()+"\t Coche: " + entry.getValue().getModelo()
								+", " + entry.getValue().getColor()+", "+entry.getValue().getYear());		   
				   }
				   
		// Mediante un iterador

				System.out.println("\t- 2 - Bucle for : -----------------------");  
				 Iterator<Map.Entry<String, Coche>> iterator = miGarajeMad.entrySet().iterator(); 
				
				   while (iterator.hasNext()) {
				        Map.Entry<String, Coche> entry = iterator.next();
				        String key = entry.getKey();
				        Coche value = entry.getValue();
				        System.out.println("\tKey=" + key + ", \tValue=" + value);
				    }
				   
		// Expresiones Lambda

					System.out.println("\t-3 - Expresiones Lambda : -----------------------");
				   miGarajeMad.forEach((key, value) -> {
				        System.out.println("\tKey=" + key + ", \tValue=" + value);
				    });
		
		
	} // listaGaraje
	
	public static ArrayList<Coche> getListaCoches(HashMap<String,Coche> mg) {
		return  (ArrayList<Coche>) mg.values();
	} // getListaCoches
	
} // AppMAin
