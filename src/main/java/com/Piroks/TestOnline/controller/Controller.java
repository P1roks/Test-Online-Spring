package com.Piroks.TestOnline.controller;

import com.Piroks.TestOnline.Service;
import com.Piroks.TestOnline.database.FormQuestions;
import com.Piroks.TestOnline.database.Question;
import com.Piroks.TestOnline.database.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public String check(Model model, @ModelAttribute Questions checked){
        int maxPoints = checked.getQuestions().stream().mapToInt(Question::getPoints).sum();
        int gainedPoints = checked.getQuestions().stream().mapToInt(Question::getChoicePoints).sum();
        model.addAttribute("maxPoints",maxPoints);
        model.addAttribute("gainedPoints",gainedPoints);
        return "check.html";
    }
}
