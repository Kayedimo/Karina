package modificacion_equipo;

import java.util.HashMap;

public class EquipoFutbol {

    private HashMap<Integer, Jugador> plantilla;

    public EquipoFutbol() {
        plantilla = new HashMap<>();
    }

    public void añadirJugador(int numero, String nombre, String posicion) {
        if (plantilla.containsKey(numero)) {
            System.out.println("Ya existe un jugador con el número " + numero + ".");
        } else {
            Jugador jugador = new Jugador(nombre, posicion);
            plantilla.put(numero, jugador);
            System.out.println("Jugador añadido: " + jugador);
        }
    }

    public void eliminarJugador(int numero) {
        if (plantilla.containsKey(numero)) {
            Jugador jugador = plantilla.remove(numero);
            System.out.println("Jugador eliminado: " + jugador);
        } else {
            System.out.println("No existe un jugador con el número " + numero + ".");
        }
    }

    public void modificarNombre(int numero, String nuevoNombre) {
        if (plantilla.containsKey(numero)) {
            Jugador jugador = plantilla.get(numero);
            jugador.setNombre(nuevoNombre);
            System.out.println("Nombre del jugador actualizado: " + jugador);
        } else {
            System.out.println("No existe un jugador con el número " + numero + ".");
        }
    }

    public void modificarPosicion(int numero, String nuevaPosicion) {
        if (plantilla.containsKey(numero)) {
            Jugador jugador = plantilla.get(numero);
            jugador.setPosicion(nuevaPosicion);
            System.out.println("Posición del jugador actualizada: " + jugador);
        } else {
            System.out.println("No existe un jugador con el número " + numero + ".");
        }
    }

    
    public void mostrarJugadores() {
        if (plantilla.isEmpty()) {
            System.out.println("La plantilla está vacía.");
        } else {
            System.out.println("Jugadores en la plantilla:");
            for (int numero : plantilla.keySet()) {
                System.out.println("Número: " + numero + ", " + plantilla.get(numero));
            }
        }
    }

    public void buscarJugador(int numero) {
        if (plantilla.containsKey(numero)) {
            System.out.println("Jugador encontrado: Número: " + numero + ", " + plantilla.get(numero));
        } else {
            System.out.println("No existe un jugador con el número " + numero + ".");
        }
    }

    

}

