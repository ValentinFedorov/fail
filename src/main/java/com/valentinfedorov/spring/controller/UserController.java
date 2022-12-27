package com.valentinfedorov.spring.controller;

import com.valentinfedorov.spring.dao.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserDAO userDAO;

    @GetMapping
    public String printUsers(Model model) {
        model.addAttribute("users", userDAO.getAllUsers());
        return "users";
    }
}
