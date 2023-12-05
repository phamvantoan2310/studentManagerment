package com.phamvantoan.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {
    @GetMapping("/showPage403")
    public String showpage403(){
        return "student/error/403";
    }
}
