package entorno;

import java.util.ArrayList;

import producto.Bebida;
import producto.Comida;
import producto.Postre;
import producto.Producto;

public class Carta {
    ArrayList<Producto> carta = new ArrayList<Producto>();

    public Carta(){
        carta.add(new Comida("pizza", 10.0, 1));
        carta.add(new Comida("burguer", 10.0, 1));
        carta.add(new Comida("pasta", 10.0, 1));
        carta.add(new Comida("ensalda", 10.0, 1));
        carta.add(new Bebida("cocacola", 10.0, 1));
        carta.add(new Bebida("fanta", 10.0, 1));
        carta.add(new Bebida("fuzetea", 10.0, 1));
        carta.add(new Bebida("sprite", 10.0, 1));
        carta.add(new Bebida("roncola", 10.0, 1));
        carta.add(new Postre("tiramisu", 10.0, 1));
        carta.add(new Postre("tocinillo", 10.0, 1));
        carta.add(new Postre("tartaAbuela", 10.0, 1));
        carta.add(new Postre("lotus", 10.0, 1));
    }

    public void imprimir(){
        for (int i = 0; i < carta.size(); i++) {
            System.out.println((i+1)+". "+carta.get(i).getNombre());
        }
    }

    public Producto elegirProducto(int i){
        return carta.get(i-1);
    }
}
