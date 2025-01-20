package clases;

public class Camiseta {
    private String marca;
    private String talla;
    private String color;

    public Camiseta(String marca, String talla, String color) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getTalla() {
        return this.talla;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.marca + ", " + this.talla + ", " + this.color;
    }
}
