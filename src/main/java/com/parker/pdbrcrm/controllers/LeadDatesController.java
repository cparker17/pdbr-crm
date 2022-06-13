package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.models.Customer;
import com.parker.pdbrcrm.models.LeadDates;
import com.parker.pdbrcrm.services.LeadDatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lead-dates")
public class LeadDatesController {
    @Autowired
    LeadDatesService leadDatesService;

    @RequestMapping("/create")
    public String createLeadDates(@ModelAttribute LeadDates leadDates) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{leadDatesId}")
    public String getLeadDates(@PathVariable Long leadDatesId, Model model) {
        return "view-lead-dates";
    }

    @RequestMapping("/update")
    public String updateLeadDates(@ModelAttribute LeadDates leadDates) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{leadDatesId}")
    public String deleteLeadDates(@PathVariable Long leadDatesId) {
        return "redirect:/dashboard";
    }
}
