import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoInventarioJdbc extends DaoJdbc { // DaoJdbc: clase base para conexión
    public ArrayList<PuestoTrabajo> listaPuestos = new ArrayList<>();

    // Constructor vacío
    public DaoInventarioJdbc() {
    }

    // Método para obtener todos los registros de puesto_trabajo
    public ArrayList<PuestoTrabajo> findAll() {
        Connection c = getConn();
        if (c != null) {
            try {
                String ssql = "SELECT * FROM puesto_trabajo ORDER BY id";
                Statement stm = c.createStatement();
                ResultSet rs = stm.executeQuery(ssql);

                while (rs.next()) {
                    PuestoTrabajo puesto = new PuestoTrabajo(
                        rs.getInt("id"),
                        rs.getInt("tipo"),
                        rs.getString("label"),
                        rs.getString("sn"),
                        rs.getString("pn"),
                        rs.getString("modelo"),
                        rs.getInt("ram")
                    );
                    listaPuestos.add(puesto); // Agrega el puesto a la lista
                }
                return listaPuestos;
            } catch (SQLException ex) {
                Logger.getLogger(DaoInventarioJdbc.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }

    // Método para obtener un registro por ID
    public PuestoTrabajo findOne(int id) {
        Connection c = getConn();
        if (c != null) {
            try {
                String ssql = "SELECT * FROM puesto_trabajo WHERE id = ?";
                PreparedStatement pstm = c.prepareStatement(ssql);
                pstm.setInt(1, id);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    return new PuestoTrabajo(
                        rs.getInt("id"),
                        rs.getInt("tipo"),
                        rs.getString("label"),
                        rs.getString("sn"),
                        rs.getString("pn"),
                        rs.getString("modelo"),
                        rs.getInt("ram")
                    );
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoInventarioJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    // Método para insertar un nuevo registro
    public boolean insertOne(PuestoTrabajo puesto) {
        Connection c = getConn();
        if (c != null) {
            try {
                String ssql = "INSERT INTO puesto_trabajo (tipo, label, sn, pn, modelo, ram) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = c.prepareStatement(ssql);

                // Asignar valores
                pstm.setInt(1, puesto.getTipo());
                pstm.setString(2, puesto.getLabel());
                pstm.setString(3, puesto.getSn());
                pstm.setString(4, puesto.getPn());
                pstm.setString(5, puesto.getModelo());
                pstm.setInt(6, puesto.getRam());

                pstm.execute();
                listaPuestos.add(puesto); // Agrega el objeto a la lista en memoria
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DaoInventarioJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    

    // Método para eliminar un registro por ID
    public boolean deleteOne(int id) {
        Connection c = getConn();
        if (c != null) {
            try {
                String ssql = "DELETE FROM puesto_trabajo WHERE id = ?";
                PreparedStatement pstm = c.prepareStatement(ssql);
                pstm.setInt(1, id);

                int filas = pstm.executeUpdate();
                if (filas > 0) {
                    listaPuestos.removeIf(p -> p.getId() == id); // Elimina de la lista en memoria
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoInventarioJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    // Método para actualizar un registro por ID
    public boolean updateOne(int id, PuestoTrabajo puesto) {
        Connection c = getConn();
        if (c != null) {
            try {
                String ssql = "UPDATE puesto_trabajo SET tipo = ?, label = ?, sn = ?, pn = ?, modelo = ?, ram = ? WHERE id = ?";
                PreparedStatement pstm = c.prepareStatement(ssql);

                // Asignar valores
                pstm.setInt(1, puesto.getTipo());
                pstm.setString(2, puesto.getLabel());
                pstm.setString(3, puesto.getSn());
                pstm.setString(4, puesto.getPn());
                pstm.setString(5, puesto.getModelo());
                pstm.setInt(6, puesto.getRam());
                pstm.setInt(7, id);

                int filas = pstm.executeUpdate();
                if (filas > 0) {
                    listaPuestos.removeIf(p -> p.getId() == id); // Actualiza la lista en memoria
                    listaPuestos.add(puesto);
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoInventarioJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
