import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppMain{

	public Aparcamiento apm;

	public AppMain() {
	
	}
	
	public static void main(String[] args) {
		AppMain ap = new AppMain();
		ap.run();
	
	}
	
	public void run() {

		Menu m = new Menu();
		Boolean salir = false;
		Integer opcion = 0;
		String [] opc = {
				"Añadir Vehiculo",
				"Eliminar Vehiculo",
				"Listar Vehiculo",
				"Estadísticas"
				
		};
		init();
		m.setTitulo("Aparcamiento : " + apm.getNombre());
		m.setOpciones(opc);
		while (!salir) {
			
			m.mostrar();//Mostrar el menú
			opcion = m.seleccionaOpc();
		
			switch(opcion) {
// Pedir matricula, scanner			
			case 1:
				addVehiculo();
				break;
			case 2:
				deleteVehiculo();
				break;
			case 3:
				listVehiculo();
				break;
			case 4:
				estadisticas();
				break;
			case 0:
				salir = true;
			}// opciones
				
		} // Bucle principal
			
	}// end Main
		
	public void addVehiculo() {
		
		String matricula = pedirMatricula();
		Integer valor = comprobarMatricula(matricula);
		if(valor != -1) {
			System.out.println("Ya existe un vehiculo en el aparcamiento");
		}
		else {
			// Pedir el resto de datos
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime el color :");
			String color = sc.nextLine().toUpperCase();
			System.out.println("Dime el año :");
			Integer fecha = sc.nextInt();
			
			// Añadirlo a la lista de vehiculos
			apm.getlistaVehiculos().add(new Vehiculos(matricula, color,fecha));
		}
	};
	
	
	public void deleteVehiculo() {
		
		String matricula = pedirMatricula();
		Integer valor = comprobarMatricula(matricula);
		if (valor == -1) {
			System.out.println("No se puede borrar, no existe un vehiculo en el aparcamiento");
		}
		else {
			apm.listaVehiculos.remove(valor.intValue());
			System.out.println("Vehiculo eliminado con éxito");
			
		}
	
	};
	
	public void listVehiculo() {
		
		if (apm.listaVehiculos.isEmpty()) {
		        System.out.println("No hay vehículos en el aparcamiento.");
		    } else {
		        for (Vehiculos v : apm.listaVehiculos) {
		            System.out.println(v);
		        }
		    }
				
			
		
	};
	public void estadisticas() {
	if (apm.listaVehiculos.isEmpty()) {
        System.out.println("No hay vehículos en el aparcamiento.");
        return;
    }

    Map<String, Integer> colores = new HashMap<>();
    for (Vehiculos v : apm.listaVehiculos) {
        String color = v.getColor();
        colores.put(color, colores.getOrDefault(color, 0) + 1);
    }

    System.out.println("Resumen de vehículos en el aparcamiento:");
    for (Map.Entry<String, Integer> entry : colores.entrySet()) {
        System.out.println("Color: " + entry.getKey() + " - Cantidad: " + entry.getValue());
    }
};


	
	
	
	public String pedirMatricula() {
		Scanner sc = new Scanner (System.in);
			System.out.println("Ingresa matrícula");
			String matricula = sc.nextLine();
		return matricula.toUpperCase();	
	}
	
	public int comprobarMatricula(String matricula) {
		int result = -1;
		ArrayList<Vehiculos> al;
		al = apm.getlistaVehiculos();
		for(int i = 0; i < al.size(); i++) {
			Vehiculos v1 = al.get(i);
			if(v1.getMatricula().equals(matricula)) {
				result = i;
				break;
			}
			
		} // recorrer listaVehiculos
		
		return result;
	}
	
	public void init() {
		this.apm = new Aparcamiento();
		this.apm.setNombre("GOYA");
	
	}
	/*
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aparcamiento aparcamiento = new Aparcamiento("Mi Aparcamiento");

  
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1) Añadir vehículo");
            System.out.println("2) Eliminar vehículo");
            System.out.println("3) Listar vehículos");
            System.out.println("4) Resumen de vehículos en el aparcamiento");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la matrícula (4 números y 3 letras): ");
                    String matricula = scanner.nextLine();
                    System.out.print("Introduce el color: ");
                    String color = scanner.nextLine();
                    System.out.print("Introduce el año de fabricación: ");
                    int fecha = scanner.nextInt();
                    Vehiculos vehiculo = new Vehiculos(matricula, color, fecha);
                    aparcamiento.añadirVehiculo(vehiculo);
                    break;
                case 2:
                    System.out.print("Introduce la matrícula del vehículo a eliminar: ");
                    matricula = scanner.nextLine();
                    aparcamiento.eliminarVehiculo(matricula);
                    break;
                case 3:
                    aparcamiento.listarVehiculos();
                    break;
                case 4:
                    aparcamiento.resumenVehiculos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige nuevamente.");
            }
        }
    }
*/


}

