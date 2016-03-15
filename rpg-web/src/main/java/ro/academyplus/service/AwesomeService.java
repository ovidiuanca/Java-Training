package ro.academyplus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ro.academyplus.dto.HeroDTO;
import ro.academyplus.dto.UserDTO;
import ro.academyplus.model.Hero;
import ro.academyplus.model.User;
import ro.academyplus.repository.HeroRepository;
import ro.academyplus.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agheboianu on 03.03.2016.
 */

@Service
public class AwesomeService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    HeroRepository heroRepository;

    public String formatName(String name) {
        return "Mr." + name;
    }

    public User registerUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
        return userRepository.save(user);
    }

    public Hero createHero(HeroDTO heroDTO){
        Hero hero = new Hero();
        hero.setName(heroDTO.getName());
        hero.setType(heroDTO.getType());
        return heroRepository.save(hero);
    }

    public void addHeroToUser(Hero hero) {
        User user = userRepository.findOneByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
        user.addHero(hero);
        userRepository.saveAndFlush(user);
    }

//    public ArrayList<Hero> getHeroesByUser(User user) {
//        return heroRepository.findByUser(user);
//    }

    public User getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    public void testQueryMethods() {
        User user = userRepository.findOneByEmail("gigi@example.com");
        System.out.println(user.getName() + " " + user.getId());

        List<User> userList = userRepository.findByNameLike("%igi%");
        System.out.println("List size: " + userList.size());

        int count = userRepository.countByName("Gigi");
        System.out.println("Count by name: " + count);

    }
}
