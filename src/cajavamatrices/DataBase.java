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

    public static Connection getConnection(int id) throws Exception {

        try {

            User u_user = null;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbServer = "jdbc:mysql://localhost:3306/equationsolver";
                String user = "root";
                String password = "boleiro16"; // Change this later
                String query = "SELECT * FROM user WHERE user_id= ?";

                Connection conn = DriverManager.getConnection(dbServer, user, password) ;
                PreparedStatement stmt = conn.prepareStatement(query) ;
                
                stmt.setString(1, String.valueOf(id));
                ResultSet rs = stmt.executeQuery();
                rs.next();
                

                
                    u_user = new User(Integer.parseInt(rs.getString("user_id")),
                    rs.getString("name"),rs.getString("surname"),Integer.parseInt(rs.getString("age")),rs.getString("username"),
                    rs.getString("password"));
                
                
                stmt.close() ;
                conn.close() ;
                return u_user;

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
}
