
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DaoJdbc {

    // Método getConn para obtener la conexión
    protected Connection getConn() {
        // Configuración de la conexión
        String url = "jdbc:mysql://localhost:3306/inventario"; // Cambia localhost si el servidor es remoto
        String usuario = "root"; // Usuario de tu base de datos
        String contraseña = ""; // Contraseña de tu base de datos

        Connection conexion = null;
        try {
            // Establecer conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    // Método para insertar un registro en la tabla puesto_trabajo
    public void insertarPuestoTrabajo(int tipo, String label, String sn, String pn, String modelo, int ram) {
        Connection conexion = getConn();
        if (conexion != null) {
            try {
                String sql = "INSERT INTO puesto_trabajo (tipo, label, sn, pn, modelo, ram) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conexion.prepareStatement(sql);

                // Asignar valores a los parámetros
                stmt.setInt(1, tipo);
                stmt.setString(2, label);
                stmt.setString(3, sn);
                stmt.setString(4, pn);
                stmt.setString(5, modelo);
                stmt.setInt(6, ram);

                // Ejecutar la inserción
                int filasInsertadas = stmt.executeUpdate();
                System.out.println("Registro insertado con éxito. Filas afectadas: " + filasInsertadas);

                // Cerrar el PreparedStatement
                stmt.close();
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error al insertar el registro: " + e.getMessage());
            }
        }
    }

    // Método para consultar los registros de la tabla puesto_trabajo
    public void consultarPuestosTrabajo() {
        Connection conexion = getConn();
        if (conexion != null) {
            try {
                String sql = "SELECT * FROM puesto_trabajo ORDER BY id";
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("Registros de puesto_trabajo:");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Tipo: " + rs.getInt("tipo"));
                    System.out.println("Label: " + rs.getString("label"));
                    System.out.println("Modelo: " + rs.getString("modelo"));
                    System.out.println("---------------------------");
                }

                // Cerrar ResultSet y Statement
                rs.close();
                stmt.close();
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error al realizar la consulta: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Instancia de DaoJdbc para probar las funcionalidades
        DaoJdbc daoJdbc = new DaoJdbc();

        // Insertar un registro en puesto_trabajo
        daoJdbc.insertarPuestoTrabajo(1, "PC001", "SN001", "PN001", "HP-ZBOOK", 9);

        // Consultar registros para verificar la inserción
        daoJdbc.consultarPuestosTrabajo();
    }
}




