package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Bilsox
 */
public class Equipo {
    private String nombre;
    ArrayList<Jugador> jugadoresEquipo = new ArrayList <>();

    public void agregarJugadores(Jugador j){
        this.jugadoresEquipo.add(j);
    }
    public String getNombre() {
        return nombre;
    }
}
