package com.Piroks.TestOnline.database;

public class CheckedQuestion {
    private String selected;
    private String correct;
    private String question;
    private int choice;
    private int points;

    public CheckedQuestion(){}
    public CheckedQuestion(String selected, String correct, int choice,int points,String question){
        this.selected = selected;
        this.correct = correct;
        this.choice = choice;
        this.points = points;
        this.setQuestion(question);
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getChoice() {
        return choice;
    }
    public int getChoicePoints() {
        return Math.max(choice, 0);
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
