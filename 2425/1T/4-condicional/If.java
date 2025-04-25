public class If {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a > b) {
            System.out.println("A ("+ a+") es mayor que B ("+ b + ")");
        } else if(a < b) {
            System.out.println("B ("+ b+") es mayor que A ("+ a + ")");
        }else { // a == b
            System.out.println("A ("+ a+") y B ("+ b+") son iguales ");
        }
        
        System.out.println("##Se imprime siempre");
    }
}