package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Bilsox
 */
public class Mercado {
    ArrayList<Jugador> JugadoresMercado = new ArrayList <>();

    public void cargarJugadores(){
        /*
        Porteros
        */
        Jugador neuer = new Jugador("Neuer",1500000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(neuer);
        Jugador courtois = new Jugador("Courtois",2000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(courtois);
        Jugador alisson = new Jugador("Alisson",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(alisson);
        Jugador maignan = new Jugador("Maignan",1250000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(maignan);
        Jugador donnaruma = new Jugador("Donnaruma",1400000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(donnaruma);
        /*
        Defensas
        */
        Jugador vanDijk = new Jugador("van Dijk",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(vanDijk);
        Jugador carvajal = new Jugador("Carvajal",600000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(carvajal);
        Jugador marquinhos = new Jugador("Marquinhos",1200000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(marquinhos);
        Jugador upamecano = new Jugador("Upamecano",1150000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(upamecano);
        Jugador alexander = new Jugador("Alexander-Arnold",1110000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(alexander);
        Jugador hakimi = new Jugador("Hakimi",1160000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(hakimi);
        Jugador bastoni = new Jugador("Bastoni",1250000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(bastoni);
        Jugador saliba = new Jugador("Saliba",1350000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(saliba);
        Jugador nuno = new Jugador("Nuno Mendes",1300000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(nuno);
        Jugador pacho = new Jugador("Pacho",1500000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(pacho);
        /*
        Mediocampistas
        */
        Jugador deBruyne = new Jugador("DeBruyne",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(deBruyne);
        Jugador calhanoglu = new Jugador("Calhanoglu",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(calhanoglu);
        Jugador kimmich = new Jugador("Kimmich",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(kimmich);
        Jugador rodri = new Jugador("Rodri",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(rodri);
        Jugador rice = new Jugador("Rice",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(rice);
        Jugador pedri = new Jugador("Pedri",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(pedri);
        Jugador bellingham = new Jugador("Bellingham",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(bellingham);
        Jugador vitinha = new Jugador("Vitinha",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(vitinha);
        Jugador wirtz = new Jugador("Wirtz",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(wirtz);
        Jugador musiala = new Jugador("Musiala",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(musiala);
        /*
        Delanteros
        */
        Jugador messi = new Jugador("Messi",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(messi);
        Jugador son = new Jugador("Son",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(son);
        Jugador kane = new Jugador("Harry Kane",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(kane);
        Jugador salah = new Jugador("Salah",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(salah);
        Jugador mbappe = new Jugador("Mbappe",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(mbappe);
        Jugador raphinha = new Jugador("Raphinha",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(raphinha);
        Jugador vini = new Jugador("Vinicius Jr",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(vini);
        Jugador saka = new Jugador("Saka",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(saka);
        Jugador kvaratskhelia = new Jugador("Kvaratskhelia",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(kvaratskhelia);
        Jugador yamal = new Jugador("Lamine Yamal",1000000,"/com/mycompany/juego/imagenes/fressi.jpeg");this.JugadoresMercado.add(yamal);
        
    }
}
