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
    
    public Jugador(String nombre, int precio,String imagen,int media) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.media = media;
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
    public int getMedia(){
        return media;
    }
}