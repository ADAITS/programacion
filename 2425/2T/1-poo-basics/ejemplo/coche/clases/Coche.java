package clases;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private double deposito; // litros
    private int capacidad;
    private double consumo; // litros / 100 km 

    public Coche(String matricula, String marca, String modelo, double deposito, int capacidad, double consumo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
        this.capacidad = capacidad;
        this.consumo = consumo;
    }

    public Coche(String matricula, String marca, String modelo, int capacidad){
        this(matricula, marca, modelo, capacidad, capacidad, 6);
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

    private void setDeposito(double deposito){
        if(deposito < 0) {
            this.deposito = 0;
        }else if(deposito > 100){
            this.deposito = 100;
        } else {
            this.deposito = deposito;
        }
    }

    public void llenarDeposito(){
        this.deposito = this.capacidad;
    }

    public boolean hacerKm(int kilometros){
        double litros = calcularConsumo(kilometros);
        if(litros > this.deposito){
            System.out.println("No hay gasolina suficiente");
            return false;
        }
        this.setDeposito(this.deposito - litros);
        return true;
    }

    public double calcularConsumo(int km) {
        return km * this.consumo / 100;
    }

    private double getPorcentaje(){
        return 100 * this.deposito / this.capacidad;
    }

    @Override
    public String toString(){
        return this.matricula + " " + this.marca + " " + this.modelo + " " + this.getPorcentaje();
    }
}
