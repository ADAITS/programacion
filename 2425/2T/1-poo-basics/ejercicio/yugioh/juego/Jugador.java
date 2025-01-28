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
        robarCartas(5);
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

    public void robarCartas(int num) {
        for (int i = 0; i < num; i++) {
            robarCarta();
        }
    }

    public Carta jugarCarta() {
        // 1 Seleccion de carta
        if(this.mano.size() == 0) {
            System.out.println("Mano vacía, tienes que robar antes");
            return null;
        }
        Carta carta = this.mano.remove((int)(Math.random()*this.mano.size()));
        // Seleccionar la posición
        String posicion = Math.random() < 0.5 ? "ataque" : "defensa";
        carta.colocar(posicion);
        return carta;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mano=" + mano + ", baraja=" + baraja.size()
                + "]";
    }

}
