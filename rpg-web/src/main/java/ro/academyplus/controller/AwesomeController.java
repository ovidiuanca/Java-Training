package ro.academyplus.controller;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ro.academyplus.dto.HeroDTO;
import ro.academyplus.dto.UserDTO;
import ro.academyplus.model.Hero;
import ro.academyplus.model.HeroType;
import ro.academyplus.model.User;
import ro.academyplus.service.AwesomeService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by agheboianu on 01.03.2016.
 */
@Controller
public class AwesomeController {

    @Autowired
    AwesomeService awesomeService;

    @RequestMapping("/")
    public String beAwesome() {
        return "redirect:gameMenu";
    }

    @RequestMapping(value = "/gameMenu", method = RequestMethod.GET)
    public String getGameMenu(Model model){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        User user = awesomeService.getUserByEmail(name);
        //ArrayList<Hero> heroes = awesomeService.getHeroesByUser(user);
        List<Hero> heroes = user.getHeroes();
        System.out.println("heroes: " + heroes);
        for (Hero hero: heroes)
            System.out.println(hero.getName());
        model.addAttribute("heroes", heroes);
        return "gameMenu";
    }

    @RequestMapping(value = "/createHero", method = RequestMethod.GET)
    public String getCreateHero(Model model){
        HeroDTO hero = new HeroDTO();
        model.addAttribute("hero", hero);
        model.addAttribute("heroType", HeroType.values());
        return "createHero";
    }

    @RequestMapping(value = "/createHero", method = RequestMethod.POST)
    public String sendCreateHero(@ModelAttribute(value = "hero") HeroDTO hero, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "createHero";
        }
        Hero heroModel = awesomeService.createHero(hero);
        awesomeService.addHeroToUser(heroModel);
        return "selectHero";
    }

    @RequestMapping(value = "/selectHero", method = RequestMethod.GET)
    public String getSelectHero(){
        return "selectHero";
    }

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public String beMoreAwesome(@RequestParam(value = "name", required = false, defaultValue = "Alex") String name, Model model) {
        model.addAttribute("name", awesomeService.formatName(name));
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String sendUser(@ModelAttribute(value = "user") @Valid UserDTO user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        User userModel = awesomeService.registerUser(user);
        return "redirect:html?name=" + userModel.getId();
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(Model model) {
        UserDTO user = new UserDTO();
        model.addAttribute("user", user);
        return "create";
    }
}