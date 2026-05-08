package com.mycompany.juego;
import java.awt.event.ActionListener;
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
    private boolean listo = false;
    protected int dinero = 50000000;
    private int media; 
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
                            b.putClientProperty("jugador",j);
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
    public void ponerTitular(String posicion,JLabel jugadorTitular,ventanaPlantilla vP,JLabel textoMedia){
        if (jugadorSeleccionado == null){
            JOptionPane.showMessageDialog(vP, "Seleccione un jugador");
        }
        else{
            if (jugadorSeleccionado.isTitular()){
                JOptionPane.showMessageDialog(vP, "Este Jugador ya esta en tu equipo");
                jugadorSeleccionado = null;
            }
            else{
                if (jugadorTitular.getIcon() == null){
                    titulares.replace(posicion,jugadorSeleccionado);
                    jugadorTitular.setIcon(new ImageIcon(getClass().getResource(jugadorSeleccionado.getImagen())));
                    jugadorSeleccionado.setTitular(true);
                    jugadorSeleccionado = null;
                    textoMedia.setText(String.valueOf(calcularMedia()));
                    System.out.println(titulares);
                }
                else {
                    JOptionPane.showMessageDialog(vP, "Ya hay un jugador en este lugar");
                    jugadorSeleccionado = null;
                    ventanaQuitarTitular vQT = new ventanaQuitarTitular(posicion,jugadorTitular,titulares,vP,textoMedia,this);
                    vQT.setVisible(true);
                }
            }
        }
    }
    public void venderJugador(ventanaPlantilla vP){
        int c = 1;
        if (jugadorSeleccionado == null){
            JOptionPane.showMessageDialog(vP, "Seleccione un jugador");
        }
        else{
            if (jugadorSeleccionado.isTitular()){
                JOptionPane.showMessageDialog(vP, "Este Jugador es titular, primero quitalo");
                jugadorSeleccionado = null;
            }
            else{
                for(JButton b : botones){
                    Object jugadorBuscado = b.getClientProperty("jugador");
                    
                    if (( jugadorBuscado != null && ((Jugador)jugadorBuscado).getNombre().equals(jugadorSeleccionado.getNombre()))){
                        b.setIcon(null);
                        for (ActionListener aC : b.getActionListeners()){
                            b.removeActionListener(aC);
                        }
                        b.addActionListener(null);
                        b.setText("VACIO");
                        jugadorSeleccionado.setComprado(false);
                        jugadoresEquipo.remove(jugadorSeleccionado);
                        dinero += (jugadorSeleccionado.getPrecio()*0.65);
                        jugadorSeleccionado = null;
                        b.putClientProperty("jugador",null);
                        b.revalidate();
                        b.repaint();
                        break;
                    }
                    else{
                        System.out.println(b.getIcon());
                        System.out.println(c + "No encontrado");
                    }
                    c++;
                }
            }
        }
    }
    public void setListo(){
        listo = titulares.get("DELANTERO1") != null && titulares.get("DELANTERO2") != null && titulares.get("DEFENSA1") != null && titulares.get("DEFENSA2") != null && titulares.get("PORTERO") != null;
    }
    public boolean isListo(){
        return listo;
    }
    public int calcularMedia(){
        int contador = 0;
        for (String clave : titulares.keySet()){
            if (titulares.get(clave) != null){
                contador += titulares.get(clave).getMedia();
            }
            else{
                contador += 0;
            }
        }
        return (contador/5);
    }
}
