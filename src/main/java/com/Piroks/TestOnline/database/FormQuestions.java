package com.Piroks.TestOnline.database;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

class FormQuestion {
    private int id;
    private int choice;
    public FormQuestion(int id, int choice){
        this.setId(id);
        this.setChoice(choice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return String.format(" id = %d choice = %d",this.id,this.choice);
    }
}

public class FormQuestions{
    private List<FormQuestions> formData;

    public List<FormQuestions> getFormData() {
        return formData;
    }

    public void setFormData(List<FormQuestions> formData) {
        this.formData = formData;
    }

    @Override
    public String toString() {
        return this.formData.stream().map(x -> x.toString()).collect(Collectors.joining());
    }
}