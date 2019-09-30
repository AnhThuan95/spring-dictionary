package com.codegym.controller;

import com.codegym.controller.com.codegym.model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @PostMapping("/dictionary")
    public String searchDictionary(@RequestParam String text, Model model) {
        Dictionary dictionary = new Dictionary();
        model.addAttribute("text", text);
        model.addAttribute("result", dictionary.getValue(text));
        if (dictionary.getValue(text) != null) {
            return "result";
        } else {
            return "notFound";
        }
    }
}
