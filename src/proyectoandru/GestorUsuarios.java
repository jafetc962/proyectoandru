/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoandru;

import javax.swing.JOptionPane;

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

    public void AddUsuario(String user, String nick, String contra, String gen) {
        Usuarios nuevapersona = new Usuarios(user, nick, contra, gen);
        if (BuscarUsuario(nick)==null) {
            for (int j = 0; j < usuarios.length; j++) {
                if (usuarios[j] == null) {
                    usuarios[j] = nuevapersona;
                    System.out.println("Se registro");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"No se registro");
    }

    public Usuarios BuscarUsuario(String Apodo) {
        for (Usuarios usuario : usuarios) {
            if (usuario != null && usuario.getNick().equals(Apodo)) {
                return usuario;
            }
        }
        return null;
    }

}
