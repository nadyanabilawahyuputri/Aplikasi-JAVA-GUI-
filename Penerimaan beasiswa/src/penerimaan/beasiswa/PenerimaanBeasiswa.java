/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerimaan.beasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;


public class PenerimaanBeasiswa {
     private static Connection MYSQLConfig;
    
    public static Connection ConfigDB() throws SQLException{
        
        try{
            
            String url  = "jdbc:mysql://localhost:3306/beasiswa";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException e){
            
            System.out.println("Koneksi Database Gagal !!!" + e.getMessage());
            
        }
        
        return MYSQLConfig;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
