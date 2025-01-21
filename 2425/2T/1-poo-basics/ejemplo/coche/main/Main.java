package main;

import clases.Coche;
import clases.Garaje;

public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("1234FJG", "Reanult", "Clio", 60, 60, 10);
        // System.out.println(c);
        // c.hacerKm(750);
        // System.out.println(c);
        // c.llenarDeposito();
        // System.out.println(c);

        // c.hacerKm(500);
        // System.out.println(c);

        // c.hacerKm(500);
        // System.out.println(c);
        // c.hacerKm(1);
        // System.out.println(c);

        Coche coche = new Coche("1234FJG", "Tesla", "Model2", 60, 60, 10);
        Coche[] coches = { coche, c };
        Garaje garaje = new Garaje(coches);
        Coche cocherecogido = garaje.sacarCoche(1);
        cocherecogido.hacerKm(100);
        System.out.println(cocherecogido);

    }
}
