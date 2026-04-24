package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Bilsox
 */
public class Equipo {
    private String nombre;
    ArrayList<Jugador> jugadoresEquipo = new ArrayList <>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    public void agregarJugadores(Jugador j){
        this.jugadoresEquipo.add(j);
    }
    
    
}
