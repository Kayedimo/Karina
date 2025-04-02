import java.util.ArrayList;

//Interfaz genérica para el DAO
public interface DaoList<T> {
 // Devuelve todos los registros
 public ArrayList<T> findAll();

 // Busca un registro específico por su clave (ID)
 public T findOne(int key); // Adaptado para usar claves numéricas como ID

 // Inserta un nuevo registro
 public boolean insertOne(T t);

 // Elimina un registro por su clave (ID)
 public boolean deleteOne(int key); // Adaptado para usar claves numéricas como ID

 // Actualiza un registro existente
 public boolean updateOne(int key, T t);
}
