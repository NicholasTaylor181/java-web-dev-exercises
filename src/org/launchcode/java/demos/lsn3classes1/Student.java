package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public String getGradeLevel()  {
        if (getNumberOfCredits() > 89){
            return "Senior";
        }else if (getNumberOfCredits() > 59) {
            return "Junior";
        }else if (getNumberOfCredits() > 29) {
            return "Sophomore";
        }else {
            return "Freshman";
        }

    }

    public void addGrade(int credits, int numGrade) {
        double currentQualityScore = getGpa() * getNumberOfCredits();
        currentQualityScore += (credits * numGrade);
        setNumberOfCredits(credits + getNumberOfCredits());
        double newGpa = currentQualityScore / getNumberOfCredits();
        setGpa(newGpa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}



