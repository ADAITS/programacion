package persona;

public class Persona {
    String nombre;
    String tipo;

    public Persona(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return nombre + ", " + tipo;
    }
}
