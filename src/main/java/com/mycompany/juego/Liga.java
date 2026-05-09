/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author yisus
 */
public class Liga {
    HashMap<String,Partido> partidosLiga = new HashMap<>();
    ArrayList<Partido> totalPartidos = new ArrayList<>();
    private int contadorPartidos = 0;
    Equipo equipo;
    ArrayList<Equipo> equiposJugando = new ArrayList<>();
    
    public Liga(Equipo equipo) {
        this.equipo = equipo;
        partidosLiga.put("PARTIDO1",null);
        partidosLiga.put("PARTIDO2",null);
        partidosLiga.put("PARTIDO3",null);
        partidosLiga.put("PARTIDO4",null);
        partidosLiga.put("PARTIDO5",null);
        
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

        totalPartidos.add(new Partido(barcelona,equipo));
        totalPartidos.add(new Partido(madrid,equipo));
        totalPartidos.add(new Partido(psg,equipo));
        totalPartidos.add(new Partido(city,equipo));
        totalPartidos.add(new Partido(bayern,equipo));
        totalPartidos.add(new Partido(america,equipo));
        totalPartidos.add(new Partido(chivas,equipo));
        totalPartidos.add(new Partido(pumas,equipo));
        totalPartidos.add(new Partido(tigres,equipo));
        totalPartidos.add(new Partido(toluca,equipo));
        
        Random random = new Random();
        for (int i = 1; i <= 5; i++){
            int b = random.nextInt(totalPartidos.size());
            Partido partido = totalPartidos.get(b);
            for(String clave : partidosLiga.keySet()){
                if(partidosLiga.get(clave) == null){
                    partidosLiga.replace(clave, partido);
                    equiposJugando.add(partido.bot);
                    break;
                }
            }
            totalPartidos.remove(b);
        }
        equiposJugando.add(equipo);
    }
    public void jugarPartido(){
        if (contadorPartidos == 0){
            (partidosLiga.get("PARTIDO1")).jugarPartido();
            contadorPartidos ++;
        }
        else if (contadorPartidos == 1){
            (partidosLiga.get("PARTIDO2")).jugarPartido();
            contadorPartidos ++;
        }
        else if (contadorPartidos == 2){
            (partidosLiga.get("PARTIDO3")).jugarPartido();
            contadorPartidos ++;
        }
        else if (contadorPartidos == 3){
            (partidosLiga.get("PARTIDO4")).jugarPartido();
            contadorPartidos ++;
        }
        else if (contadorPartidos == 4){
            (partidosLiga.get("PARTIDO5")).jugarPartido();
            contadorPartidos = 0;
        }
    }
    public HashMap<String,Partido> getPartidos(){
        return partidosLiga;
    }
    public ArrayList<Equipo> getEquiposJugando(){
        return equiposJugando;
    }
}
