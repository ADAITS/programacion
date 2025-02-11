package persona;

import java.util.ArrayList;
import java.util.Scanner;

import producto.Producto;
import entorno.Carta;

public class Camarero extends Persona {
    ArrayList<Producto> bandeja;

    public Camarero(String nombre){
        super(nombre, "camarero");
        bandeja = new ArrayList<Producto>();
    }

    public void colocarEnBandeja(Producto producto){
        bandeja.add(producto);
    }

    public Producto cogerDeBandeja(){
        return bandeja.removeFirst();
    }

    public ArrayList<Producto> tomarNota(){
        Carta carta = new Carta();
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Scanner console = new Scanner(System.in);
        
        carta.imprimir();
        System.out.print("Que quiere pedir? (0 para salir): ");
        int indiceProducto = Integer.parseInt(console.nextLine());
        while (indiceProducto > 0) {    
            productos.add(carta.elegirProducto(indiceProducto));
            carta.imprimir();
            System.out.print("Que quiere pedir? (0 para salir): ");
            indiceProducto = Integer.parseInt(console.nextLine());
        }

        return productos;
    }

    @Override
    public String toString(){
        return super.nombre +" tiene "+bandeja+" en la bandeja";
    }
}
