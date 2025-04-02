
public class Empleado {

    private  int id;

    private  String nombre;

    private  String empresa;

    

    
    public Empleado() {


	}

	public Empleado(int id, String nombre, String empresa) {
        this.id=id;
        this.nombre= nombre;
        this.empresa= empresa;
    }

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

  public Empleado (String cadena,String separador) {
	  
	  String[] campos;
	  
	  campos = cadena.split(separador);
	  this.id = Integer.valueOf(campos[0]);
	  this.nombre = campos[1];
	  this.empresa = campos[2];
	  
  }
  public String toString() {
	  
	  return  this.id+", "+this.nombre +", "+ this.empresa ;
  }
    
    
    
}