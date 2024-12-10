public class Triangle {
    public static void main(String[] args){
        if(args.length < 2) return;
        int option = Integer.parseInt(args[0]);
        int size = Integer.parseInt(args[1]);

        if(option == 1){
            /* Exercise 1 */
            for(int i = 1; i <= size; i++){
                System.out.println(i);
            }
        } else if(option == 2){
            /* Exercise 2 */
            for(int j = 1; j <= size; j++){
                for(int i = 1; i <= size; i++){
                    System.out.print(i);
                }
                System.out.println();
            }
        } else if(option == 3){
            /* Exercise 3 */
            for(int j = 1; j <= size; j++){
                for(int i = 1; i <= size; i++){
                    System.out.print(j);
                }
                System.out.println();
            }
        } else if(option == 4){


            /* Exercise 4 */
            for(int j = 1; j <= size; j++){
                for(int i = 1; i <= j; i++){
                    System.out.print(j);
                }
                System.out.println();
            }
        } else if(option == 5){
            /* Exercise 5 */
            for(int j = 1; j <= size; j++){
                for(int i = 1; i <= j; i++){
                    System.out.print('*');
                }
                System.out.println();
            }
        } else if(option == 6){
            /* Exercise 6 */
            for(int j = 1; j <= size; j++){
                for(int i = 1; i <= (size+1)-j; i++){
                    System.out.print('*');
                }
                System.out.println();
            }
            /* ------ */
            for(int j = size; j >= 1; j--){
                for(int i = 1; i <= j; i++){
                    System.out.print('*');
                }
                System.out.println();
            }
        } else if(option == 7){
            /* Exercise 7 */
            for(int f = 1; f <= N; f++){
                for(int n = 1; n <= f-1; n++){
                    System.out.print(' ');
                }
                for(int n = 1; n <= N+1-f; n++){
                    System.out.print('*');
                }
                System.out.println();
            } 
        } else if(option == 8){
            /* Exercise 8 */
            for(int f = 1; f <= N; f++){ // 1 al 4
                for(int azul = 0; azul < N - f; azul++){
                    System.out.print(' ');
                }
                for(int verde = 0; verde < f-1; verde++){
                    System.out.print('*');
                }
                for(int rojo = 0; rojo < f; rojo++){
                    System.out.print('*');
                }
                System.out.println();
            }
        } else if(option == 9){
            /* Exercise 9 */
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
}