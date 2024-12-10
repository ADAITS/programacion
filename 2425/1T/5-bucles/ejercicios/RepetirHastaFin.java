import java.util.Scanner;

public class RepetirHastaFin {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String text = console.nextLine();

        while(!text.equals("fin")){
            System.out.println("Has introducido: "+ text);

            System.out.print("Introduce un texto: ");
            text = console.nextLine();
        }


    }
}