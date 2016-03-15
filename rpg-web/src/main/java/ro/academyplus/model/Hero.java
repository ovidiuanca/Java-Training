package ro.academyplus.model;

import javax.persistence.*;

/**
 * User:    ovidiu
 * Package: rpg
 * Date:    3/9/16
 * Time:    12:12 PM
 */

@Entity
@Table(name = "HEROES")
public class Hero {
    private String name;
    private String type;
    private int level;
    private int health;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {

        return health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {

        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {

        return name;
    }

    public String getType() {
        return type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
