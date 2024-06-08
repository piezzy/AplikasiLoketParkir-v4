/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Dany
 */
public class DatabaseUtilities {
    
    private static Connection myConnection;
    
    public static Connection getMyConnection() {
        if (myConnection == null) {
            
            try {
                Driver driver=new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(driver);
                
                String url="jdbc:mysql://localhost:3306/aplikasiparkir";
                String user="root";
                String password="";
                
                myConnection=DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                System.out.println("Koneksi Gagal");
            }
        }
        return myConnection;
    }
    
    public static void closeConnection(){
        if (myConnection!=null) {
            try {
                myConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
