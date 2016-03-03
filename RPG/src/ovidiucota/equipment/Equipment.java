package ovidiucota.equipment;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    7:00 PM
 */
public abstract class Equipment {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String toString(){
        return name;
    }
}
