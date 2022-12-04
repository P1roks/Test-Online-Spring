package com.Piroks.TestOnline.controller;

import com.Piroks.TestOnline.Service;
import com.Piroks.TestOnline.database.FormQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service serv;
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/error")
    public String err(){
        return "error.html";
    }

    @RequestMapping("/{questNo}")
    public String test(@PathVariable(value="questNo") int number, Model model){

        var questions = serv.getQuests(number);
        model.addAttribute("allQuestions",questions);

        return "test.html";
    }

    @PostMapping("/check")
    public String check(Model model, @ModelAttribute FormQuestions test){
        //TODO: Get all the answers to questions previously submitted by the user and then calculate the number of the correct answers
        return test.toString();
    }
}
