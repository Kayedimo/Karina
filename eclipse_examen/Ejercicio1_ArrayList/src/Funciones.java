import java.util.ArrayList;
import java.util.Random;
public class Funciones {
	
// a)
/**
 * Genera un ArrayList de n elementos aleatorios cuyo valor está entre min y max	
 * @param n es el número de elementos
 * @param min es el valor mínimo
 * @param max es el valor máximo
 * @return
 */
	public ArrayList<Integer> generaArrayListInt(int n, int min, int max){
		ArrayList<Integer> lista = new ArrayList<Integer>();
// Se crea un objeto random aleatorio		
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			lista.add(r.nextInt((max - min) + 1) + min);
		}
		return lista;
	}
	
//	b)
/**
 * Calcula el valor mínimo de un ArrayList de enteros
 * @param valores es el Arraylist de enteros
 * @return el valor mínimo
 */
	public Integer minimoAraysListInt(ArrayList<Integer> valores){
		Integer min = valores.get(0);
		for (Integer valor : valores) {
			if (valor < min) {
				min = valor;
			}
		}
		return min;
	
	}
	
//	c)
/**
 * Calcula el valor máximo de un ArrayList de enteros	
 * @param valores es el Arraylist de enteros
 * @return el valor mínimo
 */
	public Integer maximoAraysListInt(ArrayList<Integer> valores){
		Integer max = valores.get(0);	
		for (Integer valor : valores) {
			if (valor > max) {
				max = valor;
				}
		}
		return max;
	
	}
	
//	d)
/**
 * Calcula la media de un ArrayList de enteros	
 * @param valores es el ArrayList de enteros
 * @return la media
 */
	public Double mediaArrayListInt(ArrayList<Integer> valores){
		Double result = 0.0;	
		for (Integer valor :valores) {
			result += valor;
		}
		return result;
	
	}
	
//	e)
/**
 * Comprueba si un elemento está en un ArraysList de enteros	
 * @param valores es el ArrayList de enteros
 * @param elemento es el elemento a buscar
 * @return true si el elemento está en el ArrayList
 */
	public boolean estaArrayListInt(ArrayList<Integer> valores, Integer elemento){
		boolean result = false;
		for (Integer valor : valores) {
			if (valor == elemento) {
				result = true;
				}
		}
		return result;
		
	}
	
//	f)
/**
 * Devuelve la posición de un elemento en un ArrayList de enteros
 * @param valores es el ArrayList de enteros
 * @param elemento es el elemento a buscar
 * @return la posición del elemento en el ArrayList
 */
	public Integer posicionEntaEnArrayListInt(ArrayList<Integer> valores, Integer elemento){
		Integer result = valores.indexOf(elemento);
		return result;
		
	}
		
//	g)
/**
 * Voltea un ArrayList de enteros	
 * @param valores es el ArrayLists de enteros
 * @return un ArrayList con los elementos volteados
 */
	public ArrayList<Integer>volteaArrayListInt(ArrayList<Integer> valores){
		ArrayList <Integer> listavolteada = new ArrayList<Integer>();
		for(int i = valores.size()-1; i >= 0; i--) {
			listavolteada.add(valores.get(i));
		}
		return listavolteada;
		
	}
		

}












