import java.util.Arrays;

import lib.Utils;

public class Liberia {
    public static void main(String[] args) {
       //Utils.print("World");
       
       int[] numeros = { 1,2,3,4,5,6,7,8,9 };
       System.out.println(Arrays.toString(numeros));

       numeros = Utils.add(numeros, 10);
       System.out.println(Arrays.toString(numeros));

       numeros = Utils.pop(numeros);
       numeros = Utils.pop(numeros);
       numeros = Utils.pop(numeros);
       System.out.println(Arrays.toString(numeros));

    }
}
