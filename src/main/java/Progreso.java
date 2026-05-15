package com.mycompany.juego;

import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Fabian
 */
public class Progreso {

    private static final String ARCHIVO = "progreso_juego.dat";

    static class Datos implements Serializable {
        int dinero;
        ArrayList<String> jugadoresComprados = new ArrayList<>();
        HashMap<String, String> titulares = new HashMap<>();
    }

    public static void guardar(Mercado mercado, Equipo equipo) {
        try {
            Datos datos = new Datos();

            datos.dinero = equipo.dinero;

            for (Jugador j : equipo.jugadoresEquipo) {
                datos.jugadoresComprados.add(j.getNombre());
            }

            for (String posicion : equipo.titulares.keySet()) {
                Jugador j = equipo.titulares.get(posicion);

                if (j != null) {
                    datos.titulares.put(posicion, j.getNombre());
                }
            }

            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ARCHIVO));
            salida.writeObject(datos);
            salida.close();

        } catch (Exception e) {
            System.out.println("Error al guardar progreso: " + e.getMessage());
        }
    }

    public static void cargar(Mercado mercado, Equipo equipo) {
        File archivo = new File(ARCHIVO);

        if (!archivo.exists()) {
            return;
        }

        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ARCHIVO));
            Datos datos = (Datos) entrada.readObject();
            entrada.close();

            equipo.setDinero(datos.dinero);

            for (Jugador j : mercado.JugadoresMercado) {

                if (datos.jugadoresComprados.contains(j.getNombre())) {
                    j.setComprado(true);
                    equipo.jugadoresEquipo.add(j);

                    for (JButton b : equipo.botones) {
                        if (b.getIcon() == null) {
                            b.setIcon(new ImageIcon(Progreso.class.getResource(j.getImagen())));
                            b.setText("");
                            b.putClientProperty("jugador", j);

                            b.addActionListener(e -> {
                                equipo.jugadorSeleccionado = j;
                            });

                            break;
                        }
                    }
                }

                for (String posicion : datos.titulares.keySet()) {
                    String nombreJugador = datos.titulares.get(posicion);

                    if (j.getNombre().equals(nombreJugador)) {
                        j.setTitular(true);
                        j.setLugar(posicion);
                        equipo.titulares.replace(posicion, j);
                    }
                }
            }

            equipo.setCompleto();

        } catch (Exception e) {
            System.out.println("Error al cargar progreso: " + e.getMessage());
        }
    }
}