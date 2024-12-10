public class Asignacion {
    public static void main(String[] args){
        // Asignacion
        int directo = 123;
        int acumulador = 0;
        acumulador = acumulador + 1; // 1
        acumulador++; // 2 Primero uso luego sumo
        ++acumulador; // 3 Primero sumo luego uso
        acumulador += 2; // 5

        int numero = 0;
        System.out.println(++numero);
        System.out.println(numero);
        String texto = "Hola";
        texto += " Mundo!";
        System.out.println(texto);

    }
 }