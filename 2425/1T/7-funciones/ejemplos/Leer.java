package ejemplos;

import java.util.Scanner;

public class Leer {
    static String leer(String mensaje){
        Scanner console = new Scanner(System.in);

        System.out.print(mensaje);
        String texto = console.nextLine();

        return texto;
    }

    public static void main(String[] args) {
        String texto = leer("Introduce algo: ");
        System.out.println(texto);

        int numero = Integer.parseInt(leer("Introduce un numero: "));
        System.out.println(numero);

        
    }
}
