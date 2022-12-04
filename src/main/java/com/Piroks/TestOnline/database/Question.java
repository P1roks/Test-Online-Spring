package com.Piroks.TestOnline.database;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String question;
    @Column(nullable = false)
    private String optionA;
    @Column(nullable = false)
    private String optionB;
    @Column(nullable = false)
    private String optionC;
    @Column(nullable = false)
    private String optionD;
    @Column(nullable = false)
    private byte corrIdx;
    @Column(nullable = false)
    private byte points;
    @Lob
    private byte[] image;


    @Override
    public String toString() {
        return String.format("Question [id = %d, question = %s, optionA = %s, optionB = %s, optionC = %s," +
                " optionD = %s, corrIdx = %d, points = %d]",
                this.getId(),this.getQuestion(),this.getOptionA(),this.getOptionB(),this.getOptionC(),
                this.getOptionD(),this.getCorrIdx(),this.getPoints());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public byte getCorrIdx() {
        return corrIdx;
    }

    public void setCorrIdx(byte corrIdx) {
        this.corrIdx = corrIdx;
    }

    public byte getPoints() {
        return points;
    }

    public void setPoints(byte points) {
        this.points = points;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}
