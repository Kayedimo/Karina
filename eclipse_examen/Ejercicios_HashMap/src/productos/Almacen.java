package productos;
import java.util.HashMap;

public class Almacen {

    private HashMap<String, Integer> productos;

    public Almacen() {
        productos = new HashMap<>();
    }

    public void añadirProducto(String nombre, int unidades) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, productos.get(nombre) + unidades);
            System.out.println("Stock aumentado: " + nombre + " ahora tiene " + productos.get(nombre) + " unidades.");
        } else {
            productos.put(nombre, unidades);
            System.out.println("Producto añadido: " + nombre + " con " + unidades + " unidades.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado: " + nombre);
        } else {
            System.out.println("No existe el producto: " + nombre);
        }
    }

    public void reducirStock(String nombre, int unidades) {
        if (productos.containsKey(nombre)) {
            int stockActual = productos.get(nombre);
            if (stockActual >= unidades) {
                productos.put(nombre, stockActual - unidades);
                System.out.println("Stock reducido: " + nombre + " ahora tiene " + productos.get(nombre) + " unidades.");
            } else {
                System.out.println("No hay suficientes unidades para reducir.");
            }
        } else {
            System.out.println("No existe el producto: " + nombre);
        }
    }

    public void buscarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            System.out.println("El producto " + nombre + " tiene " + productos.get(nombre) + " unidades.");
        } else {
            System.out.println("No existe el producto: " + nombre);
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacén.");
        } else {
            System.out.println("Productos en el almacén:");
            for (String nombre : productos.keySet()) {
                System.out.println("Producto: " + nombre);
            }
        }
    }

    public void listarProductosConStock() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacén.");
        } else {
            System.out.println("Productos en el almacén con su stock:");
            for (String nombre : productos.keySet()) {
                System.out.println("Producto: " + nombre + ", Unidades: " + productos.get(nombre));
            }
        }
    }
}
