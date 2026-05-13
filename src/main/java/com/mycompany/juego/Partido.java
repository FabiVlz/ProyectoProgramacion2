/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yisus
 */
public class Partido {
    private int golesLocal = 0;
    private int golesVisitante = 0;
    Equipo visitante;
    Equipo local;

    public Partido(Equipo bot, Equipo usuario) {
        this.visitante = bot;
        this.local = usuario;
    }
    
    public void jugarPartido(ventanaLiga vL){
        int mediaJugador = local.calcularMedia();
        int mediaBot = visitante.calcularMedia();

        double probJugador = (double) mediaJugador / (mediaJugador + mediaBot);
        double r = Math.random();

        Random rand = new Random();

        if (r < probJugador) {
            golesLocal = rand.nextInt(6) + 1;
            golesVisitante = rand.nextInt(golesLocal);

            local.puntos += 3;
        } else {
            golesVisitante = rand.nextInt(6) + 1;
            golesLocal = rand.nextInt(golesVisitante);

            visitante.puntos += 3;
        }
        local.partidosJugados += 1;
        local.goles += golesLocal;
        local.golesEnContra += golesVisitante;
        
        visitante.partidosJugados += 1;
        visitante.goles += golesVisitante;
        visitante.golesEnContra += golesLocal;
        
        JOptionPane.showMessageDialog(vL, "El partido termino: " + local.getNombre() + golesLocal + "-" + golesVisitante + visitante.getNombre() );
    }
    public void simularPartido(){
        int mediaJugador = local.calcularMedia();
        int mediaBot = visitante.calcularMedia();

        double probabilidad = (double) mediaJugador / (mediaJugador + mediaBot);
        double r = Math.random();

        Random rand = new Random();

        if (r < probabilidad) {
            golesLocal = rand.nextInt(6) + 1;
            golesVisitante = rand.nextInt(golesLocal);

            local.puntos += 3;
        } else {
            golesVisitante = rand.nextInt(6) + 1;
            golesLocal = rand.nextInt(golesVisitante);

            visitante.puntos += 3;
        }
        local.partidosJugados += 1;
        local.goles += golesLocal;
        local.golesEnContra += golesVisitante;
        
        visitante.partidosJugados += 1;
        visitante.goles += golesVisitante;
        visitante.golesEnContra += golesLocal;
    }
}
