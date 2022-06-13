package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.exceptions.NoCustomerException;
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
        customerService.createCustomer(customer);
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{customerId}")
    public String getCustomer(@PathVariable Long customerId, Model model) throws NoCustomerException {
        model.addAttribute("customer", customerService.getCustomer(customerId));
        return "view-customer";
    }

    @RequestMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer) throws NoCustomerException {
        customerService.updateCustomer(customer);
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) throws NoCustomerException {
        customerService.deleteCustomer(customerId);
        return "redirect:/dashboard";
    }
}
