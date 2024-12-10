public class ReducirCodigo {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(n); // 1
        n = n + 1;
        System.out.print(n); // 2
        n++; 
        System.out.print(n); // 3
        n += 1;  
        System.out.print(n); // 4

        System.out.println();

        n = 1;
        while(n <= 4){
            System.out.print(n);
            n++; 
        }
        System.out.println();

        for(n = 1; n <= 4; n++){
            System.out.print(n);    
        }
    }
}