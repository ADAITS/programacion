package clases;

import java.util.ArrayList;

public class Banco {
    ArrayList<User> users;
    ArrayList<Cuenta> cuentas;
    ArrayList<Movimiento> movimientos;

    void crearDatos(){
        users = new ArrayList<User>();
        cuentas = new ArrayList<Cuenta>();
        movimientos = new ArrayList<Movimiento>();
        users.add(new User());

    }

    public Banco(){

        crearDatos();
    }
}
