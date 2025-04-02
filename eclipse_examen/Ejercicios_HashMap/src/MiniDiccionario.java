// Ejercicio 2. Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción). 
// Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. El programa pedirá una palabra en español y dará 
// la correspondiente traducción en inglés.

import java.util.HashMap;
import java.util.Scanner;
public class MiniDiccionario {

    public MiniDiccionario() {
    }

    public static HashMap<String, String> obtenerDiccionario() {
        // Crear un HashMap para almacenar las palabras y sus traducciones
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregar al menos 20 palabras al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("escuela", "school");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("árbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("cielo", "sky");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("mar", "sea");
        diccionario.put("río", "river");
        diccionario.put("montaña", "mountain");
        diccionario.put("auto", "car");
        diccionario.put("bicicleta", "bicycle");

        return diccionario;
    }

    public static void main(String[] args) {
        HashMap<String, String> diccionario = obtenerDiccionario();
        Scanner sc = new Scanner(System.in);

        // Pide al usuario una palabra en español
        System.out.print("Introduce una palabra en español: ");
        String palabraEspañol = sc.nextLine().toLowerCase();

        // Busca la traducción en el diccionario
        String traduccion = diccionario.get(palabraEspañol);

        // Muestra la traducción o un mensaje si la palabra no está en el diccionario
        if (traduccion != null) {
            System.out.println("La traducción de '" + palabraEspañol + "' es: " + traduccion);
        } else {
            System.out.println("La palabra '" + palabraEspañol + "' no está en el diccionario.");
        }
    }
}


	
