import java.util.Arrays;

import lib.Utils;

public class Liberia {
    public static void main(String[] args) {
       //Utils.print("World");
       
       int[] numeros = { 2,3,4,6,7,8,9 };
       System.out.println(Arrays.toString(numeros));

       numeros = Utils.add(1, numeros); 
       numeros = Utils.add(numeros, 10);
       numeros = Utils.add(numeros, 5, 4);
       System.out.println(Arrays.toString(numeros));

       numeros = Utils.pop(numeros, 4);
       System.out.println(Arrays.toString(numeros));

    }
}
