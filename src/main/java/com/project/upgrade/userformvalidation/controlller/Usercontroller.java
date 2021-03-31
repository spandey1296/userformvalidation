package com.project.upgrade.userformvalidation.controlller;


import com.project.upgrade.userformvalidation.model.Post;
import com.project.upgrade.userformvalidation.model.User;
import com.project.upgrade.userformvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String login(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/users/registration")
    public String userRegistration(User user) {
        userService.registerUser(user);
        return "index";

    }

    @RequestMapping(method = RequestMethod.POST, value = "/posts")
    public String getUserPost( Model model) {
        model.addAttribute("posts",index);
        return "index";
    }





}