package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String showHomePage() {
        return "Math";
    }

    @GetMapping("/geometry")
    public String showGeometryPage() {
        return "Geometry";
    }

    @GetMapping("/probability")
    public String showProPage() {
        return "Probability";
    }

    @GetMapping("/computations")
    public String showCompPage() {
        return "Computations";
    }

    @GetMapping("/derivative")
    public String showDerPage() {
        return "Derivative";
    }

    @GetMapping("/wordproblems")
    public String showWPPage() {
        return "Wordproblems";
    }
}