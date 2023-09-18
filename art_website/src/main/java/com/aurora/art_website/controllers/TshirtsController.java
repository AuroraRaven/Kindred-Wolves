package com.aurora.art_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("tshirts")
@Controller
public class TshirtsController {
    @GetMapping
    public String showTshirtPage(Model model){
        model.addAttribute("title", "T-Shirts");
        return "tshirts";
    }
}
