package webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("greeting", "Witaj w sklepie internetowym!");
        model.addAttribute("tagline", "Zapoznaj sie z ofertą naszego sklepu.");
        return "hello";
    }
}
