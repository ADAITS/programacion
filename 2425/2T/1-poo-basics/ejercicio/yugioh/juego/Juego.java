package juego;

public class Juego {
    Jugador jugador1;
    Jugador jugador2;
    Tablero tablero;

    public Juego() {
        jugador1 = new Jugador("Juan", new Datos().crearBaraja());
        jugador2 = new Jugador("Violeta", new Datos().crearBaraja());
        tablero = new Tablero();
        startGame();
    }

    public void atacar(Carta atacante, Carta oponente){
        atacante.atacar(oponente);
        // < 0 ?? pierde el atacante
        // > 0 ?? gana el atacante
    }

    public void startGame() {
        Carta carta;
        System.out.println("El juego va a comenzar ...");

        for (int i = 0; i < 3; i++) {   
            // Primera ronda J1
            jugador1.robarCarta();
            carta = jugador1.jugarCarta();
            tablero.addCartaJugador1(carta);
            // Primera ronda J2
            jugador2.robarCarta();
            carta = jugador2.jugarCarta();
            tablero.addCartaJugador2(carta);
        }

        System.out.println(tablero);


    }
        
}
