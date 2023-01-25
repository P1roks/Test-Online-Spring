package com.Piroks.TestOnline.database;

public class CheckedQuestion {
    private String selected;
    private String correct;
    private int choice;
    private int points;

    @Override
    public String toString() {
        return String.format("CheckedQuestion [selected = %s, correct = %s, choice = %d, points = %d]",this.selected,this.correct,this.choice,this.points);
    }

    public CheckedQuestion(){}
    public CheckedQuestion(String selected, String correct, int choice,int points){
        this.selected = selected;
        this.correct = correct;
        this.choice = choice;
        this.points = points;
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
}
