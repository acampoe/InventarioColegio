/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    
    
   
public class Conexion {
     public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public void ConectarBD(){
         try{
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://192.168.88.100/inventariodatabase";
            conexion = (Connection) DriverManager.getConnection(url_bd,"root","root");
            sentencia = (Statement) conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void DesconectarBD(){
        try{
            if (conexion !=null){
                if (sentencia !=null){
                    sentencia.close();
                }
            conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    public Connection getConnection(){
    return conexion;
    }
}
