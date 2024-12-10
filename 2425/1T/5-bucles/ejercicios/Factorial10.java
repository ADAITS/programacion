public class Factorial {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        // int factorial = 1;
        // for(int i = 1; i <= numero; i++) {
        //     factorial = factorial * i;
        //     System.out.println("El factorial de "+i+" es: "+factorial);
        // }

        for(int j = 1; j <= 10; j++){
            int factorial = 1;
            for(int i = 1; i <= j; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de "+j+" es: "+factorial);
        }

    }
}