package org.launchcode.java.demos.lsn3classes1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Course {
    private int studentYear;
    private double requiredCredits = 24;
    HashMap<String, Double> courseList = new HashMap<>();

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int aStudentYear) {
        studentYear = aStudentYear;
    }

    public double getRequiredCredits() {
        return requiredCredits;
    }

    public void setrequiredCredits(Student student) {
        requiredCredits = requiredCredits - student.getNumberOfCredits();
    }

    public HashMap<String, Double> getCourseList() {
        return courseList;
    }

    public void setCourse(String course, Double credits) {
        courseList.put(course, credits);
    }
}
