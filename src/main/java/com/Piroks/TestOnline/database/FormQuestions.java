package com.Piroks.TestOnline.database;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FormQuestions{
    private List<FormQuestion> formData;

    public List<FormQuestion> getFormData() {
        return formData;
    }

    public String getTest(){
        if(!formData.isEmpty())
            return formData.get(0).toString();
        return "It is empty!";
    }

    public void setFormData(List<FormQuestion> formData) {
        this.formData = formData;
    }

//    @Override
//    public String toString() {
//        return this.formData.stream().map(x -> x.toString()).collect(Collectors.joining());
//    }
}