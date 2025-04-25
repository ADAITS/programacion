public class Argumentos {
    public static void main(String[] args){
        /**
         * - 1 Arg: Lo imprima 3 veces seguidas en la misma linea
         * - 2 Arg: Duplicar su valor
         * - 3 y 4 Arg: Se impriman separados por un guión
         * - 5 Arg: Elevar al cubo
         * - 6 Arg: Imprimir el primer caracter del argumento
         * - 7 Arg: Imprimir una linea vacía, luego un tabulador y luego el argumento
         */
        // Argumento 1
        System.out.println(args[0] + " " + args[0] + " " + args[0]);
        // Argumento 2
        System.out.println(Float.parseFloat(args[1]) * 2);
        // Argumento 3
        System.out.println(args[2] + "-" + args[3]);
        // Argumento 4
        int cubo = Integer.parseInt(args[4]);
        System.out.println(cubo * cubo * cubo);

    }
}