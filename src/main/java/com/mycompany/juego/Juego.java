/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;

public class Juego {

    public static void main(String[] args) {
        ArrayList<JButton> botones = new ArrayList<>();
        JButton jugador1 = new JButton("VACIO");botones.add(jugador1);
        JButton jugador2 = new JButton("VACIO");botones.add(jugador2);
        JButton jugador3 = new JButton("VACIO");botones.add(jugador3);
        JButton jugador4 = new JButton("VACIO");botones.add(jugador4);
        JButton jugador5 = new JButton("VACIO");botones.add(jugador5);
        JButton jugador6 = new JButton("VACIO");botones.add(jugador6);
        JButton jugador7 = new JButton("VACIO");botones.add(jugador7);
        JButton jugador8 = new JButton("VACIO");botones.add(jugador8);
        JButton jugador9 = new JButton("VACIO");botones.add(jugador9);
        JButton jugador10 = new JButton("VACIO");botones.add(jugador10);
        JButton jugador11 = new JButton("VACIO");botones.add(jugador11);
        JButton jugador12 = new JButton("VACIO");botones.add(jugador12);
        JButton jugador13 = new JButton("VACIO");botones.add(jugador13);
        JButton jugador14 = new JButton("VACIO");botones.add(jugador14);
        JButton jugador15 = new JButton("VACIO");botones.add(jugador15);
        
        for (JButton b: botones){
            b.setPreferredSize(new Dimension(160,200));
        }
        
        Mercado merca = new Mercado();
        Equipo equipo = new Equipo(botones);
        merca.cargarJugadores();
        ventanaInicio menu = new ventanaInicio(merca,equipo,botones);
        menu.setVisible(true);
    }
}
