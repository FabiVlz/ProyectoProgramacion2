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
    public void verJugadores(ArrayList<Jugador> JugadoresMercado){
        for (Jugador j: JugadoresMercado){
            j.getNombre();
        }
    }
}
