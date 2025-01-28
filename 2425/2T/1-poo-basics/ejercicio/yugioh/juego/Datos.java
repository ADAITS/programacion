package juego;

import java.util.ArrayList;

public class Datos {
    public ArrayList<Carta> crearBaraja() {
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        baraja.add(new Carta("Dragon Blanco de Ojos Azules", 3000, 2500));
        baraja.add(new Carta("Hechicera Oscura", 2000, 1700));
        baraja.add(new Carta("Guerrero Mágico de los Hierros", 1500, 1200));
        baraja.add(new Carta("Exodia el Prohibido", 1000, 1000));
        baraja.add(new Carta("Lanza Mágica", 0, 0));
        baraja.add(new Carta("Ciber Dragón", 2100, 1600));
        baraja.add(new Carta("Dragón de las Tinieblas", 2500, 2000));
        baraja.add(new Carta("Crea Aterradora", 1800, 1500));
        baraja.add(new Carta("Luz Oscura", 0, 0));
        baraja.add(new Carta("Caballero Oscuro", 2300, 1500));
        baraja.add(new Carta("Mago de la Fusión", 2500, 2100));
        baraja.add(new Carta("Dark Ruler Ha Des", 2500, 2400));
        baraja.add(new Carta("King of the Swamp", 1500, 1000));
        baraja.add(new Carta("Elemental Hero Neos", 2500, 2000));
        baraja.add(new Carta("Elemental Hero Stratos", 1800, 1600));
        baraja.add(new Carta("Elemental Hero Sparkman", 1600, 1400));
        baraja.add(new Carta("Elemental Hero Wildheart", 1500, 1600));
        baraja.add(new Carta("Elemental Hero Bladedge", 2600, 1800));
        baraja.add(new Carta("Elemental Hero Clayman", 800, 2000));
        baraja.add(new Carta("Elemental Hero Avian", 1000, 1000));
        baraja.add(new Carta("Elemental Hero Burstinatrix", 1500, 1300));
        baraja.add(new Carta("Elemental Hero Flare Neos", 2600, 2000));
        return baraja;
    }
}
