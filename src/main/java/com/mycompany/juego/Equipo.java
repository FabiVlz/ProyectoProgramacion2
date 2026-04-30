package com.mycompany.juego;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Bilsox
 */
public class Equipo {
    private String nombre;
    protected double dinero = 50000000;
    ArrayList<Jugador> jugadoresEquipo = new ArrayList <>();
    ArrayList<JButton> botones;

    public Equipo(ArrayList<JButton> botones) {
        this.botones = botones;
    }
    
    public String agregarJugadores(Jugador j, ventanaMercado mercado){
        if (j.isComprado()){
            JOptionPane.showMessageDialog(mercado, "Este jugador no esta disponible");
            return String.valueOf(dinero);
        } else {
            if (dinero >= j.getPrecio()){
                this.jugadoresEquipo.add(j);
                j.setComprado(true);
                dinero -= j.getPrecio();
                
                for(JButton b : botones){
                    if (b.getIcon() == null){
                        b.setIcon(new ImageIcon(getClass().getResource(j.getImagen())));
                        b.setText("");
                        b.revalidate();
                        b.repaint();
                        break;
                    }
                }
                return String.valueOf(dinero);
            }
            else{
                JOptionPane.showMessageDialog(mercado, "Dinero insuficiente");
                return String.valueOf(dinero);
            }
        }
    }
    public String getNombre() {
        return nombre;
    }
    public double getDinero() {
        return dinero;
    }
}
