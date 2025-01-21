package main;

import clases.Coche;

public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("1234FJG", "Reanult", "Clio");
        System.out.println(c);
        c.hacerKm(750);
        System.out.println(c);
        c.llenarDeposito();
        System.out.println(c);

        c.hacerKm(500);
        System.out.println(c);

        c.hacerKm(500);
        System.out.println(c);
        c.hacerKm(1);

    }
}
