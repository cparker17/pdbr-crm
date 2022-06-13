package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.models.User;
import com.parker.pdbrcrm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/create")
    public String createUser(@ModelAttribute User user) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{userId}")
    public String getUser(@PathVariable Long userId, Model model) {
        return "view-user";
    }

    @RequestMapping("/update")
    public String updateUser(@ModelAttribute User user) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        return "redirect:/dashboard";
    }
}
