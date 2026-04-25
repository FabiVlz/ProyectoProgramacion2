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
        this.JugadoresMercado.add(messi);
    }
    public void verJugadores(){
        for (Jugador j: this.JugadoresMercado){
            System.out.println(j.getNombre());
        }
    }
}
