package ro.academyplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.academyplus.model.User;

import java.util.List;

/**
 * Created by agheboianu on 04.03.2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByEmail(String email);

    List<User> findByNameLike(String name);

    int countByName(String name);
}
