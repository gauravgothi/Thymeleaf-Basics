package com.gaurav.springboot.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class MyController {

    @RequestMapping(value = "/about",method=RequestMethod.GET)
    public String about(Model model)   {
        System.out.println("Inside about Handler......");
        //Putting data to model
        model.addAttribute("name","Gaurav Gothi");
        model.addAttribute("currentDate",new Date().toString());

        return "about";
    }
}
