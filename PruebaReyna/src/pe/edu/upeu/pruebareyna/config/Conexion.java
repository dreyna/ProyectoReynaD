/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.pruebareyna.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin-harold.rojas
 */
public class Conexion {
    private static Connection conex = null;
    private static final String url = "jdbc:mysql://localhost/bd_visitas";
    private static final String usuario = "root";
    private static final String clave = "root";
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(conex==null){
            conex = DriverManager.getConnection(url,usuario,clave);
            }else{
                conex = null;
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conex;
        
    }
    
}
