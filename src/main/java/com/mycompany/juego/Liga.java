package com.mycompany.juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yisus
 */
public class Liga {
    ArrayList<Equipo> equiposJugando = new ArrayList<>();
    ArrayList<Equipo> equiposTotal = new ArrayList<>();
    ArrayList<Partido> totalPartidos = new ArrayList<>();
    
    boolean temporadaTerminada;
    Equipo equipo;
    
    
    public Liga(Equipo equipo) {
        this.equipo = equipo;
        equipo.setJugandoLiga(true);
        
        generarLiga();
        
    }
    public void jugarPartido(ventanaLiga vL){

        if (temporadaTerminada) {
            if (equiposJugando.get(0) == equipo){
                equipo.dinero += ((equipo.goles*50000)  + 200000);
                JOptionPane.showMessageDialog(vL, "Ganaste la liga y recibiste: " + ((equipo.goles*50000)  + 200000));
            }
            else{
                equipo.dinero += equipo.goles*50000;
                JOptionPane.showMessageDialog(vL, "No ganaste la liga y recibiste: " + equipo.goles*50000);
            }
            generarLiga();
            equipo.goles = 0;
            equipo.golesEnContra = 0;
            equipo.puntos = 0;
            temporadaTerminada = false;
            vL.actualizarTabla();
            return;
        }

        int partidosJugados = 0;
        boolean jugadorYaJugo = false;

        HashSet<String> usados = new HashSet<>();
        ArrayList<Partido> jugados = new ArrayList<>();

        Collections.shuffle(totalPartidos);

        for (Partido partido : totalPartidos) {

            if (partidosJugados == 3) break;

            String local = partido.local.getNombre();
            String visitante = partido.visitante.getNombre();

            if (!usados.contains(local) && !usados.contains(visitante)) {

                if (local.equals(equipo.getNombre()) || visitante.equals(equipo.getNombre())) {
                    partido.jugarPartido(vL);
                    jugadorYaJugo = true;
                } 
                else {
                    partido.simularPartido();
                }

                usados.add(local);
                usados.add(visitante);
                jugados.add(partido);
                partidosJugados++;
            }
        }
        if (!jugadorYaJugo) {
            for (Partido partido : totalPartidos) {
                String local = partido.local.getNombre();
                String visitante = partido.visitante.getNombre();

                if (local.equals(equipo.getNombre()) || visitante.equals(equipo.getNombre())) {
                    partido.jugarPartido(vL);
                    jugados.add(partido);
                    break;
                }
            }
        }
        totalPartidos.removeAll(jugados);


        if (totalPartidos.size() <= 3 && !totalPartidos.isEmpty()) {

            for (Partido partido : totalPartidos) {
                String local = partido.local.getNombre();
                String visitante = partido.visitante.getNombre();

                if (local.equals(equipo.getNombre()) || visitante.equals(equipo.getNombre())) {
                    partido.jugarPartido(vL);
                } else {
                    partido.simularPartido();
                }
            }

            totalPartidos.clear(); 
        }

        if (totalPartidos.isEmpty()) {
            temporadaTerminada = true;
            JOptionPane.showMessageDialog(vL, "Temporada terminada");
        }
    }
    
    public ArrayList<Equipo> getEquiposJugando(){
        return equiposJugando;
    }
    
    private void generarLiga(){
        totalPartidos.clear();
        equiposJugando.clear();
        equiposTotal.clear();
        
        Equipo barcelona = new Equipo("Barcelona",85,true);
        Equipo madrid = new Equipo("Real Madrid",85,true);
        Equipo psg = new Equipo("PSG",85,true);
        Equipo bayern = new Equipo("Bayern Munchen",84,true);
        Equipo city = new Equipo("Manchester City",84,true);
        Equipo america = new Equipo("America",73,true);
        Equipo chivas = new Equipo("Chivas",70,true);
        Equipo pumas = new Equipo("Pumas",70,true);
        Equipo tigres = new Equipo("Tigres",70,true);
        Equipo toluca = new Equipo("Toluca",71,true);
        equiposTotal.add(barcelona);
        equiposTotal.add(madrid);
        equiposTotal.add(psg);
        equiposTotal.add(bayern);
        equiposTotal.add(city);
        equiposTotal.add(america);
        equiposTotal.add(chivas);
        equiposTotal.add(pumas);
        equiposTotal.add(tigres);
        equiposTotal.add(toluca);
        
        Random random = new Random();
        for (int i = 1; i <= 5; i++){
            int b = random.nextInt(equiposTotal.size());
            equiposJugando.add(equiposTotal.get(b));
            equiposTotal.remove(b);
        }
        equiposJugando.add(equipo);
        
        for (int i = 0; i < equiposJugando.size(); i++) {
            for (int j = i + 1; j < equiposJugando.size(); j++) {
                totalPartidos.add(new Partido(equiposJugando.get(i), equiposJugando.get(j)));
            }
        }
        for (Equipo equipos : equiposJugando) {
            equipos.goles = 0;
            equipos.puntos = 0;
            equipos.partidosJugados = 0;
        }
    }
}
