package ro.academyplus.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User:    ovidiu
 * Package: rpg
 * Date:    3/9/16
 * Time:    12:23 PM
 */
public class HeroDTO {
    @NotNull(message = "Field is null")
    @Size(min = 1, max = 30, message = "Size not ok.")
    private String name;
    private String type;
    private int level;
    private int health;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {

        return level;
    }

    public String getType() {
        return type;
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

    public HeroDTO() {
        super();
        level = 1;
        health = 100;
    }
}
