package com.aurora.art_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("animation")
public class AnimationController {
    @GetMapping
    public String displayAnimationPage(Model model){
        model.addAttribute("title","Animation");
        return "animation";
    }
}
