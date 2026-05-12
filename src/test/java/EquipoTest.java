package com.mycompany.juego;

import java.util.ArrayList;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipoTest {

    @Test
    public void testDineroInicial() {
        ArrayList<JButton> botones = new ArrayList<>();
        Equipo equipo = new Equipo(botones);

        assertEquals(5000000, equipo.getDinero());
    }

    @Test
    public void testEquipoIniciaIncompleto() {
        ArrayList<JButton> botones = new ArrayList<>();
        Equipo equipo = new Equipo(botones);

        assertFalse(equipo.isCompleto());
    }

    @Test
    public void testEquipoCompletoCon15Jugadores() {
        ArrayList<JButton> botones = new ArrayList<>();
        Equipo equipo = new Equipo(botones);

        for (int i = 0; i < 15; i++) {
            equipo.jugadoresEquipo.add(
                new Jugador("Jugador " + i, 1000, "/imagenes/default.png", 80)
            );
        }

        equipo.setCompleto();

        assertTrue(equipo.isCompleto());
    }

    @Test
    public void testCalcularMediaEquipoBot() {
        Equipo equipoBot = new Equipo("Bot", 75, true);

        assertEquals(75, equipoBot.calcularMedia());
    }

    @Test
    public void testCalcularMediaEquipoUsuario() {
        ArrayList<JButton> botones = new ArrayList<>();
        Equipo equipo = new Equipo(botones);

        equipo.titulares.replace("PORTERO", new Jugador("Portero", 1000, "/imagenes/default.png", 80));
        equipo.titulares.replace("DEFENSA1", new Jugador("Defensa 1", 1000, "/imagenes/default.png", 70));
        equipo.titulares.replace("DEFENSA2", new Jugador("Defensa 2", 1000, "/imagenes/default.png", 75));
        equipo.titulares.replace("DELANTERO1", new Jugador("Delantero 1", 1000, "/imagenes/default.png", 90));
        equipo.titulares.replace("DELANTERO2", new Jugador("Delantero 2", 1000, "/imagenes/default.png", 85));

        assertEquals(80, equipo.calcularMedia());
    }
}