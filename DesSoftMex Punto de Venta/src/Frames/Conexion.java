/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author InfectedMac4
 */
public class Conexion {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/expendio","root","");
            System.out.println("Conexión exitosa");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cn;
    } 
    
}
