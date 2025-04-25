package clases;

public class Melee extends Arma {
    int tamanio;
    byte desgaste;

    public Melee(String nombre, int danio, int tamanio, byte desgaste){
        super(nombre, danio);
        this.tamanio = tamanio;
        this.desgaste = desgaste;
    }

    public Melee(String nombre){
        super(nombre, 0);
        this.setDanio(randomInt(50, 125));
        this.tamanio = randomInt(20, 300);
        this.desgaste = 100;
    }

    private int randomInt(int min, int max){
        return (int) (Math.random()*(max-min) + min);
    }

    @Override
    public void usar(){
        System.out.println(super.getNombre() + " ha golpeado al objetivo");
    }

    @Override
    public String toString(){
        return super.toString() + "["+tamanio+", "+desgaste+"]";
    }

}
