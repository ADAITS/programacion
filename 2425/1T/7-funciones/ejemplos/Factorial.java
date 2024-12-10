package ejemplos;

public class Factorial {
    static int calcularFactorial(int numero) {
        if(numero == 1) { // Condicion para parar
            return numero; // Valor de partida
        }
        
        return numero * calcularFactorial(numero-1); // N = N * !(N-1)
    }

    public static void main(String[] args) {
        System.out.println(calcularFactorial(Integer.parseInt(args[0]))); // 720
    }
}
