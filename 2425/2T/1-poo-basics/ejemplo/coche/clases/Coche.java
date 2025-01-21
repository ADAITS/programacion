package clases;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int deposito; // %

    public Coche(String matricula, String marca, String modelo, int deposito){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
    }

    public Coche(String matricula, String marca, String modelo){
        this(matricula, marca, modelo, 100);
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private void setDeposito(int deposito){
        if(deposito < 0) {
            this.deposito = 0;
        }else if(deposito > 100){
            this.deposito = 100;
        } else {
            this.deposito = deposito;
        }
    }

    public void llenarDeposito(){
        this.deposito = 100;
    }

    public void hacerKm(double kilometros){
        double consumo = (double)kilometros / 10;
        if(consumo > this.deposito){
            System.out.println("No hay gasolina");
        }
        this.setDeposito((int)(this.deposito - consumo));
    }

    @Override
    public String toString(){
        return this.matricula + " " + this.marca + " " + this.modelo + " " + this.deposito;
    }
}
