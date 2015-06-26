package ru.matritca.logbook.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vasiliy on 26.06.15.
 */
@Controller
public class HomeController {

       @RequestMapping(value = "/")
       public String home(){
           return "home";
       }

}
