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
 * @author user
 */
public class GetMedicine {
    Statement st;
    ResultSet rs;
    
    public ResultSet getMedicine(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from medicine");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet getEquipment(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from medicaleq");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getHealthyProducts(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from medicalhp");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
