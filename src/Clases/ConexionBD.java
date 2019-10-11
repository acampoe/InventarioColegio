
package Clases;
import static Clases.Metdos_sql.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ConexionBD {

    public static String url = "jdbc:mysql://localhost:3306/inventariodatabase"; 
    public static String usuario = "root";
    public static String contraseña = "root";
    public static String clase ="com.mysql.jdbc.Driver";
    
  public static Connection ConectarBD () throws Exception{
      Connection conexion = null;
      try {
          Class.forName(clase);
          conexion =DriverManager.getConnection(url,usuario,contraseña);
          System.out.println("conexion establecida");
          
      }catch (ClassNotFoundException | SQLException ex){
          System.out.println("e");

      }
      return conexion;
}

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
