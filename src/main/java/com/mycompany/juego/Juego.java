/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

public class Juego {

    public static void main(String[] args) {
        Mercado merca = new Mercado();
        merca.cargarJugadores();
        ventanaMenu menu = new ventanaMenu(merca);
        menu.setVisible(true);
    }
}
