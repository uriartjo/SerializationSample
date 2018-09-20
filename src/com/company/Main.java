package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StudentRoster seniorRoster = new StudentRoster("SeniorClassRoster");
        StudentRoster seniorRosterDuplicate = new StudentRoster();

        Student student1 = new Student("Jimmy","18");
        Student student3 = new Student("Jimmy","18");
        Student student4 = new Student("Jimmy","18");
        Student student2 = new Student();

        seniorRoster.studentRoster.add(student1);
        seniorRoster.studentRoster.add(student2);
        seniorRoster.studentRoster.add(student3);

        seniorRoster.saveRoster();
        seniorRosterDuplicate = seniorRosterDuplicate.loadRoster("SeniorClassRoster");
        System.out.println(seniorRosterDuplicate.rosterName);
        System.out.println("Loaded roster has: " + seniorRosterDuplicate.studentRoster.size());


    }


}
