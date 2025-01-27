package juego;

public class Carta {
    String nombre;
    int ataque;
    int defensa;
    String posicion; // "ataque", "defensa", null
    boolean oculto;

    public Carta(String nombre, int ataque, int defensa){
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posicion = "";
        this.oculto = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isOculto() {
        return oculto;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }

    /* Metodos propios */
    public int atacar(Carta cartaEnemiga) {
        if(!this.posicion.equals("ataque")){
            System.out.println("La carta no puede atacar si no está en posicion de ataque");
            return 0;
        }

        if(cartaEnemiga.getPosicion().equals("ataque")){
            return this.ataque - cartaEnemiga.getAtaque();
        } else if (cartaEnemiga.getPosicion().equals("defensa")){
            return this.ataque - cartaEnemiga.getDefensa();
        }

        System.out.println("Error: la carta objetivo no está en el tablero");
        return 0;
    }

    @Override
    public String toString() {
        return "Carta [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", posicion=" + posicion
                + ", oculto=" + oculto + "]";
    }
    
}
