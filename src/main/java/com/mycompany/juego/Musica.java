package com.mycompany.juego;

import java.io.BufferedInputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Bilsox
 */
public class Musica {

    private static Clip clip;

    public static void reproducirMusica(String ruta) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(
                new BufferedInputStream(
                    Musica.class.getResourceAsStream(ruta)
                )
            );

            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

        } catch (Exception e) {
            System.out.println("Error al reproducir música: " + e.getMessage());
        }
    }

    public static void detenerMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}