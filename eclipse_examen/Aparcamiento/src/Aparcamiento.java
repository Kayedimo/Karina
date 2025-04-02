import java.util.ArrayList;

public class Aparcamiento {

	public String nombre;
	public ArrayList<Vehiculos> listaVehiculos = new ArrayList<Vehiculos>();

	public Aparcamiento() {
		// TODO Auto-generated constructor stub
	}

	public Aparcamiento(String nombre, ArrayList<Vehiculos> plazas) {
		super();
		this.nombre = nombre;
		this.listaVehiculos = plazas;
	}


	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public ArrayList<Vehiculos> getlistaVehiculos() { return listaVehiculos; }
	public void setlistaVehiculos(ArrayList<Vehiculos> listaVehiculos) { this.listaVehiculos = listaVehiculos; }
	
	/*
	public void añadirVehiculo(Vehiculos vehiculo) {
	    for (Vehiculos v : listaVehiculos) {
	        if (v.getMatricula().equals(vehiculo.getMatricula())) {
	            System.out.println("El vehículo con matrícula " + vehiculo.getMatricula() + " ya está en el aparcamiento.");
	            return;
	        }
	    }
	    listaVehiculos.add(vehiculo);
	    System.out.println("Vehiculo añadido con éxito");
	}

	public void eliminarVehiculo(String matricula) {
	    for (Vehiculos v : listaVehiculos) {
	        if (v.getMatricula().equals(matricula)) {
	            listaVehiculos.remove(v);
	            System.out.println("Vehículo eliminado con éxito.");
	            return;
	        }
	    }
	    System.out.println("El vehículo con esa matrícula no existe.");
	}
	
*/
}