/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

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
    followers h;

    //this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    public Usuarios(){
      h = new followers();
  }
    public Usuarios(String nombreUsuario,String nick, String contraseña, String genero/*int edad*/ ) {
        this.nombreUsuario = nombreUsuario;
        this.nick= nick;
        this.contraseña = contraseña;
        this.genero = genero;
        //this.edad = edad;
        this.activo = true;
         h = new followers();
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

    /*public int getEdad() {
        return edad;
    }*/
    public boolean isActivo() {
        return activo;
    }
    
    void AgregarFollower(String user){
        h.AgregarFollower(user);
    }
    
    
}

