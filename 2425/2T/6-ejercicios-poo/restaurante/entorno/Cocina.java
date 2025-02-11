package entorno;

import java.util.ArrayList;
import java.util.Collection;

import producto.Producto;

public class Cocina {
    ArrayList<Producto> pendientes;
    ArrayList<Producto> preparados;

    public Cocina(){
        pendientes = new ArrayList<Producto>();
        preparados = new ArrayList<Producto>();
    }

    public void recibirComanda(ArrayList<Producto> productos){
        for (Producto producto : productos) {
            if(producto.getTipo().equals("comida")){
                pendientes.add(producto);
            }else{
                preparados.add(producto);
            }
        }
    }

}
