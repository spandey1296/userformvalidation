package com.project.upgrade.userformvalidation.controlller;


import com.project.upgrade.userformvalidation.model.User;
import com.project.upgrade.userformvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class Usercontroller {


    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String login(Model model) {
        //Model is taking your controller to your view.
        model.addAttribute("user",new User());
        return "form";


    }


   






}