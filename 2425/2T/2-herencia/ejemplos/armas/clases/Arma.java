package clases;

public class Arma {
    private String nombre;
    private int danio;

    public Arma(String nombre, int danio){
        this.nombre = nombre;
        this.danio = danio;
    }

    public Arma(String nombre){
        this(nombre, 0);
        this.danio = (int) (Math.random()*100);
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getDanio(){
        return this.danio;
    }

    public void setDanio(int danio){
        this.danio = danio;
    }

    public void usar(){
        System.out.println(nombre + " ha sido usada");
    }

    @Override
    public String toString(){
        String className = this.getClass().toString().split("\\.")[1];
        return "[" + className + "] " + nombre + "(" + danio + ")";
    }

}
