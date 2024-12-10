public class Factorial {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        // int numero = 4; // Resultado debe ser 24

        // TODO Lógica de factorial: !4 = 4*3*2*1 = 24
        int factorial = 1;
        for(int i = 2; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        factorial = 1;
        for(int i = numero; i >= 2; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}