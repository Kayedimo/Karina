// Crea una clase para probar todas las funciones de la librería, además está podrá ser utilizada en cualquier otro
// ejercicio.
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Funciones f = new Funciones();
		   
		// a) Genera un ArrayList de n elementos aleatorios cuyo valor está entre min y max
        ArrayList<Integer> arrayList = f.generaArrayListInt(10, 1, 100);
        System.out.println("ArrayList generado: " + arrayList);
      
        // b) Devuelve el valor mínimo del ArrayList
        Integer min = f.minimoAraysListInt(arrayList);
        System.out.println("Mínimo: " + min);
        		
        // c) Devuelve el valor maximo del ArrayList		
        Integer max = f.maximoAraysListInt(arrayList);
        System.out.println("Máximo: " + max);

        // d) Devuelve la media del ArrayList
        Double media = f.mediaArrayListInt(arrayList);
        System.out.println("Media: " + media);
        
        // e) Comprueba si un elemento está en el ArrayList
        Boolean esta = f.estaArrayListInt(arrayList, 50);
        System.out.println("Esta: " + esta);
        
        // f) Devuelve la posición de un elemento en el ArrayList
        Integer posición = f.posicionEntaEnArrayListInt(arrayList, 50);
        System.out.println("Posición: " + posición);
        
        // g) Devuelve el elemento de una posición en el ArrayList
        ArrayList<Integer> invertido = f.volteaArrayListInt(arrayList);
        System.out.println("Lista volteada: " + invertido);
                
 }
}