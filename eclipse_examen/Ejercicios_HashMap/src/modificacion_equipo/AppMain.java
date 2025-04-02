package modificacion_equipo;

import java.util.Scanner;
import tools.Menu;

public class AppMain {

    public static void main(String[] args) {
        EquipoFutbol equipo = new EquipoFutbol();
        Scanner scanner = new Scanner(System.in);
        String[] opciones = {"Añadir jugador", "Eliminar jugador", "Modificar nombre de un jugador", "Modificar posición de un jugador", "Mostrar todos los jugadores", "Buscar jugador por número"};
        Menu menu = new Menu("Gestión de la plantilla del equipo de fútbol", opciones);

        int opcion;

        do {
            menu.mostrar();
            opcion = menu.seleccionaOpc();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número del jugador: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce el nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce la posición del jugador (Delantero, Portero, Defensa, Medio_campo): ");
                    String posicion = scanner.nextLine();
                    equipo.añadirJugador(numero, nombre, posicion);
                    break;
                case 2:
                    System.out.print("Introduce el número del jugador a eliminar: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    equipo.eliminarJugador(numero);
                    break;
                case 3:
                    System.out.print("Introduce el número del jugador: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce el nuevo nombre del jugador: ");
                    String nuevoNombre = scanner.nextLine();
                    equipo.modificarNombre(numero, nuevoNombre);
                    break;
                case 4:
                    System.out.print("Introduce el número del jugador: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce la nueva posición del jugador (Delantero, Portero, Defensa, Medio_campo): ");
                    String nuevaPosicion = scanner.nextLine();
                    equipo.modificarPosicion(numero, nuevaPosicion);
                    break;
                case 5:
                    equipo.mostrarJugadores();
                    break;
                case 6:
                    System.out.print("Introduce el número del jugador a buscar: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    equipo.buscarJugador(numero);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

    }
}

