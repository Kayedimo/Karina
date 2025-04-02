// Ejercicio 4. Crear un programa para gestionar la plantilla de un equipo de futbol. El programa debe tener un HashMap con los 
// jugadores actuales de la plantilla, de forma que la clave sea su número (que es único) y el valor su nombre. 
// Será posible añadir nuevos jugadores (comprobar que no exista jugador con ese número para no machacarlo), eliminar jugadores, 
// mostrar todos los jugadores y buscar si hay actualmente un jugador con el número indicado. 
package equipo;

import java.util.HashMap;

public class EquipoFutbol {

    private HashMap<Integer, String> plantilla;

    public EquipoFutbol() {
        plantilla = new HashMap<>();
    }

    public void añadirJugador(int numero, String nombre) {
        if (plantilla.containsKey(numero)) {
            System.out.println("Ya existe un jugador con el número " + numero + ".");
        } else {
            plantilla.put(numero, nombre);
            System.out.println("Jugador añadido: " + nombre + " con el número " + numero + ".");
        }
    }

    public void eliminarJugador(int numero) {
    	if (plantilla.containsKey(plantilla)) {
    		String nombre = plantilla.remove(numero);
    		System.out.println("Jugador eliminado: " + nombre + " con el número " + numero + ".");
    	}
    }

// Verificar
    
    public void mostrarJugadores() {
    	if(plantilla.isEmpty()) {
    		System.out.println("La plantilla está vacía.");
    	} else {
    		System.out.println("Jugadores en la plantilla:");
    		for(int numero : plantilla.keySet()) {
    			System.out.println("Número: " + numero + ", Nombre: " + plantilla.get(numero));
    
    		
    		}
    	}
    }
    
    public void buscarJugador(int numero) {
        if (plantilla.containsKey(numero)) {
            System.out.println("El jugador con el número " + numero + " es: " + plantilla.get(numero));
        } else {
            System.out.println("No existe un jugador con el número " + numero + ".");
        }
    }
// Verificar//
    public void buscar(int numero) {
    	if(plantilla.containsKey(numero)) {
    		System.out.println("El jugador con el número " + numero + numero + " es: " + plantilla.get(numero));
    	} else {
    		System.out.println("No existe un jugador con el número " + numero + ".");
    	}
    }


}



	
	

