package producto;

public class Producto {
    String nombre;
    Double precio;
    int cantidad;
    String tipo;

    public Producto(String nombre, Double precio, int cantidad, String tipo){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return nombre +", "+ precio +", " + cantidad + ", "+ tipo;
    }

}
