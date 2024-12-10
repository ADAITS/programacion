public class VerticalIsosceles {
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);

        int cont = 1;
        int incremento = 1;
        while(cont > 0){
            for(int i = 1; i <= cont; i++){
                System.out.print(i);
            }
            System.out.println();
            if(cont == N){
                incremento = -incremento;
            }
            cont += incremento;
        }
    }
}