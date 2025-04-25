package clases;

public class Guerrero {
    String nombre;
    Arma arma;

    public Guerrero(String nombre, Arma arma){
        this.nombre = nombre;
        this.arma = arma;
    }

    public void usarArma(){
        this.arma.usar();
    }
}
