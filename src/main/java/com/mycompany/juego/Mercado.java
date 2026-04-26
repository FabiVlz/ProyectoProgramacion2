package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Bilsox
 */
public class Mercado {
    ArrayList<Jugador> JugadoresMercado = new ArrayList <>();

    public void cargarJugadores(){
        Jugador messi = new Jugador("Messi");this.JugadoresMercado.add(messi);
        Jugador cristiano = new Jugador("Cristiano");this.JugadoresMercado.add(cristiano);
        Jugador neymar = new Jugador("Neymar");this.JugadoresMercado.add(neymar);
        Jugador modric = new Jugador("Modric");this.JugadoresMercado.add(modric);
        Jugador lamine = new Jugador("Lamine");this.JugadoresMercado.add(lamine);
        Jugador mbappe = new Jugador("Mbappe");this.JugadoresMercado.add(mbappe);
        Jugador bellingham = new Jugador("Bellingham");this.JugadoresMercado.add(bellingham);
        Jugador neuer = new Jugador("Neuer");this.JugadoresMercado.add(neuer);
        Jugador vini = new Jugador("Vini Jr");this.JugadoresMercado.add(vini);
        Jugador pele = new Jugador("Pele");this.JugadoresMercado.add(pele);
        Jugador maradona = new Jugador("Maradona");this.JugadoresMercado.add(maradona);
        Jugador mike = new Jugador("Mike");this.JugadoresMercado.add(mike);
        Jugador fabi = new Jugador("Fabi");this.JugadoresMercado.add(fabi);
        Jugador monge = new Jugador("Monge");this.JugadoresMercado.add(monge);
        
        this.JugadoresMercado.add(mbappe);
        this.JugadoresMercado.add(lamine);
        this.JugadoresMercado.add(bellingham);
        this.JugadoresMercado.add(neuer);
        this.JugadoresMercado.add(vini);
        this.JugadoresMercado.add(pele);
        this.JugadoresMercado.add(maradona);
        this.JugadoresMercado.add(messi);
        this.JugadoresMercado.add(cristiano);
        this.JugadoresMercado.add(mike);
        this.JugadoresMercado.add(fabi);
        this.JugadoresMercado.add(monge);
        
    }
}
