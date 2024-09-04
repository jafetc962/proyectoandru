/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto20242;

/**
 *
 * @author andru
 */
public class GestorTweets {
    
 private tweets[] tweets;
    private int contador;
    

    public GestorTweets() {
        tweets = new tweets[100]; 
        contador = 0;
    }
    
     public void agregarTweet(tweets nuevoTweet) {
        // Si el arreglo está lleno, lo redimensionamos
        if (contador == tweets.length) {
            System.out.println("");
        }
        tweets[contador] = nuevoTweet; // Añadimos el nuevo objeto al arreglo
        contador++;                         // Incrementamos el tamaño
    }
    
    
    
    
        
}
