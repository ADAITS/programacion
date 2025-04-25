import java.util.Arrays;

import clases.Arma;
import clases.Distancia;
import clases.Guerrero;
import clases.Melee;
import clases.Consumible;

public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma("Generica");
        //System.out.println(arma);
        Arma distancia = new Distancia("Arco");
        //System.out.println(distancia);
        Arma melee = new Melee("Espada");
        //System.out.println(melee);
        Arma consumible = new Consumible("Granada");
        //System.out.println(consumible);

        Arma[] arsenal = {
            arma,
            distancia,
            melee,
            consumible
        };
        // System.out.println(Arrays.toString(arsenal));

        // Guerrero guerrero = new Guerrero("Juan23", arsenal[(int)(Math.random()*arsenal.length)]);
        // guerrero.usarArma();

        Arma arco1 = new Distancia("Arco");
        Distancia arco2 = new Distancia("Arco");
        ((Distancia)arco1).disparar();
        arco2.disparar();


    }    
}
