public class Switch {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        switch(n){
            case 0: // if(n == 0)
                System.out.println("cero");
                break;
            case 1: // else if(n == 1)
                System.out.println("uno");
                break;
            case 2: // else if(n == 2)
                System.out.println("dos");
                break;
            default: // else
                System.out.println("ninguno");
        }
    }
}