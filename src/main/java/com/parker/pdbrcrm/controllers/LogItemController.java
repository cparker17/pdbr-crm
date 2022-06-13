package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.models.LeadDates;
import com.parker.pdbrcrm.models.LogItem;
import com.parker.pdbrcrm.services.LogItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/log-item")
public class LogItemController {
    @Autowired
    LogItemService logItemService;

    @RequestMapping("/create")
    public String createLogItem(@ModelAttribute LogItem logItem) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{logItemId}")
    public String getLogItem(@PathVariable Long logItemId, Model model) {
        return "view-lead-dates";
    }

    @RequestMapping("/update")
    public String updateLogItem(@ModelAttribute LogItem logItem) {
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{logItemId}")
    public String delateLogItem(@PathVariable Long logItemId) {
        return "redirect:/dashboard";
    }
}
