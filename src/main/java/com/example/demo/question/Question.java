package com.example.demo.question;

import java.util.ArrayList;

public class Question {
    String imageUrl;
    ArrayList<String> answers;
    String correct;

    public Question() {

    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public Question(String imageUrl, ArrayList<String> answers, String correct) {
        this.imageUrl = imageUrl;
        this.answers = answers;
        this.correct = correct;
    }
}