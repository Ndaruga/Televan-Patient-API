package com.sidar.telvan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public String landingPage() {
        return "index";
    }

    @GetMapping("/create-patient")
    public String createPatient() {
        return "create-patient";
    }

    @GetMapping("/list-patients")
    public String listPatients() {
        return "list-patients";
    }

    @GetMapping("/update-patient")
    public String updatePatient() {
        return "update-patient";
    }
}