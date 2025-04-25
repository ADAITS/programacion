public class SnakeAsterisk {
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);

        // for(int i = 0; i < N; i++){
        //     if(i % 2 == 0){ // es par
        //         System.out.println(" *****"); // 0
        //     } else {
        //         System.out.println("*****"); // 1
        //     }
        // }

        for(int i = 0; i < N; i++){
            String espace = i % 2 == 0 ? " " : "";
            System.out.println(espace + "*****");
        }
    }
}