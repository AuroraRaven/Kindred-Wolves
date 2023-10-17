package com.aurora.art_website.controllers;

import com.aurora.art_website.models.Print;
//import com.aurora.art_website.models.dto.PrintFormDTO;
//import com.aurora.art_website.models.dto.PrintFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/print")
@Controller
public class PrintController {
    @GetMapping
    public String displayPrintPage(Model model) {
        model.addAttribute("title", "Digital Art Prints");
        return "print";

    }

//    @GetMapping
//    public String displayPrintForm(Model model) {
//        model.addAttribute(new PrintFormDTO());
//        return "print/addPrint";
//    }

}

