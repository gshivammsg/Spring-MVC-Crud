package com.MVC.SpringMVC;

// src/main/java/com/example/controller/UserController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/form")
    public String showForm(User user) {
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(User user) {
        userRepository.save(user);
        return "redirect:/form";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }
}
