import java.util.HashMap;
import java.util.Scanner;

// Ejercicio 1. Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
// dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa
// dirá “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben estar 
// almacenados en una estructura de la clase HashMap. 

public class ControlAcceso {

	public ControlAcceso() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	        // Crear un HashMap para almacenar usuarios y contraseñas
	        HashMap<String, String> usuarios = new HashMap<String, String>();
	        usuarios.put("usuario1", "contrasena1");
	        usuarios.put("usuario2", "contrasena2");
	        usuarios.put("usuario3", "contrasena3");

	        Scanner sc = new Scanner(System.in);
	        int intentos = 0;
	        boolean accesoConcedido = false;

	        while (intentos < 3 && !accesoConcedido) {
	            // Pedir nombre de usuario y contraseña
	            System.out.print("Introduce el nombre de usuario: ");
	            String nombreUsuario = sc.nextLine();
	            System.out.print("Introduce la contraseña: ");
	            String contrasena = sc.nextLine();

	            // Verificar si el usuario y la contraseña son correctos
	            
// usuarios.containsKey(nombreUsuario): Verifica si el HashMap llamado usuarios contiene una clave que coincide con el valor de nombreUsuario
// usuarios.get(nombreUsuario): Obtiene el valor asociado con la clave nombreUsuario en el HashMap usuarios y lo compara con la contraseña (contrasena) introducida.
	            
	            if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(contrasena)) {
	                System.out.println("Ha accedido al área restringida");
	                accesoConcedido = true;
	            } else {
	                intentos++;
	                System.out.println("Nombre de usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
	            }
	        }
	        			
	        // Si se agotan los intentos, mostrar mensaje de acceso denegado
	        	if (!accesoConcedido) {
	            System.out.println("Lo siento, no tiene acceso al área restringida");
	        	}

	        }
}
			


