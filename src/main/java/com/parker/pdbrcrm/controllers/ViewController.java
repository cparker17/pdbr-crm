package com.parker.pdbrcrm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/dashboard")
    public String viewDashboard() {
        return "dashboard";
    }

    @RequestMapping("address-form")
    public String viewAddressForm() {
        return "address-form";
    }

    @RequestMapping("customer-form")
    public String viewCustomerForm() {
        return "customer-form";
    }

    @RequestMapping("lead-form")
    public String viewLeadForm() {
        return "lead-form";
    }

    @RequestMapping("log-item-form")
    public String viweLogItemForm() {
        return "log-item-form";
    }

    @RequestMapping("user-form")
    public String viewUserForm() {
        return "user-form";
    }
}
