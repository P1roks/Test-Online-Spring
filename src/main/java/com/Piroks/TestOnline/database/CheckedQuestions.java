package com.Piroks.TestOnline.database;

import java.util.ArrayList;
import java.util.List;

public class CheckedQuestions {
    private List<CheckedQuestion> questions;

    public CheckedQuestions(){
        this.questions = new ArrayList<CheckedQuestion>();
    }
    public List<CheckedQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<CheckedQuestion> questions) {
        this.questions = questions;
    }
}
