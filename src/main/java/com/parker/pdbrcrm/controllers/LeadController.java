package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.models.Lead;
import com.parker.pdbrcrm.services.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lead")
public class LeadController {
    @Autowired
    LeadService leadService;

    @RequestMapping("/create")
    public String createLead(Authentication auth, @ModelAttribute Lead lead) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{leadId}")
    public String getLead(@PathVariable Long leadId, Model model) {
        return "lead-view";
    }

    @RequestMapping("/update")
    public String updateLead(@ModelAttribute Lead lead) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete")
    public String deleteLead() {
        return "redirect:/dashboard";
    }
}
