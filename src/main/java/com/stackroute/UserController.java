package com.stackroute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")
    public ModelAndView welcome() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
        User user = context.getBean("user", User.class);

        ModelAndView mv=new ModelAndView("index");
        mv.addObject("name", user.getName());

        return mv;
    }

}