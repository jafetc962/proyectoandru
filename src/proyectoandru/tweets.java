/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto20242;

import java.util.Date;

public class tweets {
    private String tweet;
    private String user;
    private Date fecha;

    public tweets(String user, String tweet) {
        this.user = user;
        this.tweet = tweet;
        this.fecha = new Date(); // Inicializa la fecha al momento de crear el tweet
    }

    public String getUser() {
        return user;
    }

    public String getTweet() {
        return tweet;
    }

    public Date getFecha() {
        return fecha;
    }
}

