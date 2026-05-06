package com.mycompany.juego;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Bilsox
 */
public class Equipo {
    private String nombre;
    private boolean completo = false;
    protected int dinero = 50000000;
    ArrayList<Jugador> jugadoresEquipo = new ArrayList <>();
    ArrayList<JButton> botones;
    Jugador jugadorSeleccionado = null;
    HashMap<String,Jugador> titulares = new HashMap<>();
    
    public Equipo(ArrayList<JButton> botones) {
        this.botones = botones;
        titulares.put("PORTERO",null);
        titulares.put("DEFENSA1",null);
        titulares.put("DEFENSA2",null);
        titulares.put("DELANTERO1",null);
        titulares.put("DELANTERO2",null);
    }
    
    public String agregarJugadores(Jugador j, ventanaMercado mercado,JButton boton,JPanel panel){
        if (!isCompleto()){
            if (j.isComprado()){
                JOptionPane.showMessageDialog(mercado, j.getNombre() + " no esta disponible");
                return String.valueOf(dinero);
            } else {
                if (dinero >= j.getPrecio()){
                    this.jugadoresEquipo.add(j);
                    j.setComprado(true);
                    dinero -= j.getPrecio();
                    boton.setIcon(null);
                    boton.setText("COMPRADO");
                    
                    for(JButton b : botones){
                        if (b.getIcon() == null){
                            b.setIcon(new ImageIcon(getClass().getResource(j.getImagen())));
                            b.addActionListener(e -> {this.jugadorSeleccionado = j;});
                            b.setText("");
                            b.revalidate();
                            b.repaint();
                            break;
                        }
                    }
                    setCompleto();
                    return String.valueOf(dinero);
                }
                else{
                    JOptionPane.showMessageDialog(mercado, "Dinero insuficiente");
                    return String.valueOf(dinero);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(mercado, "Tu equipo ya esta completo");
            return String.valueOf(dinero);
        }   
    }
    
    public boolean isCompleto(){
        return completo;
    }
    public void setCompleto(){
        if (jugadoresEquipo.size() == 15){
            completo = true;
        }
        else {
            completo = false;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public int getDinero() {
        return dinero;
    }
    
    public void ponerTitular(String posicion,JLabel jugadorTitular){
        titulares.replace(posicion,this.jugadorSeleccionado);
        jugadorTitular.setIcon(new ImageIcon(getClass().getResource(this.jugadorSeleccionado.getImagen())));
        jugadorSeleccionado = null;
        System.out.println(titulares);
    }
}
