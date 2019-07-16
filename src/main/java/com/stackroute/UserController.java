package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    User user = new User("Sandeep Grover");

    @RequestMapping("/")

    public ModelAndView welcome() {

        ModelAndView mv=new ModelAndView("index");
        mv.addObject("message",user.getName());

        return mv;
    }

}