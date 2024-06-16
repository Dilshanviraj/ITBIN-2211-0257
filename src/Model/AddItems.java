/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SERVER
 */
public class AddItems {
    static Statement stmt;
    static ResultSet rs;
    
    
    public void addMedicine(String name, String qty, String status, String price){
    try{
            stmt = DBConnection.getConnStatement();
            stmt.executeUpdate("INSERT INTO medicine (ItamName, qty, status, onePrice) VALUES ('"+ name +"','"+ qty +"','"+ status +"','"+ price +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public void addEquipment(String name, String qty, String status, String price){
    try{
            stmt = DBConnection.getConnStatement();
            //rs = stmt.executeUpdate("INSERT INTO medicaleq VALUES '"+ name +"', '"+ qty +"', '"+ status +"', '"+ price +"'");
            stmt.executeUpdate("INSERT INTO medicaleq (ItamName, qty, Status, onePrice) VALUES ('"+ name +"', '"+ qty +"', '"+ status +"', '"+ price +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //medicalhp
    public void addHealthyProducts(String name, String qty, String status, String price){
    try{
            stmt = DBConnection.getConnStatement();
            stmt.executeUpdate("INSERT INTO medicalhp (ItamName, qty, Status, onePrice) VALUES ('"+ name +"', '"+ qty +"', '"+ status +"', '"+ price +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    
}
