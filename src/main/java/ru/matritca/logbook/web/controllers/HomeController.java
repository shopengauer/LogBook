package ru.matritca.logbook.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vasiliy on 26.06.15.
 */
@Controller
public class HomeController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("model","Thymeleaf");
        return "index";
    }

//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    public String home(Model model){
//        model.addAttribute("model","Thymeleaf");
//        return "login";
//    }
}
