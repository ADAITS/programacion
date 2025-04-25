public class Validation {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("No se han introducido argumentos necesarios");
            return;
        }

        String arg1 = args[0];
        String arg2 = args[1];
        System.out.println("Se ha introducido: " + arg1);
        System.out.println("Se ha introducido: " + arg2);

    }
}