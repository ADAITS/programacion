import clases.Weapon;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Weapon gun = new Weapon("Pistola", 100, 1000, 1000, "green", true);
        Weapon katana = new Weapon("Katana", 250, 750, 2, "red", false);
        
        Weapon letalestWeapon = letalest(gun, katana);
        System.out.println(letalestWeapon.getName());
        
        gun.setDamage(500);
        
        letalestWeapon = letalest(gun, katana);
        System.out.println(letalestWeapon.getName());
    }

    public static Weapon letalest(Weapon weapon1, Weapon weapon2){
        if(weapon1.getDamage() > weapon2.getDamage()){
            return weapon1;
        }

        return weapon2;
    }

    public static void printGreen(String text){
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }
}
