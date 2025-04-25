package juego;

public class Tablero {
    Carta[] cartasJugador1;
    Carta[] cartasJugador2;

    public Tablero(){
        this.cartasJugador1 = new Carta[5];
        this.cartasJugador2 = new Carta[5];
    }

    private void addCartaJugador(Carta[] cartasJugador, Carta carta){
        for (int i = 0; i < cartasJugador.length; i++) {
            if(cartasJugador[i] == null){
                cartasJugador[i] = carta;
                return;
            }
        }
        System.out.println("Error, no quedan huecos en el tablero");
    }

    public void addCartaJugador1(Carta carta){
        addCartaJugador(cartasJugador1, carta);
    }

    public void addCartaJugador2(Carta carta){
        addCartaJugador(cartasJugador2, carta);
    }

    public String tableroJugador(Carta[] cartasJugador, int numeroJugador){
        StringBuilder sb = new StringBuilder();

        sb.append("Jugador "+numeroJugador+":\n");
        sb.append("-------------------------------------------------------------\n");
        sb.append("Deck | Cementerio |       Zona de Monstruos (Jugador 2)       \n");
        sb.append("-------------------------------------------------------------\n");
        sb.append(" [D] |     [C]    | ");
        for (Carta carta : cartasJugador) {
            if (carta != null) {
                if (carta.isOculto()) {
                    sb.append("[#] ");
                } else {
                    sb.append("[").append(carta.getNombre()).append(" (").append(carta.getPosicion()).append(")] ");
                }
            } else {
                sb.append("[ ] ");
            }
        }
        sb.append("\n");
        sb.append("-------------------------------------------------------------\n\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tableroJugador(cartasJugador2, 2));
        sb.append(tableroJugador(cartasJugador1, 1));
        return sb.toString();
    }
    
}
