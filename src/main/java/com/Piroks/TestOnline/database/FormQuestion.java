package com.Piroks.TestOnline.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
public class FormQuestion {
    @Id
    private int id;
    private int choice;

    public FormQuestion(int id, int choice) {
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
        return String.format(" id = %d choice = %d", this.id, this.choice);
    }
}
