// Ejercicio 3. Realiza un programa que escoja al azar 5 palabras en español del mini- diccionario del
// ejercicio anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una
// de las palabras y comprobará si son correctas. Al final, el programa deberá mostrar cuántas
// respuestas son válidas y cuántas erróneas. 

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AzarD {

    public static void main(String[] args) {
        // Crear una instancia de MiniDiccionario y obtener el diccionario
        HashMap<String, String> diccionario = MiniDiccionario.obtenerDiccionario();
        
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        
        // Seleccionar 5 palabras aleatorias
        Collections.shuffle(palabras);
        ArrayList<String> palabrasSeleccionadas = new ArrayList<>(palabras.subList(0, 5));

        Scanner sc = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        // Pedir la traducción de cada una de las 5 palabras seleccionadas
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String respuesta = sc.nextLine().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabra);
       

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + traduccionCorrecta + "'.");
                incorrectas++;
            }
        }

        // Mostrar el resultado
        System.out.println("\nResultados:");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
        
    }
}





