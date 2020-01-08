/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Lucho Pro
 */
public class ConnectionUtil {
     Connection conn=null;
    public static Connection conDB(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/vitefama","root","");
            
            return con;
        } catch (Exception ex) {
            return null;
        }

    
    
    
    }
}
