public class Hero {
   private String superPower;
   private int health, damage;

    public Hero(String superPower, int health, int damage) {
        this.superPower = superPower;
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
