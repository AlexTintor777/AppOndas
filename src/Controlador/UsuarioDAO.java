/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author alexa
 */
public class UsuarioDAO extends Conexion{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    //*****************************LOGEAR********************************
    public Usuario log (String correo, String pass){
        Usuario us = new Usuario();
        String sql = "SELECT * FROM usuario WHERE correo = ? AND contraseña = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            if(rs.next()){
                us.setId(rs.getInt("idusuario"));;
                us.setNombre(rs.getString("nombre"));
                us.setApellido_p(rs.getString("apellido_p"));
                us.setApellido_m(rs.getString("apellido_m"));
                us.setCorreo(rs.getString("correo"));
                us.setContraseña(pass);
                return us;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    //******************************REGISTRAR JUGADOR********************************
    
    public boolean registrarUsuario(Usuario usuario) {
        PreparedStatement ps = null;
        Connection con;
       
            String sql = "INSERT INTO usuario (nombre,apellido_p,apellido_m,correo,contraseña) VALUES (?,?,?,?,?)";

            try {
                con = getConnection();
                
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getApellido_p());
                ps.setString(3, usuario.getApellido_m());
                ps.setString(4, usuario.getCorreo());
                ps.setString(5, usuario.getContraseña());
                ps.execute();
                return true;
            } catch (Exception ex) {
                return false;
            }
        
    }
    
    
    

}
