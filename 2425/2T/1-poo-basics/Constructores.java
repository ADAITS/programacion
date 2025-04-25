import java.util.Arrays;

class Jugador {
    String name;
    int age;
    double height;
    String category;
    double[] records;

    public Jugador(){
        this("unknown");
    }

    public Jugador(String name){
        this(name, 0, 0, null);
    }
    
    public Jugador(String name, int age, double height, String category){
        System.out.println("Todo");
        this.name = name;
        this.age = age;
        this.height = height;
        this.category = category;
        this.records = new double[3];
    }
}
    
public class Constructores {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        //Jugador jugador2 = new Jugador("Israel", 40, 1.40, "Senior");
        printJugador(jugador1);
    }

    public static void printJugador(Jugador jugador){
        System.out.println(jugador.name);
        System.out.println(jugador.age);
        System.out.println(jugador.height);
        System.out.println(jugador.category);
        System.out.println(Arrays.toString(jugador.records));
    }
}
