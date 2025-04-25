import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {
        String[] textos = new String[10];
        ArrayList<String> textos2 = new ArrayList<String>(10);
        int index = 0;

        System.out.print("[");
        for (int i = 0; i < index; i++) {
          System.out.print(textos[i]);  
        }
        System.out.println("]");
        System.out.println(textos2);

        System.out.println(textos.length);
        System.out.println(textos2.size());

        textos[0] = "Hola";
        index++;
        textos2.add("Hola");
        System.out.print("[");
        for (int i = 0; i < index; i++) {
          System.out.print(textos[i]);  
        }
        System.out.println("]");

        //System.out.println(Arrays.toString(textos));
        System.out.println(textos2);
        System.out.println(textos.length);
        System.out.println(textos2.size());

        textos[1] = "Adios";
        index++;
        textos2.add("Adios");
        System.out.print("[");
        for (int i = 0; i < index; i++) {
          System.out.print(textos[i] + ", ");  
        }
        System.out.println("]");
        System.out.println(textos2);
        System.out.println(textos.length);
        System.out.println(textos2.size());

        textos[1] = null;
        index--;
        textos2.remove(1);
        System.out.print("[");
        for (int i = 0; i < index; i++) {
          System.out.print(textos[i] + ", ");  
        }
        System.out.println("]");
        System.out.println(textos2);
        System.out.println(textos.length);
        System.out.println(textos2.size());
    }
}
