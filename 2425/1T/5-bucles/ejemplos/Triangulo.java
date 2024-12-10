public class Triangulo {
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);

        for(int altura = 2; altura <= N; altura++){
            for(int f = 1; f <= altura; f++){
                for(int azul = 0; azul < N - f ; azul++){
                    System.out.print(' ');
                }
                for(int verde = 0; verde < f*2-1; verde++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}