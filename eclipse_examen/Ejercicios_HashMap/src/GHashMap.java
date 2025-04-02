import java.util.HashMap;
import java.util.Map;

public class GHashMap {

    public static void main(String[] args) {
        // Inicialmente, contiene un HashMap con claves y valores enteros
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);
        hashMap.put(4, 40);
        hashMap.put(5, 50);

        // Mostrar el contenido completo del HashMap
        System.out.println("Contenido inicial del HashMap:");
        mostrarHashMap(hashMap);

        // Modificar los valores cuya clave sea par, multiplicando por dos el valor
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                entry.setValue(entry.getValue() * 2);
            }
        }

        // Mostrar el contenido completo del HashMap después de la modificación de claves pares
        System.out.println("Contenido del HashMap después de multiplicar por dos los valores con claves pares:");
        mostrarHashMap(hashMap);

        // Modificar los valores cuya clave sea impar, sumando 10 al valor
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() % 2 != 0) {
                entry.setValue(entry.getValue() + 10);
            }
        }

        // Mostrar el contenido completo del HashMap después de la modificación de claves impares
        System.out.println("Contenido del HashMap después de sumar 10 a los valores con claves impares:");
        mostrarHashMap(hashMap);
    }

    // Método para mostrar el contenido del HashMap
    public static void mostrarHashMap(HashMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        System.out.println();
    }
}
