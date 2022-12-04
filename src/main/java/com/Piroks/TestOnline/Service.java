package com.Piroks.TestOnline;

import com.Piroks.TestOnline.database.Question;
import com.Piroks.TestOnline.database.Questions;
import com.Piroks.TestOnline.repos.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Question quest;
    @Autowired
    private Questions quests;
    @Autowired
    private QuestionRepo qRepo;

    public Questions getQuests(int number){
        var randomQuests = qRepo.findAll();
        Collections.shuffle(randomQuests);
        randomQuests = randomQuests.subList(0,number);
        quests.setQuestions(randomQuests);
        return quests;
    }
}
