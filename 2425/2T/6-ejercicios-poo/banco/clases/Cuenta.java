package clases;
import java.util.ArrayList;

public class Cuenta {
    private String numero;
    private String user;
    private Double saldo;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(String numero, String user, Double saldo, ArrayList<Movimiento> movimientos){
        this.numero = numero;
        this.user = user;
        this.saldo = saldo;
        this.movimientos = movimientos;
    }

    public Cuenta(String user){
        this.user = user;
        this.numero = generarNumeroCuenta();
        this.saldo = 0.0;
        this.movimientos = new ArrayList<Movimiento>();
    }

    private String crearDigitosAleatorios(int numDigitos){
        String digitos = "";
        for (int i = 0; i < numDigitos; i++) {
            digitos += (int) (Math.random()*10);
        }
        return digitos;
    }

    private String generarNumeroCuenta(){
        String countryCode = "ES";
        String controlDigit = crearDigitosAleatorios(2);
        String entity = crearDigitosAleatorios(4);
        String office =  crearDigitosAleatorios(4);
        String controlDigit2 = crearDigitosAleatorios(2);
        String accountNumber = crearDigitosAleatorios(10);
        return countryCode + controlDigit + entity + office + controlDigit2 + accountNumber;
    }

    public String getNumero() {
        return numero;
    }

    public String getUser() {
        return user;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
        this.movimientos.add(new Movimiento(this.user, cantidad, "ingreso"));
    }

    public void retirarDinero(double cantidad) throws Exception {
        if(cantidad > this.saldo) throw new Exception("No hay money :'(");

        this.saldo -= cantidad;
        this.movimientos.add(new Movimiento(this.user, cantidad*-1, "retirada"));
    }

    public void transferirDinero(double cantidad, Cuenta destino) throws Exception {
        this.retirarDinero(cantidad);
        destino.ingresarDinero(cantidad);
    }

    @Override
    public String toString() {
        return "Cuenta [numero=" + numero
            + ", user=" + user
            + ", saldo=" + Math.round(this.saldo * 100) / 100.0
            + ", movimientos=" + movimientos.size()
            + "]";
    }

}
