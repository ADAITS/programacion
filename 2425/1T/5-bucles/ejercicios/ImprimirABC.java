public class ImprimirABC {
    public static void main(String[] args){


        for(char letra = 'A'; letra <= 'z'; letra++) {
            if( letra <= 'Z' || letra >= 'a' ) {
                System.out.print(letra);
            }
        }

        // for(char letra = 'A'; letra <= 'Z'; letra++) {
        //     System.out.print(letra);
        //     System.out.println((char)(letra+('a' - 'A')));
        // }

    }
}