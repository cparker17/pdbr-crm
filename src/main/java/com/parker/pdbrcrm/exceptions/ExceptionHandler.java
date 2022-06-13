package com.parker.pdbrcrm.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler extends Exception {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public String handleReportException(Exception e, Model model) {
        model.addAttribute("message", e.getMessage());
        return "error-page";
    }
}
