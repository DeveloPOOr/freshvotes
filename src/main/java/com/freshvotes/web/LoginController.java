package com.freshvotes.web;

import com.freshvotes.domain.User;
import com.freshvotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String loginView() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerView(ModelMap model) {
        model.put("user", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String registerPost(User user) {

        System.out.println(user);
        User user1 = userService.save(user);
        return "redirect:/login";
    }
}
