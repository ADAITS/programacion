package clases;

public class Garaje {
    Coche[] coches;

    public Garaje(Coche[] coches){
        this.coches = coches;
    }

    public Garaje(int plazas) {
        this.coches = new Coche[plazas];
    }

    public void meterCoche(Coche coche) {
        boolean next = true;
        for(int i=0; i<this.coches.length && next; i++) {
            if(this.coches[i] == null){
                this.coches[i] = coche;
                next = false;
            }
        }
    }

    public Coche sacarCoche(int i) {
        if(i < 0 || i >= coches.length) return null;
        Coche coche = this.coches[i];
        this.coches[i] = null;
        return coche;
    }
}