package com.mycompany.juego;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Jesus Fabian Valenzuela
 */
public class SistemaFacade {

    private Equipo equipo;

    public SistemaFacade(Equipo equipo){
        this.equipo = equipo;
    }

    public String comprarJugador(
            Jugador jugador,
            ventanaMercado mercado,
            JButton boton,
            JPanel panel
    ){
        return equipo.agregarJugadores(jugador, mercado, boton, panel);
    }

    public void ponerTitular(
            String posicion,
            JLabel jugadorTitular,
            ventanaPlantilla ventana,
            JLabel textoMedia
    ){
        equipo.ponerTitular(posicion, jugadorTitular, ventana, textoMedia);
    }

    public void venderJugador(ventanaPlantilla ventana){
        equipo.venderJugador(ventana);
    }
}