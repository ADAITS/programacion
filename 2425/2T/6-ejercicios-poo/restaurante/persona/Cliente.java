package persona;

public class Cliente extends Persona {
    int edad;

    public Cliente(String nombre, int edad){
        super(nombre, "cliente");
        this.edad = edad;
    }
}
