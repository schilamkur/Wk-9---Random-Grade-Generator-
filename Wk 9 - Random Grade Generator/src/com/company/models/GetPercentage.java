package com.company.models;

import java.util.Random;

public class GetPercentage {
    private int score;

    public GetPercentage(int score) {
        this.score = score;
    }

    public int getPercentage() {
        Random objGenerator = new Random();
        int  randomNumber = objGenerator.nextInt(100);

        score = randomNumber;
        return score;
    }

    public void setPercentage(int score) {
        this.score = score;
    }

    public String getGrade(int score) {

        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else    if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "F";
    }
}
