/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author andru
 */
public class Usuarios {
    
    private String nombreUsuario;
    private String nick;
    private String contraseña;
    private String genero;
    private int edad;
    private boolean activo;
    private LocalDateTime fecha;
    followers fl;
    following fling;

    //this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    public Usuarios(){
      fl = new followers();
      fling = new following();
  }
    public Usuarios(String nombreUsuario,String nick, String contraseña, String genero, LocalDateTime fecha, int edad ) {
        this.nombreUsuario = nombreUsuario;
        this.nick= nick;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.activo = true;
         fl = new followers();
         fling = new following();
         this.fecha = fecha;
    }

    
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getGenero() {
        return genero;
    }
    public String getNick(){
        return this.nick;
    }
    public int getEdad(){
        return this.edad;
    }
    public LocalDateTime getFecha(){
        return this.fecha;
    }

    /*public int getEdad() {
        return edad;
    }*/
    public boolean isActivo() {
        return activo;
    }
    
    void AgregarFollower(String user){
        fl.AgregarFollower(user);
    }
    void AgregarFollowing(String user){
        fling.AgregarFollowing(user);
    }

    boolean equalsIgnoreCase(String userNick) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

