//Ejercicio_2
// La clase principal pedirá la altura de las personas, almacenará las alturas en un ArrayList, y luego utilizará las funciones
// de la clase Funciones para calcular: la media, el máximo, el mínimo, y contar cuántas personas miden por encima y por debajo
// de la media.

import java.util.ArrayList;
import java.util.Scanner;

public class CAPersonas {
    public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in): Creamos un objeto Scanner llamado scanner para leer las entradas del usuario.    	
        Scanner scanner = new Scanner(System.in);
// ArrayList<Integer> alturas = new ArrayList<>(): Creamos una lista llamada alturas que almacenará las alturas que introduzca el usuario.       
        ArrayList<Integer> alturas = new ArrayList<>();
// Funciones funciones = new Funciones(): Creamos un objeto de la clase Funciones llamado funciones para usar las funciones que hemos definido en esa clase. 
        Funciones funciones = new Funciones();
// Mostramos un mensaje en la pantalla pidiendo al usuario que introduzca alturas en centímetros.
        System.out.println("Introduce la altura de personas en centímetros (0 para finalizar):");
// Iniciamos un bucle infinito que se repetirá hasta que el usuario introduzca 0.
        while (true) {
// Leemos la altura introducida por el usuario y la almacenamos en la variable altura.        	
            int altura = scanner.nextInt();
// Si la altura es 0, salimos del bucle.
            if (altura == 0) break;
// Si la altura no es 0, la añadimos a la lista alturas.
            alturas.add(altura);
        }
// Si la lista de alturas tiene algún elemento, hacemos los cálculos.
        if (alturas.size() > 0) {
// Calculamos la altura mínima utilizando la función minimoAraysListInt.        	
            // Calcula el valor mínimo
            int min = funciones.minimoAraysListInt(alturas);
// Mostramos la altura mínima en la pantalla.            
            System.out.println("Altura mínima: " + min);

// Calculamos la altura máxima utilizando la función maximoAraysListInt            
            // Calcula el valor máximo
            int max = funciones.maximoAraysListInt(alturas);
// Mostramos la altura máxima en la pantalla.
            System.out.println("Altura máxima: " + max);

            // Calcula la media
            double media = funciones.mediaArrayListInt(alturas) / alturas.size();
// Mostramos la altura media en la pantalla.
            System.out.println("Altura media: " + media);

// Inicializamos contadores para personas por encima y por debajo de la media.
            // Cuenta las personas por encima y por debajo de la media
            int porEncima = 0, porDebajo = 0;
// Recorremos cada altura en la lista alturas.       
            for (int altura : alturas) {
// Si la altura es mayor que la media, incrementamos el contador porEncima.
            	if (altura > media) porEncima++;
// Si la altura es menor que la media, incrementamos el contador porDebajo.  
            	if (altura < media) porDebajo++;
            }
// Mostramos cuántas personas están por encima de la media.
            System.out.println("Personas por encima de la media: " + porEncima);
// Mostramos cuántas personas están por debajo de la media.            
            System.out.println("Personas por debajo de la media: " + porDebajo);
// Si no se han introducido alturas, mostramos un mensaje indicando esto.
        } else {
        	System.out.println("No se han introducido alturas.");
        }
    }
}
