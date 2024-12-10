package ejercicios;

public class Operadores {
    static int sumar(int a, int b){
        return a + b;
    }
    static int restar(int a, int b){
        return a - b;
    }
    static int multiplicar(int a, int b){
        return a * b;
    }
    static int dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        System.err.println(sumar(3, 4));
        System.err.println(restar(3, 4));
        System.err.println(multiplicar(3, 4));
        System.err.println(dividir(3, 4));
    }   
}
