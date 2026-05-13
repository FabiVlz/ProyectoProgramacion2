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
        Jugador neuer = new Jugador("Neuer",1500000,"/com/mycompany/juego/imagenes/Neuer.jpg",84,"PORTERO");this.JugadoresMercado.add(neuer);
        Jugador courtois = new Jugador("Courtois",2000000,"/com/mycompany/juego/imagenes/Courtois.jpg",89,"PORTERO");this.JugadoresMercado.add(courtois);
        Jugador alisson = new Jugador("Alisson",1000000,"/com/mycompany/juego/imagenes/Alisson.jpg",89,"PORTERO");this.JugadoresMercado.add(alisson);
        Jugador maignan = new Jugador("Maignan",1250000,"/com/mycompany/juego/imagenes/Maignan.jpg",87,"PORTERO");this.JugadoresMercado.add(maignan);
        Jugador donnarumma = new Jugador("Donnaruma",1400000,"/com/mycompany/juego/imagenes/Donnarumma.jpg",89,"PORTERO");this.JugadoresMercado.add(donnarumma);
        /*
        Defensas
        */
        Jugador vanDijk = new Jugador("van Dijk",1000000,"/com/mycompany/juego/imagenes/vanDijk.jpg",90,"DEFENSA");this.JugadoresMercado.add(vanDijk);
        Jugador carvajal = new Jugador("Carvajal",600000,"/com/mycompany/juego/imagenes/Carvajal.jpg",85,"DEFENSA");this.JugadoresMercado.add(carvajal);
        Jugador marquinhos = new Jugador("Marquinhos",1200000,"/com/mycompany/juego/imagenes/Marquinhos.jpg",87,"DEFENSA");this.JugadoresMercado.add(marquinhos);
        Jugador upamecano = new Jugador("Upamecano",1150000,"/com/mycompany/juego/imagenes/Upamecano.jpg",85,"DEFENSA");this.JugadoresMercado.add(upamecano);
        Jugador alexander = new Jugador("Alexander-Arnold",1110000,"/com/mycompany/juego/imagenes/Alexander.jpg",86,"DEFENSA");this.JugadoresMercado.add(alexander);
        Jugador hakimi = new Jugador("Hakimi",1160000,"/com/mycompany/juego/imagenes/Hakimi.jpg",89,"DEFENSA");this.JugadoresMercado.add(hakimi);
        Jugador bastoni = new Jugador("Bastoni",1250000,"/com/mycompany/juego/imagenes/Bastoni.jpg",87,"DEFENSA");this.JugadoresMercado.add(bastoni);
        Jugador saliba = new Jugador("Saliba",1350000,"/com/mycompany/juego/imagenes/Saliba.jpg",87,"DEFENSA");this.JugadoresMercado.add(saliba);
        Jugador nuno = new Jugador("Nuno Mendes",1300000,"/com/mycompany/juego/imagenes/Nuno.jpg",86,"DEFENSA");this.JugadoresMercado.add(nuno);
        Jugador pacho = new Jugador("Pacho",1500000,"/com/mycompany/juego/imagenes/Pacho.jpg",86,"DEFENSA");this.JugadoresMercado.add(pacho);
        Jugador norza = new Jugador("Norza",3000000,"/com/mycompany/juego/imagenes/Norza.png",99,"DEFENSA"); this.JugadoresMercado.add(norza);
        /*
        Mediocampistas
        */
        Jugador deBruyne = new Jugador("DeBruyne",1000000,"/com/mycompany/juego/imagenes/deBruyne.jpg",87,"MEDIO");this.JugadoresMercado.add(deBruyne);
        Jugador calhanoglu = new Jugador("Calhanoglu",1000000,"/com/mycompany/juego/imagenes/Calhanoglu.jpg",86,"MEDIO");this.JugadoresMercado.add(calhanoglu);
        Jugador kimmich = new Jugador("Kimmich",1000000,"/com/mycompany/juego/imagenes/Kimmich.jpg",89,"MEDIO");this.JugadoresMercado.add(kimmich);
        Jugador rodri = new Jugador("Rodri",1000000,"/com/mycompany/juego/imagenes/Rodri.jpg",90,"MEDIO");this.JugadoresMercado.add(rodri);
        Jugador rice = new Jugador("Rice",1000000,"/com/mycompany/juego/imagenes/Rice.jpg",87,"MEDIO");this.JugadoresMercado.add(rice);
        Jugador pedri = new Jugador("Pedri",1000000,"/com/mycompany/juego/imagenes/Pedri.jpg",89,"MEDIO");this.JugadoresMercado.add(pedri);
        Jugador bellingham = new Jugador("Bellingham",1000000,"/com/mycompany/juego/imagenes/Bellingham.jpg",90,"MEDIO");this.JugadoresMercado.add(bellingham);
        Jugador vitinha = new Jugador("Vitinha",1000000,"/com/mycompany/juego/imagenes/Vitinha.jpg",89,"MEDIO");this.JugadoresMercado.add(vitinha);
        Jugador wirtz = new Jugador("Wirtz",1000000,"/com/mycompany/juego/imagenes/Wirtz.jpg",89,"MEDIO");this.JugadoresMercado.add(wirtz);
        Jugador musiala = new Jugador("Musiala",1000000,"/com/mycompany/juego/imagenes/Musiala.jpg",88,"MEDIO");this.JugadoresMercado.add(musiala);
        /*
        Delanteros
        */
        Jugador messi = new Jugador("Messi",1000000,"/com/mycompany/juego/imagenes/Messi.jpg",86,"DELANTERO");this.JugadoresMercado.add(messi);
        Jugador son = new Jugador("Son",1000000,"/com/mycompany/juego/imagenes/Son.jpg",85,"DELANTERO");this.JugadoresMercado.add(son);
        Jugador kane = new Jugador("Harry Kane",1000000,"/com/mycompany/juego/imagenes/Kane.jpg",89,"DELANTERO");this.JugadoresMercado.add(kane);
        Jugador salah = new Jugador("Salah",1000000,"/com/mycompany/juego/imagenes/Salah.jpg",91,"DELANTERO");this.JugadoresMercado.add(salah);
        Jugador mbappe = new Jugador("Mbappe",1000000,"/com/mycompany/juego/imagenes/Mbappe.jpg",91,"DELANTERO");this.JugadoresMercado.add(mbappe);
        Jugador raphinha = new Jugador("Raphinha",1000000,"/com/mycompany/juego/imagenes/Raphinha.jpg",89,"DELANTERO");this.JugadoresMercado.add(raphinha);
        Jugador vini = new Jugador("Vinicius Jr",1000000,"/com/mycompany/juego/imagenes/Vini.jpg",89,"DELANTERO");this.JugadoresMercado.add(vini);
        Jugador saka = new Jugador("Saka",1000000,"/com/mycompany/juego/imagenes/Saka.jpg",88,"DELANTERO");this.JugadoresMercado.add(saka);
        Jugador kvaratskhelia = new Jugador("Kvaratskhelia",1000000,"/com/mycompany/juego/imagenes/Kvaratskhelia.jpg",87,"DELANTERO");this.JugadoresMercado.add(kvaratskhelia);
        Jugador yamal = new Jugador("Lamine Yamal",1000000,"/com/mycompany/juego/imagenes/Yamal.jpg",89,"DELANTERO");this.JugadoresMercado.add(yamal);
        
    }
}
