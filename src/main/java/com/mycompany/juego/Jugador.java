package com.mycompany.juego;

/**
 *
 * @author Bilsox
 */
public class Jugador{
    private String nombre;
    private boolean comprado = false;
    private double precio;
    private String imagen;
    
    public Jugador(String nombre, double precio,String imagen) {
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

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
    public double getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }
    
}