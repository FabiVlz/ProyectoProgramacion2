package com.mycompany.juego;

/**
 *
 * @author Bilsox
 */
public class Jugador implements Transferible{
    private String nombre;
    private boolean comprado = false;
    private boolean titular = false;
    private int precio;
    private String imagen;
    private int media;
    private String posicion;
    private String lugar;
    
    public Jugador(String nombre, int precio,String imagen,int media,String posicion) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.media = media;
        this.posicion = posicion;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean isComprado() {
        return comprado;
    }
    public boolean isTitular() {
        return titular;
    }
    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    @Override
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
    @Override
    public int getPrecio() {
        return precio;
    }
    public String getImagen() {
        return imagen;
    }
    public void setLugar(String lugar){
        this.lugar = lugar;
    }
    public int getMedia(){
        if (posicion.equals("PORTERO")){
            if (lugar.equals("PORTERO")){
                return media;
            }
            else {
                return (int)(media*0.65);
            }
        }
        else if (posicion.equals("DEFENSA")){
            if (lugar.equals("DEFENSA1") || lugar.equals("DEFENSA2")){
                return media;
            }
            else {
                return (int)(media*0.65);
            }
        }
        else if (posicion.equals("MEDIO")){
            if (lugar.equals("DEFENSA1") || lugar.equals("DEFENSA2")){
                return media;
            }
            else {
                return (int)(media*0.65);
            }
        }
        else if (posicion.equals("DELANTERO")){
            if (lugar.equals("DELANTERO1") || lugar.equals("DELANTERO2")){
                return media;
            }
            else {
                return (int)(media*0.65);
            }
        }
        return 0;
    }
}