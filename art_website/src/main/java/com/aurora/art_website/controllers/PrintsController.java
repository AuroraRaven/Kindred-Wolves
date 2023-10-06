package com.aurora.art_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prints")
public class PrintsController {
    @GetMapping
    public String displayPrintsPage(Model model){
        model.addAttribute("title","Digital Art Prints");
        return "prints";

    }


}
