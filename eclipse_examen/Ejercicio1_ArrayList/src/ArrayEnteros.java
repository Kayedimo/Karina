//Ejercicio_3
// Crea un programa que cree un arrayList de enteros y luego muestre el siguiente menú con distintas opciones
// 1) Mostrar valores. ( inicialmente no tendrá ningún valor) 
// 2) Introducir valor al final. 
// 3) Introducir valor en una posición. 
// 0) Salir. 
// La opción ‘1’ mostrará todos los valores por pantalla. 
// La opción ‘2’ pedirá un valor V, y luego escribirá V en el arrayList . 
//La opción ‘3’ pedirá un valor V y una posición P, luego escribirá V en la posición P del arrayList. El menú se repetirá 
//indefinidamente hasta que el usuario elija la opción ‘0’ que terminará el programa.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Funciones funciones = new Funciones();
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1) Mostrar valores.");
            System.out.println("2) Introducir valor al final.");
            System.out.println("3) Introducir valor en una posición.");
            System.out.println("0) Salir.");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            if (opcion == 0) break;
            
            switch (opcion) {
                case 1:
                    System.out.println("Valores: " + lista);
                    break;
                case 2:
                    System.out.print("Introduce un valor: ");
                    int valor = scanner.nextInt();
                    lista.add(valor);
                    break;
                case 3:
                    System.out.print("Introduce un valor: ");
                    valor = scanner.nextInt();
                    System.out.print("Introduce una posición: ");
                    int posicion = scanner.nextInt();
                    if (posicion >= 0 && posicion <= lista.size()) {
                        lista.add(posicion, valor);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

