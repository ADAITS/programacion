public class Funciones {
    public static void print(String texto){
        System.out.println(texto);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        print("Inicio");
        int suma = sumar(3, 4);
        print("La suma es: " + suma);
        print("Fin");
    }
}
