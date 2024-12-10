public class TriangleAZ {
    public static void main(String[] args){
        char inicio = 'X';
        char fin = 'B';

        for(int i = 0; i <= inicio-fin; i++){
            for(char c = (char)(inicio-i); c >= fin; c--){
                System.out.print(c);   
            }
            System.out.println();
        }
    }
}