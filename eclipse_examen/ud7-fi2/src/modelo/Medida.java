package modelo;

public class Medida {

	private String fecha;
	private int temperatura;
	private int humedad;
	
	public Medida() {}

	public Medida(String linea) {
		
		String[] campos = linea.split("#");
		this.fecha = campos[0];
		this.temperatura = Integer.parseInt(campos[1]);
		this.humedad = Integer.parseInt(campos[2]);
	}
	
	public String getFecha() {		return fecha;	}
	public void setFecha(String fecha) {		this.fecha = fecha;	}
	public int getTemperatura() {		return temperatura;	}
	public void setTemperatura(int temperatura) {		this.temperatura = temperatura;	}
	public int getHumedad() {		return humedad;	}
	public void setHumedad(int humedad) {		this.humedad = humedad;	}

	
	@Override
	public String toString() {
		return fecha + "#" +  temperatura +"#" + humedad;
	}

	public String toJson() {
		String result="";
		
		result = "{";
		result = result + "\"fecha\":" + "\"" + fecha + "\",";
		result = result + "\"temperatura\":" + "\"" + temperatura + "\",";
		result = result + "\"humedad\":" + "\"" + humedad + "\"";
		result = result + "}";
		
		return result;
	}
	
	
	
	
}
