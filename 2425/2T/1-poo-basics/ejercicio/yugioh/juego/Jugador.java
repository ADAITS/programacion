package juego;

import java.util.Arrays;
import java.util.ArrayList;

public class Jugador {
    String nombre;
    ArrayList<Carta> mano;
    ArrayList<Carta> baraja;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.mano = new ArrayList<Carta>(7);
        this.baraja = new ArrayList<Carta>(40);
    }

    public Jugador(String nombre, ArrayList<Carta> baraja){
        this.nombre = nombre;
        this.mano = new ArrayList<Carta>(7);
        this.baraja = baraja;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void robarCarta(){
        Carta cartaRobada = this.baraja.removeFirst();
        this.mano.add(cartaRobada);
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mano=" + mano + ", baraja=" + baraja.size()
                + "]";
    }

}
