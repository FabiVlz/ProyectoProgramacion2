/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

public class Juego {

    public static void main(String[] args) {
        Mercado merCa = new Mercado();
        merCa.cargarJugadores();
        merCa.verJugadores(JugadoresMercado);
        ventanaMenu menu = new ventanaMenu();
        menu.setVisible(true);
    }
}
