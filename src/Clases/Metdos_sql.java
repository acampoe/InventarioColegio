
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Metdos_sql {
    public static ConexionBD conexion =new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String num_doc, String nombre, String correo, String contraseña){
        int resultado=0;
        Connection conexion = null;
        String sentencia_guardar=("INSERT INTO login(num_doc,nombre,correo,contraseña)VALUES (?,?,?,?)");
        try{
            conexion = ConexionBD.ConectarBD();
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,num_doc);
            sentencia_preparada.setString(2,nombre);
            sentencia_preparada.setString(3,correo);
            sentencia_preparada.setString (4,contraseña);
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        }catch (Exception e){
            System.out.println(e);
            
        }
           return resultado;
    }
    public static String buscarNombre(String correo){
        String busqueda_nombre=null;
           Connection conexion = null;
        try {
           conexion = ConexionBD.ConectarBD();
           String sentencia_buscar=("SELECT num_doc,nombre FROM login WHERE num_doc='"+correo+"'");
            sentencia_preparada= conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
             String num_doc = resultado.getString("num_doc");
             String nombre = resultado.getString("nombre");
             busqueda_nombre=nombre;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }
     public static String buscarUsuario(String correo, String contraseña){
         String busqueda_usuario="";
         Connection conexion = null;
         try {
             conexion = ConexionBD.ConectarBD();
             String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM login WHERE correo= '"+correo+"' && contraseña ='"+contraseña+"'");
             sentencia_preparada= conexion.prepareStatement(sentencia_buscar_usuario);
             resultado =sentencia_preparada.executeQuery();
             if(resultado.next()){
                  busqueda_usuario = resultado.getString("nombre");
             }else{
                 busqueda_usuario = "usuario no encontrado"; 
              }
              conexion.close();
         } catch (Exception e) {
             System.out.println(e);
         }
         return busqueda_usuario;
     }
     
     public static boolean buscarUsuarioAlterno(String id, String contraseña){
         boolean busqueda_usuario =false;
         
         Connection conexion = null;
         try {
             conexion = ConexionBD.ConectarBD();
             String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM login WHERE num_doc= '"+id+"' && contraseña ='"+contraseña+"'");
             sentencia_preparada= conexion.prepareStatement(sentencia_buscar_usuario);
             resultado =sentencia_preparada.executeQuery();
              if(resultado.next()){
            busqueda_usuario = true;
            }
              conexion.close();
         } catch (Exception e) {
             System.out.println(e);
         }
         return busqueda_usuario;
     }
     public void registrarMovimiento(String accion, String cantidad, String responsable){
        try {
            Conexion con = new Conexion();
            con.ConectarBD();
            String sql = "INSERT INTO inventario(accion,cantidad,fecha,responsable) VALUES ('"+accion+"','"+cantidad+"',NOW(),'"+responsable+"');";
            con.sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
        }
    }
     
}
