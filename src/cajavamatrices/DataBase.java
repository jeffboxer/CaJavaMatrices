/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajavamatrices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class DataBase {
    
    public static Connection getConnection() throws Exception{
            
        
        try {
            
            String driver = "com.mysql.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/friends";
            String username = "root";
            String password = "Adorominas22";
            String query = "SELECT * FROM user WHERE user_id= ?";
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = conn.prepareStatement(query) ;
            System.out.println("Connnected");
            return conn;
            
                
            
        }catch (Exception e) {
            System.out.println(e);
    }
        
        
        
        
        return null;
    
    
    
    
    }
}
