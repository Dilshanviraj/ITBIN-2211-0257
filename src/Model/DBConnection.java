/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBConnection {
    
    static Connection conn;
    static Statement stmt = null;
    
    
    public static Statement getConnStatement(){
        
        try{
            String url =  "jdbc:mysql://localhost:3306/pharmacy";
            conn = DriverManager.getConnection(url, "root", "");
            stmt = conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return stmt;
    }
    
    
    
    public static void closeConnection() throws SQLException{
        conn.close();
    }
    
}
