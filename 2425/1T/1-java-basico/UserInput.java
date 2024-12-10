import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Introduzca algo: ");
        int numero = console.nextInt();
        console.nextLine();
        System.out.println("El usuario ha introducido: "+ numero);

        System.out.print("Introduzca algo: ");
        int numero2 = Integer.parseInt(console.nextLine());
        System.out.println("El usuario ha introducido: "+ numero2);

        System.out.print("Introduzca otra cosa: ");
        String texto = console.nextLine();
        System.out.println("El usuario ha introducido: "+ texto);
    }
}
\n