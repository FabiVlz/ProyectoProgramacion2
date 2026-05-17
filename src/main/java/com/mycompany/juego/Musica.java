package com.mycompany.juego;

import java.io.BufferedInputStream;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
/**
 *
 * @author Bilsox
 */
public class Musica {

    private static Clip clip;
    private static Random random = new Random();

    private static String[] canciones = {
        "/musica/Canción de FIFA 22 Mobile ⧸ FIFA 22.wav",
        "/musica/John Newman - Love Me Again (Lyrics).wav",
    };

    public static void reproducirAleatoria() {
        try {
            detenerMusica();

            int indice = random.nextInt(canciones.length);
            String ruta = canciones[indice];

            AudioInputStream audio = AudioSystem.getAudioInputStream(
                new BufferedInputStream(
                    Musica.class.getResourceAsStream(ruta)
                )
            );

            clip = AudioSystem.getClip();
            clip.open(audio);

            clip.addLineListener(evento -> {
                if (evento.getType() == LineEvent.Type.STOP) {
                    if (clip.getMicrosecondPosition() >= clip.getMicrosecondLength()) {
                        reproducirAleatoria();
                    }
                }
            });

            clip.start();

        } catch (Exception e) {
            System.out.println("Error al reproducir música: " + e.getMessage());
        }
    }

    public static void detenerMusica() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}