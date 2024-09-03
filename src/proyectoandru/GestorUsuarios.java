/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

/**
 *
 * @author andru
 */
public class GestorUsuarios {
    private Usuarios[] usuarios;
    private int contador;
    

    public GestorUsuarios() {
        usuarios = new Usuarios[100]; 
        contador = 0;
        
    }

    
    
   
    public void agregarUsuario(Usuarios usuario) {
        if (contador == usuarios.length) {
            
            Usuarios[] nuevoArreglo = new Usuarios[usuarios.length + 1];
            for(int i = 0; i < usuarios.length; i++) {
                nuevoArreglo[i] = usuarios[i];
            }
            usuarios = nuevoArreglo;
        }
        usuarios[contador] = usuario;
        contador++;
    }
    
     public void AddUsuario(String user, String nick, String contra, String gen) {
        Usuarios nuevapersona = new Usuarios(user, nick, contra, gen);
        
        for(int j=0; j<usuarios.length;j++){
            if(usuarios[j]==null){
                usuarios[j]=nuevapersona;
                break;
            }
        }
        
     }
     
    
     
    
    public Usuarios getUsuario(int index) {
        if (index >= 0 && index < contador) {
            return usuarios[index];
        } else {
            return null; // O lanzar una excepción
        }
    }
    
    
    
    
    public String verificarUsuario(String username, String contra) {
        if (usuarios == null) {
            return null;
        }
        for (int pos = 0; pos < usuarios.length; pos++) {
            if (usuarios[pos] != null) {
                if (usuarios[pos].getNick().equalsIgnoreCase(username)) {

                    if (usuarios[pos].getContraseña().equals(contra)) {
                        return contra;
                    } else {
                        return username;
                    }

                }
            }
        }
        return null;
    }
    
    
    
    
}