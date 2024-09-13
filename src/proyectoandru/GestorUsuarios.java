/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author andru
 */
public class GestorUsuarios {

    Usuarios u;
    private String lista;
    private Usuarios[] usuarios;
    private Usuarios[] cuentasDesactivada;
    private Usuarios UserLogeado;
    private int contador;
    private String apo;
    private String fechaString;
    Usuarios[] ApodosS = new Usuarios[20];

    public GestorUsuarios() {
        usuarios = new Usuarios[100];
        this.cuentasDesactivada=new Usuarios[100];
        contador = 0;
        lista = "";
        u = new Usuarios();
    }

    public void AddUsuario(String user, String nick, String contra, String gen, LocalDateTime fecha, int edad) {

        Usuarios nuevapersona = new Usuarios(user,nick,contra, gen, fecha,edad);
        if (BuscarUsuario(nick) == null) {
            for (int j = 0; j < usuarios.length; j++) {
                if (usuarios[j] == null) {
                    usuarios[j] = nuevapersona;
                    System.out.println("Se registro");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No se registro");
    }

    void SetUsuarioLogeado(Usuarios logeado) {
        this.UserLogeado = logeado;
    }

    public Usuarios BuscarUsuario(String Apodo) {
        for (Usuarios usuario : usuarios) {
            if (usuario != null && usuario.getNick().equals(Apodo)) {
                return usuario;
            }
        }
        return null;
    }

    Usuarios Logged() {
        return UserLogeado;
    }

    public void foundusers(String contains, Usuarios[] found) {
        int contador = 0;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getNick().contains(contains)) {
                if (!usuarios[i].getNick().equals(Logged()) && usuarios[i].isActivo()) {
                    found[contador] = usuarios[i];
                    this.ApodosS[i] = found[i];
                    contador++;
                }
            }
        }
    }

    public Usuarios[] printusers() {
        return ApodosS;
    }

    String Busqueda(String nick){
        String busqueda = "";
        
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i]!= null && nick.contains(usuarios[i].getNick())) {
                busqueda = usuarios[i].getNick();
            }
        }
        
        return busqueda;
    }
    
    public String FechaActual() {
        LocalDateTime fechaActual = LocalDateTime.now();

        // Formatear la fecha y hora en el formato deseado (por ejemplo: "dd-MM-yyyy HH:mm:ss")
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Convertir a String
        fechaString = fechaActual.format(formato);
        return fechaString;
    }
    
    
    
    
    
    public void desactivarCuenta(String userNick) {
        if (BuscarUsuario(userNick) != null) {

            for (int pos = 0; pos < cuentasDesactivada.length; pos++) {

                if (cuentasDesactivada[pos] != null) {

                    cuentasDesactivada[pos] = BuscarUsuario(userNick);
                }
                if (usuarios[pos] != null && usuarios[pos].getNick().equalsIgnoreCase(userNick)) {

                    usuarios[pos] = null;

                }

            }
        }
    }

    
    public Usuarios BuscarCuentaDesactivada(String Apodo) {
        for (int pos=0;pos<cuentasDesactivada.length;pos++) {
            if (cuentasDesactivada[pos] != null && cuentasDesactivada[pos].getNick().equals(Apodo)) {
               if(usuarios[pos]!=null){
                   usuarios[pos]=cuentasDesactivada[pos];
                   cuentasDesactivada[pos]=null;
                   return usuarios[pos];
               }
            }
        }
        return null;
    }
    
    
    
    
}
