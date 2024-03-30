/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Seccion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class SeccionDAO extends Conexion{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public boolean activarPantalla(Seccion seccion){
        PreparedStatement ps = null;
        Connection con;
       
            String sql = "INSERT INTO seccion (clase,lamina,cod_usuario) VALUES (?,?,?)";

            try {
                con = getConnection();
                
                ps = con.prepareStatement(sql);
                ps.setInt(1, seccion.getClase());
                ps.setInt(2, seccion.getLamina());
                ps.setInt(3, seccion.getCod_usuario());

                ps.execute();
                return true;
            } catch (Exception ex) {
                return false;
            }
        
    }
    
    
    public void actualizarBarra(Seccion seccion){
        PreparedStatement ps = null;
        con = cn.getConnection();
        
        String sql = "UPDATE seccion SET lamina=? WHERE idseccion=?";

            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, seccion.getLamina());
                ps.setInt(2, seccion.getIdseccion());
                ps.execute();
            } catch (SQLException ex) {
               
            }  
    }
    
     public int getBarra(Seccion seccion, Usuario us){
        PreparedStatement ps = null;
        con = cn.getConnection();
        ResultSet rs;
        
        String sql = "SELECT clase,lamina FROM seccion WHERE cod_jugador=? AND idseccion = ?";

            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, us.getId());
                ps.setInt(2, seccion.getIdseccion());
                rs = ps.executeQuery();
                if(rs.next()){
                    return rs.getInt(1);
                }
                return -1;
                
            } catch (SQLException ex) {
               return -1;
            }  
    }
     
     public Seccion getIdSeccion(Seccion seccion, Usuario us){
         PreparedStatement ps = null;
        con = cn.getConnection();
        ResultSet rs;
        
        String sql = "SELECT idseccion FROM seccion WHERE cod_jugador=? AND clase = ? AND lamina = ?";

            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, us.getId());
                ps.setInt(2, seccion.getClase());
                 ps.setInt(2, seccion.getLamina());
                rs = ps.executeQuery();
                if(rs.next()){
                    Seccion seccion2 = new Seccion();
                    seccion2.setClase(seccion.getClase());
                    seccion2.setLamina(seccion.getLamina());
                    seccion2.setCod_usuario(seccion.getCod_usuario());
                    seccion2.setIdseccion(rs.getInt(1));
                    return seccion2;
                }
                return null;
                
            } catch (SQLException ex) {
               return null;
            }
     }
}
