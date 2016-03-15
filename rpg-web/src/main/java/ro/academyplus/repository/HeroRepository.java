package ro.academyplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.academyplus.model.Hero;
import ro.academyplus.model.User;

import java.util.ArrayList;

/**
 * User:    ovidiu
 * Package: rpg
 * Date:    3/9/16
 * Time:    12:25 PM
 */
public interface HeroRepository extends JpaRepository<Hero, Long> {
    //public ArrayList<Hero> findByUser(User user);
}
