/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

public class Juego {

    public static void main(String[] args) {
        Mercado merca = new Mercado();
        Equipo equipo = new Equipo();
        merca.cargarJugadores();
        ventanaInicio menu = new ventanaInicio(merca,equipo);
        menu.setVisible(true);
    }
}
