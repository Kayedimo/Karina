package productos;

import java.util.Scanner;
import tools.Menu;

public class AppMain {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        String[] opciones = {"Añadir producto", "Eliminar producto", "Reducir stock de un producto", "Buscar unidades de un producto", "Listar todos los productos", "Listar todos los productos con su stock"};
        Menu menu = new Menu("Gestión del stock del almacén", opciones);

        int opcion;

        do {
            menu.mostrar();
            opcion = menu.seleccionaOpc();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del producto: ");
                    String nombreAñadir = scanner.nextLine();
                    System.out.print("Introduce las unidades del producto: ");
                    int unidadesAñadir = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    almacen.añadirProducto(nombreAñadir, unidadesAñadir);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    almacen.eliminarProducto(nombreEliminar);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del producto: ");
                    String nombreReducir = scanner.nextLine();
                    System.out.print("Introduce las unidades a reducir: ");
                    int unidadesReducir = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    almacen.reducirStock(nombreReducir, unidadesReducir);
                    break;
                case 4:
                    System.out.print("Introduce el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    almacen.buscarProducto(nombreBuscar);
                    break;
                case 5:
                    almacen.listarProductos();
                    break;
                case 6:
                    almacen.listarProductosConStock();
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
