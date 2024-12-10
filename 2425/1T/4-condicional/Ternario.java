public class Ternario {
    public static void main(String[] args){
        String texto = "";

        if(3 > 4){
            texto = "Mayor";
        } else {
            texto = "Menor";
        }

        texto = 3 > 4 ? "Mayor" : "Menor";

        System.out.println(texto);
    }
}