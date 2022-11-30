package com.gaurav.springboot.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

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
    @RequestMapping(value = "/example-loop",method=RequestMethod.GET)
    public String iterateHandler(Model model)  {
        //create list
        List<String> stringList = List.of("Ankit","Jaya","Gaurav","Sujit");
        model.addAttribute("names",stringList);
        return "example-loop";
    }

    //Handle of conditional statement
    @RequestMapping(value = "conditional-example",method = RequestMethod.GET)
    public String conditionHandler(Model model) {
        List<Integer> list = List.of(11,22,33,44,55);
        model.addAttribute("isActive",true);
        model.addAttribute("gender","F");
        model.addAttribute("myList",list);
        return "conditional-example";

    }
}
