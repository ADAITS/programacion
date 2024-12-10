package ejemplos;

public class ImprimirN {
    static void imprimirN(int inicio, int fin, int intervalo){
        for (int i = inicio; i <= fin; i+=intervalo) {
            System.out.println(i);
        }
    }

    static int sumar(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        imprimirN(79, 101, 10);
        int[] numeros = {1,2,3,4,5};
        int superSumaDeArray = sumar(numeros);
        System.out.println(superSumaDeArray);


    }
}
