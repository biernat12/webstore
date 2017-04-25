package webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webstore.models.Product;
import webstore.models.User;
import webstore.services.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model, User user){
        model.addAttribute("user", new User());
        return "registration";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String doRegistration(User user){
        userService.addUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(){
        return "login";
    }


}
