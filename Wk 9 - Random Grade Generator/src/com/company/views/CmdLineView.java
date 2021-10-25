package com.company.views;

public class CmdLineView {
    private String studentName;
    private int score;
    private String grade;

    public CmdLineView(String studentName, int score, String grade) {

        this.studentName = studentName;
        this.score =score;
        this.grade = grade;
    }

    public void printStudentInfo() {
        System.out.printf("%-17s%5d%16s\n",studentName,score,grade);
        //System.out.print(studentName + "    " + score + "    " + grade);
           // System.out.print("\n");
    }
    public void printHeader() {
        System.out.println("Student name     Percentage        Grade");
        System.out.println("____________     __________        _____");
        System.out.print("\n");
    }
}
