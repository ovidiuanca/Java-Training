package ovidiucota.characters;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    6:44 PM
 */
public abstract class Character {
    protected String name;
    protected int level;
    protected int health;
    protected int armor;
    protected int damage;

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {

        return name;
    }

    public Character(String name){
        level = 1;
        this.name = name;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
