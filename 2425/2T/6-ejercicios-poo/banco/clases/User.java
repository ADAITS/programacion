package clases;

import lib.Leer;

public class User {
    private String dni;
    private int secretCode;
    private String name;

    public User(String dni, int secretCode, String name){
        this.dni = dni;
        this.secretCode = secretCode;
        this.name = name;
    }

    public User(){
        this.name = Leer.texto("Introduzca su nombre: ");
        this.dni = Leer.texto("Introduzca el DNI: ");
        this.secretCode = Leer.entero("Introduzca su código secreto: ");
    }

    public String getDni(){
        return this.dni;
    }

    // public int getSecretCode(){
    //     return this.secretCode;
    // }

    public String getName(){
        return this.name;
    }

    public boolean checkLogin(String dni, int code){
        return this.dni.equals(dni) && this.secretCode == code;
    }

    @Override
    public String toString(){
        return this.name + " ("+this.dni+")";
    }
}
