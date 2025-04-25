package lib;

public class Utils {
    public static void print(String name){
        System.out.println("Hello "+name+"!");
    }

    // public static int[] add(int[] numeros, int nuevoNumero){
    //     int[] nuevoArray = new int[numeros.length+1];
    //     for (int i = 0; i < numeros.length; i++) {
    //         nuevoArray[i] = numeros[i];
    //     }
    //     nuevoArray[nuevoArray.length-1] = nuevoNumero;
    //     return nuevoArray;
    // }

    // public static int[] add(int nuevoNumero, int[] numeros){
    //     int[] nuevoArray = new int[numeros.length+1];
    //     for (int i = 0; i < numeros.length; i++) {
    //         nuevoArray[i+1] = numeros[i];
    //     }
    //     nuevoArray[0] = nuevoNumero;
    //     return nuevoArray;
    // }

    public static int[] add(int[] numeros, int nuevoNumero){
        return add(numeros, nuevoNumero, numeros.length);
    }

    public static int[] add(int nuevoNumero, int[] numeros){
        return add(numeros, nuevoNumero, 0);
    }

    public static int[] add(int[] numeros, int nuevoNumero, int index){
        int[] nuevoArray = new int[numeros.length+1];
        for (int i = 0; i < index; i++) {
            nuevoArray[i] = numeros[i];
        }
        for (int i = index; i < numeros.length; i++) {
            nuevoArray[i+1] = numeros[i];
        }
        nuevoArray[index] = nuevoNumero;
        return nuevoArray;
    }

    // public static int[] pop(int[] numeros) {
    //     int[] nuevoArray = new int[numeros.length-1];
    //     for (int i = 0; i < nuevoArray.length; i++) {
    //         nuevoArray[i] = numeros[i];
    //     }
    //     return nuevoArray;
    // }

    public static int[] pop(int[] numeros) {
        return pop(numeros, numeros.length-1);
    }

    public static int[] pop(int[] numeros, int index){
        if(index < 0 || index > numeros.length-1) {
            System.out.println("Indice invalido ("+index+"), devolviendo array original");
            return numeros;
        }
        int[] nuevoArray = new int[numeros.length-1];
        for (int i = 0; i < index; i++) {
            nuevoArray[i] = numeros[i];
        }
        for (int i = index+1; i < numeros.length; i++) {
            nuevoArray[i-1] = numeros[i];
        }
        return nuevoArray;
    }
}
