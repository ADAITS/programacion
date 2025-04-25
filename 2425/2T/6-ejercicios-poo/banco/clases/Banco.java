package clases;

import java.util.ArrayList;
import java.util.Date;

public class Banco {
    ArrayList<User> users;
    ArrayList<Cuenta> cuentas;
    ArrayList<Movimiento> movimientos;

    void crearDatos(){
        users = new ArrayList<User>();
        cuentas = new ArrayList<Cuenta>();
        movimientos = new ArrayList<Movimiento>();
        Cuenta cuenta = new Cuenta("DNI");
        users.add(new User("DNI", 1234, "Gabri"));
        users.add(new User("IDN", 4321, "Ana"));
        users.add(new User("12345678L", 1234567890, "Pepe"));
        cuentas.add(cuenta);
        cuentas.add(new Cuenta("DNI"));
        movimientos.add(new Movimiento(cuenta.getNumero(), 100.0, new Date(1710172535000L), "ingreso"));
        movimientos.add(new Movimiento(cuenta.getNumero(), 10.0, "retirada"));
        movimientos.add(new Movimiento(cuenta.getNumero(), 50.0, "ingreso"));
    }

    public Banco(){
        crearDatos();
        //System.out.println(users);
        //System.out.println(cuentas);
        //System.out.println(movimientos);
    }

    public void start() {
        Cuenta cuenta = cuentas.get(0);
        // System.out.println(cuenta);
            cuenta.ingresarDinero(33.3);
            cuenta.ingresarDinero(33.33);
            cuenta.ingresarDinero(33.3);
        try{
            cuenta.retirarDinero(150.0);
        }catch(Exception e ){
            System.out.println(e);
        }
            // System.out.println(cuenta);
            // System.out.println(cuenta.getMovimientos());
        try{
            cuenta.transferirDinero(10.0, cuentas.get(1));
        }catch(Exception e ){
            System.out.println(e);
        }
        System.out.println(cuenta);
        System.out.println(cuentas.get(1));
        
    }
}
