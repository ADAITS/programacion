import clases.Camiseta;
import clases.Persona;

public class Main {
    static Camiseta[] camisetas = {
        new Camiseta("Nike", "M", "Rojo"),
        new Camiseta("Adidas", "L", "Azul"),
        new Camiseta("Puma", "S", "Verde"),
        new Camiseta("Reebok", "M", "Negro"),
        new Camiseta("Under Armour", "XL", "Blanco"),
        new Camiseta("New Balance", "S", "Amarillo"),
        new Camiseta("Fila", "L", "Gris"),
        new Camiseta("Asics", "M", "Naranja"),
        new Camiseta("Converse", "XL", "Rojo"),
        new Camiseta("Jordan", "L", "Azul"),
        new Camiseta("Vans", "M", "Blanco"),
        new Camiseta("Adidas", "S", "Verde"),
        new Camiseta("Nike", "XL", "Negro"),
        new Camiseta("Puma", "L", "Amarillo"),
        new Camiseta("Reebok", "M", "Gris"),
        new Camiseta("Under Armour", "S", "Azul"),
        new Camiseta("New Balance", "XL", "Rojo"),
        new Camiseta("Fila", "M", "Blanco"),
        new Camiseta("Asics", "L", "Negro"),
        new Camiseta("Converse", "S", "Verde")
    };
    public static void main(String[] args) {
        int random = (int)(Math.random()*camisetas.length);
        Camiseta camiseta = new Camiseta("Lacoste", "L", "Azul");
        System.out.println(camiseta);
        Persona persona = new Persona("Juan");
        System.out.println(persona);
        persona.ponerseCamiseta(camisetas[random]);
        System.out.println(persona);
        persona.quitarseCamiseta();
        System.out.println(persona);

    }
}
