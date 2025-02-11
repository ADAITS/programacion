package entorno;

import java.util.ArrayList;

import producto.Producto;
import persona.Cliente;

public class Mesa {
    int id; // 0
    Cliente cliente; // null
    int nMaxComensajes; // 0
    ArrayList<Producto> productos; // null

    public Mesa(int id, int nMaxComensajes){
        this.id = id;
        this.nMaxComensajes = nMaxComensajes;
        this.productos = new ArrayList<Producto>(); // []
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString(){
        return "Mesa Nº"+id+" ha pedido: "+ productos;
    }
}
