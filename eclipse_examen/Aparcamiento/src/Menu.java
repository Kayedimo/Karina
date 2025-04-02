/* Vamos a crear una clase menú que nos servirá para futuros programas

/*
 * Menú opciones Garaje
	 * 1. Añadir coche
	 * 2. Eliminar coche
	 * 3. Modificar coche
	 * 4. etc.
	 * ....
	 * Salir
	 */

/* Siempre que nuestro programa tenga menú se podrá reciclar
 	* Menú esta compuesto de: 
	 * Titulo
	 * Opciones [] se creará con array
	 * Método constructor menú ()
	 * Método constructor de opciones (String [] opciones)
	 * Pintar menú
	 * Seleccionar opción
	 */

/*
 * Menú Liga
	 * 1. Añadir jugador
	 * 2. Eliminar jugador
	 * 3. Añadir equipo
	 * 4. Eliminar equipo
	 * ......
	 */

import java.util.Scanner;

public class Menu {

	private String Titulo;
	private String [] Opciones;
	private int op_Elegida;
	
// -- Método constructor Vacío
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	public Menu(String titulo, String [] opcs) {
		this.Titulo = titulo;
		this.Opciones = opcs;
					
	}
	public String getTitulo() { return Titulo; }
	public void setTitulo(String titulo) { Titulo = titulo; }
	public String[] getOpciones() { return Opciones; }
	public void setOpciones(String[] opciones) { Opciones = opciones;}
	public int getOp_Elegida() { return op_Elegida; }
	public void setOp_Elegida(int op_Elegida) { this.op_Elegida = op_Elegida; }

	 	
	public void mostrar() {
		
		System.out.println();
		System.out.println(this.Titulo);
		System.out.println("-----------------------------");
		for(int i = 0; i < Opciones.length; i++) {
			System.out.println(i+1  + "." + Opciones[i]);
		}
		System.out.println("0. Salir");

	}

	public int seleccionaOpc() {
		
		int result = 0;
		Scanner sc = new Scanner(System.in); // si lo queremos tener como atributo lo tenemos como privado y no se hace get ni set
		boolean salir = false;
		
// -- Repetir
	// -- Pedir opción al usuario: como minima se va a preguntar 1 vez hasta que me di un número correcto
	// -- Comprobar si es una opción válida
	// -- Mensaje informando
		
// -- Hasta
	// -- (Opción válida)
		
		do { 
			System.out.println("Elige una opción: ");
			result = sc.nextInt();
			if (result >= 0 && result <= this.Opciones.length) { 
				salir = true;
			} else { 
				System.out.println("Opción incorrecta: ");
				}
			}
			while(!salir);
			this.op_Elegida = result;
			return result;
	}			
	
		public String mostrarLiteral() {
						
			if(this.op_Elegida == 0) {
				return "salir";
			} else {
				return this.Opciones [this.op_Elegida-1];
		}
		
	}
}