public class Logicos {
    public static void main(String[] args){
        boolean negacion = !true; // false
        boolean and = true && true; // true
        boolean or = false || false; // false

        int numero = 0;
        boolean resultado = 1 != 1 && numero == 0; // 
        System.out.println("resultado: " + resultado);
        System.out.println("numero: " + numero);

        numero = 0;
        resultado = 1 == 1 || numero++ == 1; // 
        System.out.println("resultado: " + resultado);
        System.out.println("numero: " + numero);
    }
}