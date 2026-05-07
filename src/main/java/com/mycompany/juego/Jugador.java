package com.mycompany.juego;

/**
 *
 * @author Bilsox
 */
public class Jugador{
    private String nombre;
    private boolean comprado = false;
    private boolean titular = false;
    private int precio;
    private String imagen;
    
    public Jugador(String nombre, int precio,String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isComprado() {
        return comprado;
    }
    public boolean isTitular() {
        return titular;
    }
    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
    public int getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }
    
}