package clases;

public class Weapon {
    private String name;
    private int damage; // from 1 to 1000
    private int rate; // milliseconds
    private double range; // meters
    private String color; // named color
    private boolean equipped;

    public Weapon(String name, int damage, int rate, double range, String color, boolean equipped){
        this.name = name;
        this.damage = damage;
        this.rate = rate;
        this.range = range;
        this.color = color;
        this.equipped = equipped;
    }

    public Weapon(String name, int damage){
        this(name, damage, 0, 0, null, false);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDamage() {
        if(!this.isEquipped()) return 0;
        return this.damage;
    }

    public void setDamage(int damage){
        if(damage > 1000) return;
        this.damage = damage;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public double getRange() {
        return this.range;
    }

    public void setRange(double range){
        this.range = range;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isEquipped() {
        return this.equipped;
    }

    public void setEquipped(boolean equipped){
        this.equipped = equipped;
    }

}
