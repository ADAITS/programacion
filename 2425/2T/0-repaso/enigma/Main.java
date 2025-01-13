public class Main {
    public static void main(String[] args) {
        //System.out.println(1 + 'Z' - 'A');
        System.out.println(caesarEncode("AAA", 4)); // EFG
        
        System.out.println(applyRotor("EFG", "BDFHJLCPRTXVZNYEIWGAKMUSQO")); // AAA
        System.out.println(applyRotor("JLC", "AJDKSIRUXBLHWTMCQGZNPYFVOE")); // AAA
        System.out.println(applyRotor("BHD", "EKMFLGDQVZNTOWYHXUSPAIBRCJ")); // AAA
        
        System.out.println(applyRotorInv("KQF", "EKMFLGDQVZNTOWYHXUSPAIBRCJ")); // AAA
        System.out.println(applyRotorInv("BHD", "AJDKSIRUXBLHWTMCQGZNPYFVOE")); // AAA
        System.out.println(applyRotorInv("JLC", "BDFHJLCPRTXVZNYEIWGAKMUSQO")); // AAA
        
        System.out.println(caesarDecode("EFG", 4)); // AAA
    }

    public static String caesarEncode(String text, int shift) { // AAA, 4
        // 1. Crear variable para devolver el texto encriptado
        String encriptedText = "";
        // 2. Recorrer todas las letras de la palabra
        for (int i = 0; i < text.length(); i++) {  
            int letra = text.charAt(i) - 'A'; // AAA 
            // 3. Calcular la nueva letra con el desplazamiento correspondiente (shift + i)
            // ! Atención al final del abecedario (Z+1)
            int newLetra = (letra + shift + i) % (1 + 'Z'- 'A');
            // while(newLetra > 90){
            //     newLetra -= 1 + 'Z'- 'A'; // 26
            // }
            // Acumular en la variable creada
            encriptedText += (char)(newLetra + 'A');
        }
        // 4. Devolver (return) variable creada
        return encriptedText;
    }

    public static String caesarDecode(String encriptedText, int shift) { // AAA, 4
        // 1. Crear variable para devolver el texto encriptado
        String text = "";
        // 2. Recorrer todas las letras de la palabra
        for (int i = 0; i < encriptedText.length(); i++) {  
            int letra = encriptedText.charAt(i); // AAA 
            // 3. Calcular la nueva letra con el desplazamiento correspondiente (shift + i)
            // ! Atención al final del abecedario (Z+1)
            int newLetra = (char)(letra - (shift + i));
            while(newLetra < 65){
                newLetra += 1 + 'Z'- 'A'; // 26
            }
            // Acumular en la variable creada
            text += (char)newLetra;
        }
        // 4. Devolver (return) variable creada
        return text;
    }

    public static String applyRotor(String text, String rotor){
        String rotatedText = "";
        for (int i = 0; i < text.length(); i++) {
            int posicionABC = text.charAt(i) - 'A';
            rotatedText += rotor.charAt(posicionABC);
        }
        return rotatedText;
    }

    public static String applyRotorInv(String text, String rotor){
        String rotatedText = "";
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            int posicionABC = -1;
            for (int j = 0; j < rotor.length(); j++) {
                if(letra == rotor.charAt(j)){
                    posicionABC = j;
                }
            }
            rotatedText += (char)(posicionABC + 'A');
        }
        return rotatedText;
    }
}
