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
            digitos += (int) Math.random()*10;
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
        // TODO
        // 1. Aumentar el saldo
        this.saldo += cantidad;
        // 2. Crear movimiento de tipo ingreso con la cantidad correspondiente
        // 3. Añadirlo a la lista de movimientos
        this.movimientos.add(new Movimiento(this.user, cantidad, "ingreso"));
    }

    public void retirarDinero(double cantidad) {
        // TODO
        // 1. Disminuir el saldo
        // 2. Crear movimiento de tipo retirada con la cantidad correspondiente
        // 3. Añadirlo a la lista de movimientos
    }

    public void transferirDinero(double cantidad, Cuenta destino){
        // TODO
        // 1. Disminuir el saldo cuenta this
        // 2. Crear y añadir movimiento de tipo envio con la cantidad correspondiente

        // 3. Aumentar el saldo cuenta destino
        // 4. Crear y añadir movimiento de tipo ingreso con la cantidad correspondiente a cuenta destino
  
    }

    @Override
    public String toString() {
        return "Cuenta [numero=" + numero
            + ", user=" + user
            + ", saldo=" + saldo
            + ", movimientos=" + movimientos.size()
            + "]";
    }

}
