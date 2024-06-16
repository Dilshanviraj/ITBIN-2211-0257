/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SERVER
 */
public class UpdateItems {
    
    static Statement st;
    static ResultSet rs;
    
    
    public void updateMedicine(int itemNo, String name, String qty, String status, String price){
        
        try {
            st = DBConnection.getConnStatement();

            // Validate and sanitize inputs
            int quantity = Integer.parseInt(qty);
            int itemPrice = Integer.parseInt(price);

            // Create the SQL update statement
            String query = "UPDATE medicine SET ItamName = '" + name + "', qty = " + quantity + ", status = '" + status + "', onePrice = " + itemPrice + " WHERE ItamNumber = " + itemNo;

            // Execute the update
            int rowsUpdated = st.executeUpdate(query);

            // Optional: Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("An existing medicine record was updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    public void updateEquipment(int itemNo, String name, String qty, String status, String price){
        
        try {
            st = DBConnection.getConnStatement();

            // Validate and sanitize inputs
            int quantity = Integer.parseInt(qty);
            double itemPrice = Double.parseDouble(price);

            // Create the SQL update statement
            String query = "UPDATE medicaleq SET ItamName = '" + name + "', qty = " + quantity + ", status = '" + status + "', onePrice = " + itemPrice + " WHERE ItamNumber = " + itemNo;

            // Execute the update
            int rowsUpdated = st.executeUpdate(query);

            // Optional: Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("An existing Equipment record was updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
    public void updateHealthyProducts(int itemNo, String name, String qty, String status, String price){
        
        try {
            st = DBConnection.getConnStatement();

            // Validate and sanitize inputs
            int quantity = Integer.parseInt(qty);
            double itemPrice = Double.parseDouble(price);

            // Create the SQL update statement
            String query = "UPDATE medicalhp SET ItamName = '" + name + "', qty = " + quantity + ", status = '" + status + "', onePrice = " + itemPrice + " WHERE ItamNumber = " + itemNo;

            // Execute the update
            int rowsUpdated = st.executeUpdate(query);

            // Optional: Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("An existing HProduct record was updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
    
    
}
