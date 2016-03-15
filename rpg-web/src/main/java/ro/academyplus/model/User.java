package ro.academyplus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by agheboianu on 04.03.2016.
 */

@Entity
@Table(name = "USERS")
public class User {

    @OneToMany(cascade = CascadeType.ALL)
    List<Hero> heroes;

    public List<Hero> getHeroes() {
        return heroes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHero(Hero hero) {
        this.heroes.add(hero);
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

    private String name;
    private String email;
    private String password;
}
