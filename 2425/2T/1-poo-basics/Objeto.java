class Jugador {
    String name;
    double[] records;
}
    
public class Objeto {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugador1.name = "Gabri";
        jugador2.name = "Israel";
        System.out.println(jugador1.name);
        System.out.println(jugador2.name);
    }
}
