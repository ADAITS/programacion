import java.util.Arrays;

import clases.Arma;
import clases.Distancia;
import clases.Guerrero;
import clases.Melee;
import clases.Consumible;

public class Main {
    public static void main(String[] args) {
        Distancia distancia = new Distancia("Arco");
        Melee melee = new Melee("Espada");
        Consumible consumible = new Consumible("Granada");

        Arma[] arsenal = {
            distancia,
            melee,
            consumible
        };
 
        for (Arma arma : arsenal) {
            System.out.println(arma);
            arma.usar();
        }


    }    
}
