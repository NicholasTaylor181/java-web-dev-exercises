package org.launchcode.java.demos.lsn3classes1;

import com.sun.tools.jconsole.JConsoleContext;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student nickTaylor = new Student();
        nickTaylor.setName("Nick Taylor");
        nickTaylor.setStudentId(6);
        nickTaylor.setNumberOfCredits(89);
        nickTaylor.setGpa(4.0);
        System.out.println(nickTaylor.getNumberOfCredits());

        Student nicholasTaylor = new Student();
        nicholasTaylor.setName("Nicholas Taylor");
        nicholasTaylor.setStudentId(6);
        nicholasTaylor.setNumberOfCredits(8);
        nicholasTaylor.setGpa(3);

        System.out.println(nickTaylor.equals(nicholasTaylor));
        Course highSchool = new Course();
        highSchool.setStudentYear(1);
        System.out.println(highSchool.getRequiredCredits());
        highSchool.setCourse("history", 1.0);
        highSchool.setCourse("math", 1.0);
        highSchool.setCourse("english", 1.0);
        highSchool.setCourse("science", 1.0);
        highSchool.setCourse("music", 0.5);
        highSchool.setCourse("P.E.", 0.5);
        highSchool.setCourse("computers", 1.0);

        highSchool.setrequiredCredits(nickTaylor);
        System.out.println(highSchool.getRequiredCredits());

        nickTaylor.addGrade(3, 3);
        System.out.println(nickTaylor.getGradeLevel());
        System.out.println(nickTaylor);


        Teacher john = new Teacher();
        john.setFirstName("John");
        john.setLastName("Smith");
        john.setSubject("Science");
        john.setYearsTeaching(5);

        System.out.println(john.getFirstName());
        System.out.println(john.getLastName());
        System.out.println(john.getSubject());
        System.out.println(john.getYearsTeaching());

    }
}
