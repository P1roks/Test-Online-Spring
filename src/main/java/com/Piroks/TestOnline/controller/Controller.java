package com.Piroks.TestOnline.controller;

import com.Piroks.TestOnline.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
       //TODO: Get variable number of questions and add them to the response before redirecting user to the website
        //return "TODO.html";

        var questions = serv.getQuests(number);
        model.addAttribute("allQuestions",questions);

        return "test.html";
    }

    @PostMapping("/check")
    public String check(Model model){
        //TODO: Get all the answers to questions previously submitted by the user and then calculate the number of the correct answers
        return "TODO.html";
    }
}
