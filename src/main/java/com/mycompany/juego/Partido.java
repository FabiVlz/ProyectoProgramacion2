/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.Random;

/**
 *
 * @author yisus
 */
public class Partido {
    private int golesJugador = 0;
    private int golesBot = 0;
    Equipo bot;
    Equipo usuario;

    public Partido(Equipo bot, Equipo usuario) {
        this.bot = bot;
        this.usuario = usuario;
    }
    
    public void jugarPartido(){
        int mediaJugador = usuario.calcularMedia();
        int mediaBot = bot.calcularMedia();

        double probJugador = (double) mediaJugador / (mediaJugador + 2*mediaBot);
        double r = Math.random();

        Random rand = new Random();

        if (r < probJugador) {
            golesJugador = rand.nextInt(rand.nextInt(6)+1) + 1;
            golesBot = rand.nextInt(golesJugador);

            usuario.puntos += 3;
        } else {
            golesBot = rand.nextInt(rand.nextInt(6)+1) + 1;
            golesJugador = rand.nextInt(golesBot);

            bot.puntos += 3;
        }

        usuario.goles += golesJugador;
        bot.goles += golesBot;

        System.out.println(usuario.getNombre() + " " + golesJugador + " - " + golesBot + " " + bot.getNombre());
        }
}
