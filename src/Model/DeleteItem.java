/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVER
 */
public class DeleteItem {
    
    static Statement st;
    
    
    public void deleteMedicine(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM medicine WHERE ItamNumber = '"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteEquipment(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM medicaleq WHERE ItamID ='"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteHealthyProducts(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM medicalhp WHERE ItamID ='"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
}
