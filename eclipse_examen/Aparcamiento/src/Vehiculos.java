
public class Vehiculos {

	public String matricula;
	public String color;
	public int fecha;	
	
	public Vehiculos() {
		// TODO Auto-generated constructor stub
	}

	public Vehiculos(String matricula, String color, int fecha) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.fecha = fecha;
	}

	public String getMatricula() { return matricula; }
	public void setMatricula(String matricula) { this.matricula = matricula; }

	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }

	public int getFecha() { return fecha; }
	public void setFecha(int fecha) { this.fecha = fecha; }

	

    @Override
    public String toString() {
        return "Vehiculos [Matrícula: " + matricula + ", Color: " + color + ", Fecha: " + fecha + "]";
 
    }
}
