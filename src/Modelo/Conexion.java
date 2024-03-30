/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class Conexion {
   Connection con;
   public Connection getConnection(){
       try{
           String myBD = "jdbc:mysql://pacheco.chillan.ubiobio.cl:3329/db_ondas";
           con = DriverManager.getConnection(myBD, "root", "ale123456789ale");
           
           
           return con;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
           JOptionPane.showMessageDialog(null, "no se puede entrar bd");
       }
       return null;
   }
}