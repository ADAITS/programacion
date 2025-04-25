package clases;

public class Consumible extends Arma {
    
    public Consumible(String nombre, int danio){
        super(nombre, danio);
    }

    public Consumible(String nombre){
        super(nombre);
        this.setDanio((int) (Math.random()*150 + 50));
    }

    @Override
    public void usar(){
        System.out.println("Se ha lanzado un/una " + super.getNombre());
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
