package clases;

public class Distancia extends Arma {
    int rango;
    int municion;
    int capacidad;

    public Distancia(String nombre, int danio, int rango, int capacidad, int municion){
        super(nombre, danio);
        this.rango = rango;
        this.capacidad = capacidad;
        this.municion = municion;
    }

    public Distancia(String nombre) {
        super(nombre, 0);
        super.setDanio(randomInt(25, 100));
        this.rango = randomInt(23, 1000);
        this.capacidad = randomInt(10, 150);
        this.municion = this.capacidad;
    }

    private int randomInt(int min, int max){
        return (int) (Math.random()*(max-min) + min);
    }

    public void disparar(){
        usar();
    }

    @Override
    public void usar(){
        System.out.println("Se ha disparado con "+ super.getNombre());
    }

    @Override
    public String toString(){
        return super.toString() + "["+rango+", "+capacidad+", "+municion+"]";
    }
}
