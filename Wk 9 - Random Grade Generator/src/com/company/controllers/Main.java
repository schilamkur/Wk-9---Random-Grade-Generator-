package com.company.controllers;

import models.GetPercentage;
import views.CmdLineView;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static  CmdLineView view;
    public static void main(String[] args) {
	// read student names from file
        int score=0;
        String grade = "A";
        GetStudentNames getStudents = new GetStudentNames();
        String[] studentNames = getStudents.getTheStudentNames();

        GetPercentage genRandScore = new GetPercentage(score);

        view = new CmdLineView("", score, grade);
        view.printHeader();
        for(int i = 0; i < studentNames.length; i++) {

            // Random generator - assign score to student
            score = genRandScore.getPercentage();
            // Assign a grade
            grade = genRandScore.getGrade(score);
            //print name, score and grade
            view = new CmdLineView(studentNames[i], score, grade);
            view.printStudentInfo();

        }

    }
}
