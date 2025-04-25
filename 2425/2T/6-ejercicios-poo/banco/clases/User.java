package clases;

import java.util.Random;
import java.util.Arrays;

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

    public String showHiddenCode() {
        String secretCodeString = String.valueOf(this.secretCode);
        String hidden = secretCodeString.replaceAll(".", "*");

        int randomI = (int) (Math.random()*hidden.length());
        int randomI2;
        do{
            randomI2 = (int) (Math.random()*hidden.length());
        }while(randomI == randomI2);

        hidden = hidden.substring(0, randomI)+ secretCodeString.charAt(randomI) + hidden.substring(randomI+1);
        hidden = hidden.substring(0, randomI2)+ secretCodeString.charAt(randomI2) + hidden.substring(randomI2+1);

        return hidden;
    }

    @Override
    public String toString(){
        return "[" + this.dni + "] " + this.name + " (" + this.showHiddenCode() + ")";
    }
}
