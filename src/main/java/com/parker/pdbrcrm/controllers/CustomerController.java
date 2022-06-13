package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.models.Customer;
import com.parker.pdbrcrm.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/create")
    public String createCustomer(@ModelAttribute Customer customer) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{customerId}")
    public String getCustomer(@PathVariable Long customerId, Model model) {
        return "view-customer";
    }

    @RequestMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) {
        return "redirect:/dashboard";
    }
}
