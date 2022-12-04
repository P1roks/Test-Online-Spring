package com.Piroks.TestOnline.database;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Questions {
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
