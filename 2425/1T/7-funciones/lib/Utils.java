package lib;

public class Utils {
    public static void print(String name){
        System.out.println("Hello "+name+"!");
    }

    public static int[] add(int[] numeros, int nuevoNumero){
        int[] nuevoArray = new int[numeros.length+1];
        for (int i = 0; i < numeros.length; i++) {
            nuevoArray[i] = numeros[i];
        }
        nuevoArray[nuevoArray.length-1] = nuevoNumero;
        return nuevoArray;
    }

    public static int[] pop(int[] numeros) {
        int[] nuevoArray = new int[numeros.length-1];
        for (int i = 0; i < nuevoArray.length; i++) {
            nuevoArray[i] = numeros[i];
        }
        return nuevoArray;
    }

    public static int[] pop(int[] numeros, int index){
        int[] nuevoArray = new int[0];

        return nuevoArray;
    }
}
