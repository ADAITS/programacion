package clases;
import java.util.Date;

public class Movimiento {
    private String cuenta;
    private Double valor;
    private Date fecha;
    private String accion;

    public Movimiento(String cuenta, Double valor, Date fecha, String accion) {
        this.cuenta = cuenta;
        this.valor = valor;
        this.fecha = fecha;
        this.accion = accion;
    }

    public Movimiento(String cuenta, Double valor, String accion) {
        this(cuenta, valor, new Date(), accion);
    }

    public String getCuenta() {
        return cuenta;
    }

    public Double getValor() {
        return valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAccion() {
        return accion;
    }

    @Override
    public String toString() {
        return "Movimiento [cuenta=" + cuenta
            + ", valor=" + valor
            + ", fecha=" + fecha
            + ", accion=" + accion
            + "]";
    }

}
