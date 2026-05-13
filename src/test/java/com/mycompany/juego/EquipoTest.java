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

        assertEquals(50000000, equipo.getDinero());
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
            Jugador jugador = new Jugador("Jugador " + i, 1000, "/imagenes/default.png", 80, "BANCA");
            jugador.setLugar("BANCA");

            equipo.jugadoresEquipo.add(jugador);
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

        Jugador portero = new Jugador("Portero", 1000, "/imagenes/default.png", 80, "PORTERO");
        portero.setLugar("PORTERO");

        Jugador defensa1 = new Jugador("Defensa 1", 1000, "/imagenes/default.png", 70, "DEFENSA1");
        defensa1.setLugar("DEFENSA1");

        Jugador defensa2 = new Jugador("Defensa 2", 1000, "/imagenes/default.png", 75, "DEFENSA2");
        defensa2.setLugar("DEFENSA2");

        Jugador delantero1 = new Jugador("Delantero 1", 1000, "/imagenes/default.png", 90, "DELANTERO1");
        delantero1.setLugar("DELANTERO1");

        Jugador delantero2 = new Jugador("Delantero 2", 1000, "/imagenes/default.png", 85, "DELANTERO2");
        delantero2.setLugar("DELANTERO2");

        equipo.titulares.replace("PORTERO", portero);
        equipo.titulares.replace("DEFENSA1", defensa1);
        equipo.titulares.replace("DEFENSA2", defensa2);
        equipo.titulares.replace("DELANTERO1", delantero1);
        equipo.titulares.replace("DELANTERO2", delantero2);

        assertEquals(16, equipo.calcularMedia());
    }
}