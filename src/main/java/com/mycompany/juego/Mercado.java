package com.mycompany.juego;
import java.util.ArrayList;
/**
 *
 * @author Fabian
 */
public class Mercado {
    ArrayList<Jugador> JugadoresMercado = new ArrayList <>();

    public void cargarJugadores(){
        /*
        Porteros
        */
        Jugador isaias = new Jugador("Isaias",0,"/com/mycompany/juego/imagenes/Isaias.jpg",67,"PORTERO");this.JugadoresMercado.add(isaias);
        Jugador neuer = new Jugador("Neuer",1100000,"/com/mycompany/juego/imagenes/Neuer.jpg",84,"PORTERO");this.JugadoresMercado.add(neuer);
        Jugador courtois = new Jugador("Courtois",2300000,"/com/mycompany/juego/imagenes/Courtois.jpg",89,"PORTERO");this.JugadoresMercado.add(courtois);
        Jugador alisson = new Jugador("Alisson",2300000,"/com/mycompany/juego/imagenes/Alisson.jpg",89,"PORTERO");this.JugadoresMercado.add(alisson);
        Jugador maignan = new Jugador("Maignan",1600000,"/com/mycompany/juego/imagenes/Maignan.jpg",87,"PORTERO");this.JugadoresMercado.add(maignan);
        Jugador donnarumma = new Jugador("Donnaruma",2300000,"/com/mycompany/juego/imagenes/Donnarumma.jpg",89,"PORTERO");this.JugadoresMercado.add(donnarumma);
        Jugador carrasco = new Jugador("Carrasco",9000000,"/com/mycompany/juego/imagenes/Carrasco.jpg",98,"PORTERO");this.JugadoresMercado.add(carrasco);
        /*
        Defensas
        */
        Jugador fabian = new Jugador("Fabian",0,"/com/mycompany/juego/imagenes/Fabian.jpg",67,"DEFENSA");this.JugadoresMercado.add(fabian);
        Jugador vanDijk = new Jugador("van Dijk",2800000,"/com/mycompany/juego/imagenes/van Dijk.jpg",90,"DEFENSA");this.JugadoresMercado.add(vanDijk);
        Jugador carvajal = new Jugador("Carvajal",1200000,"/com/mycompany/juego/imagenes/Carvajal.jpg",85,"DEFENSA");this.JugadoresMercado.add(carvajal);
        Jugador marquinhos = new Jugador("Marquinhos",1600000,"/com/mycompany/juego/imagenes/Marquinhos.jpg",87,"DEFENSA");this.JugadoresMercado.add(marquinhos);
        Jugador upamecano = new Jugador("Upamecano",1200000,"/com/mycompany/juego/imagenes/Upamecano.jpg",85,"DEFENSA");this.JugadoresMercado.add(upamecano);
        Jugador alexander = new Jugador("Alexander-Arnold",1400000,"/com/mycompany/juego/imagenes/Alexander-Arnold.jpg",86,"DEFENSA");this.JugadoresMercado.add(alexander);
        Jugador hakimi = new Jugador("Hakimi",2300000,"/com/mycompany/juego/imagenes/Hakimi.jpg",89,"DEFENSA");this.JugadoresMercado.add(hakimi);
        Jugador bastoni = new Jugador("Bastoni",1600000,"/com/mycompany/juego/imagenes/Bastoni.jpg",87,"DEFENSA");this.JugadoresMercado.add(bastoni);
        Jugador saliba = new Jugador("Saliba",1600000,"/com/mycompany/juego/imagenes/Saliba.jpg",87,"DEFENSA");this.JugadoresMercado.add(saliba);
        Jugador nuno = new Jugador("Nuno Mendes",1300000,"/com/mycompany/juego/imagenes/Nuno.jpg",86,"DEFENSA");this.JugadoresMercado.add(nuno);
        Jugador pacho = new Jugador("Pacho",1400000,"/com/mycompany/juego/imagenes/Pacho.jpg",86,"DEFENSA");this.JugadoresMercado.add(pacho);
        Jugador norza = new Jugador("Norza",10000000,"/com/mycompany/juego/imagenes/Norza.png",99,"DEFENSA"); this.JugadoresMercado.add(norza);
        /*
        Mediocampistas
        */
        Jugador marvin = new Jugador("Marvin",0,"/com/mycompany/juego/imagenes/Marvin.jpg",67,"MEDIO");this.JugadoresMercado.add(marvin);
        Jugador braulio = new Jugador("Braulio",0,"/com/mycompany/juego/imagenes/Braulio.jpg",67,"MEDIO");this.JugadoresMercado.add(braulio);
        Jugador deBruyne = new Jugador("DeBruyne",1600000,"/com/mycompany/juego/imagenes/deBruyne.jpg",87,"MEDIO");this.JugadoresMercado.add(deBruyne);
        Jugador calhanoglu = new Jugador("Calhanoglu",1400000,"/com/mycompany/juego/imagenes/Çalhanoğlu.jpg",86,"MEDIO");this.JugadoresMercado.add(calhanoglu);
        Jugador kimmich = new Jugador("Kimmich",2300000,"/com/mycompany/juego/imagenes/Kimmich.jpg",89,"MEDIO");this.JugadoresMercado.add(kimmich);
        Jugador rodri = new Jugador("Rodri",2800000,"/com/mycompany/juego/imagenes/Rodri.jpg",90,"MEDIO");this.JugadoresMercado.add(rodri);
        Jugador rice = new Jugador("Rice",1600000,"/com/mycompany/juego/imagenes/Rice.jpg",87,"MEDIO");this.JugadoresMercado.add(rice);
        Jugador pedri = new Jugador("Pedri",2300000,"/com/mycompany/juego/imagenes/Pedri.jpg",89,"MEDIO");this.JugadoresMercado.add(pedri);
        Jugador bellingham = new Jugador("Bellingham",2800000,"/com/mycompany/juego/imagenes/Bellingham.jpg",90,"MEDIO");this.JugadoresMercado.add(bellingham);
        Jugador vitinha = new Jugador("Vitinha",2300000,"/com/mycompany/juego/imagenes/Vitinha.jpg",89,"MEDIO");this.JugadoresMercado.add(vitinha);
        Jugador wirtz = new Jugador("Wirtz",2300000,"/com/mycompany/juego/imagenes/Wirtz.jpg",89,"MEDIO");this.JugadoresMercado.add(wirtz);
        Jugador musiala = new Jugador("Musiala",1900000,"/com/mycompany/juego/imagenes/Musiala.jpg",88,"MEDIO");this.JugadoresMercado.add(musiala);
        /*
        Delanteros
        */
        Jugador mike = new Jugador("Mike",0,"/com/mycompany/juego/imagenes/Mike.jpg",67,"DELANTERO");this.JugadoresMercado.add(mike);
        Jugador monje = new Jugador("Monje",0,"/com/mycompany/juego/imagenes/Christian.jpg",67,"DELANTERO");this.JugadoresMercado.add(monje);
        Jugador haaland = new Jugador("Haland",1000000,"/com/mycompany/juego/imagenes/Haaland de Temu.jpg",74,"DELANTERO");this.JugadoresMercado.add(haaland);
        Jugador frappe = new Jugador("Mbappe",1000000,"/com/mycompany/juego/imagenes/Mbappé (3).jpg",74,"DELANTERO");this.JugadoresMercado.add(frappe);
        Jugador messi = new Jugador("Messi",1400000,"/com/mycompany/juego/imagenes/Messi.jpg",86,"DELANTERO");this.JugadoresMercado.add(messi);
        Jugador ronaldo = new Jugador("La Bichota",1400000,"/com/mycompany/juego/imagenes/Cristiano Ronaldo.jpg",86,"DELANTERO");this.JugadoresMercado.add(ronaldo);
        Jugador son = new Jugador("Son",1200000,"/com/mycompany/juego/imagenes/Son.jpg",85,"DELANTERO");this.JugadoresMercado.add(son);
        Jugador kane = new Jugador("Harry Kane",2300000,"/com/mycompany/juego/imagenes/Kane.jpg",89,"DELANTERO");this.JugadoresMercado.add(kane);
        Jugador salah = new Jugador("Salah",3500000,"/com/mycompany/juego/imagenes/Salah.jpg",91,"DELANTERO");this.JugadoresMercado.add(salah);
        Jugador mbappé = new Jugador("Mbappé",3500000,"/com/mycompany/juego/imagenes/Mbappé.jpg",91,"DELANTERO");this.JugadoresMercado.add(mbappé);
        Jugador raphinha = new Jugador("Raphinha",2300000,"/com/mycompany/juego/imagenes/Raphinha.jpg",89,"DELANTERO");this.JugadoresMercado.add(raphinha);
        Jugador vini = new Jugador("Vinicius Jr",2300000,"/com/mycompany/juego/imagenes/Vini Jr..jpg",89,"DELANTERO");this.JugadoresMercado.add(vini);
        Jugador saka = new Jugador("Saka",1900000,"/com/mycompany/juego/imagenes/Saka.jpg",88,"DELANTERO");this.JugadoresMercado.add(saka);
        Jugador kvaratskhelia = new Jugador("Kvaratskhelia",1600000,"/com/mycompany/juego/imagenes/Kvaratskhelia.jpg",87,"DELANTERO");this.JugadoresMercado.add(kvaratskhelia);
        Jugador yamal = new Jugador("Lamine Yamal",2300000,"/com/mycompany/juego/imagenes/Lamine Yamal.jpg",89,"DELANTERO");this.JugadoresMercado.add(yamal);
        Jugador doue = new Jugador("doue",4000000,"/com/mycompany/juego/imagenes/Doué.jpg",89,"DELANTERO");this.JugadoresMercado.add(doue);
        Jugador tung = new Jugador("Tung",7000000,"/com/mycompany/juego/imagenes/Tung Tung Tung Sahur.jpg",97,"DELANTERO");this.JugadoresMercado.add(tung);
        
    }
}
