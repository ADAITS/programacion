import producto.Bebida;
import producto.Comida;
import producto.Producto;
import persona.Camarero;
import entorno.Mesa;

public class Main{
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1, 8);
        Camarero camarero = new Camarero("Alfred");

        Producto pizza = new Comida("Pizza pepperoni", 10.0, 1);
        Producto bebida = new Bebida("Coca-cola", 2.0, 2);
        
        System.out.println("No hay productos ni en la mesa ni en la bandeja");
        System.out.println(mesa1);
        //System.out.println(camarero.tomarNota());

        System.out.println("El camarero coge una bebida");
        camarero.colocarEnBandeja(bebida);
        
        System.out.println(mesa1);
        System.out.println(camarero);

        System.out.println("El camarero suelta la bedida en la mesa");
        Producto productoDeLaBandeja = camarero.cogerDeBandeja();
        mesa1.addProducto(productoDeLaBandeja);

        System.out.println(mesa1);
        System.out.println(camarero);

        camarero.colocarEnBandeja(pizza);

        System.out.println(mesa1);
        System.out.println(camarero);

        productoDeLaBandeja = camarero.cogerDeBandeja();
        mesa1.addProducto(productoDeLaBandeja);

        
        System.out.println(mesa1);
        System.out.println(camarero);

        //cocina.recibirComanda(camarero.tomarNota());

    }
}