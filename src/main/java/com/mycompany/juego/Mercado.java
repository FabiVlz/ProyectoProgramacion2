package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Bilsox
 */
public class Mercado {
    ArrayList<Jugador> JugadoresMercado = new ArrayList <>();

    public void cargarJugadores(){
        Jugador messi = new Jugador("Messi");
        Jugador cristiano = new Jugador("CR7");
        this.JugadoresMercado.add(messi);
        this.JugadoresMercado.add(cristiano);
    }
    public void verJugadores(){
        for (Jugador j: this.JugadoresMercado){
            System.out.println(j.getNombre());
        }
    }
}
