/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    
    public static Connection connecrDb(){
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\00146\\Bank\\bankManagement.sqlite");
     return conn;
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
    
    return null; 
      }
}
