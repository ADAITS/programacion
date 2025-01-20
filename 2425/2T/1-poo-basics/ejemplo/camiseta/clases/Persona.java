package clases;

import clases.Camiseta;

public class Persona {
    private String nombre;
    private Camiseta camiseta;

    public Persona(String nombre, Camiseta camiseta){
        this(nombre);
        this.camiseta = camiseta;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void ponerseCamiseta(Camiseta camiseta){
        System.out.println(this.nombre + " se ha puesto una camiseta "+ camiseta.getColor());
        this.camiseta = camiseta;
    }

    public Camiseta quitarseCamiseta(){
        System.out.println(this.nombre + " se ha quitado la camiseta");
        Camiseta camisetaQuitada = this.camiseta;
        this.camiseta = null;
        return camisetaQuitada;
    }

    @Override
    public String toString() {
        if(camiseta == null) return this.nombre +" está desnud@";
        return this.nombre 
            + " lleva puesta una camiseta de " + this.camiseta.getMarca()
            + " de talla " + this.camiseta.getTalla()
            + " de color " + this.camiseta.getColor();
    }
}
