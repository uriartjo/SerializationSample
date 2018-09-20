package com.company;

import java.io.*;
import java.util.ArrayList;

public class StudentRoster implements Serializable {
    String rosterName;
    ArrayList<Student> studentRoster;

    public StudentRoster(String rosterName) {
        this.rosterName = rosterName;
        studentRoster = new ArrayList<>();
    }

    public StudentRoster() {

    }

    public void saveRoster() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.rosterName+".txt")); //Subclass of output stream
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream); //Allows you to write out objects, we wrap FileOutputStream in an objectoutput object
            objectOutput.writeObject(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StudentRoster loadRoster(String rosterName) { //Could put this in as a constructor
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(rosterName+".txt"));
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            StudentRoster loadedRoster = (StudentRoster) objectInput.readObject();
            System.out.println("Loaded Roster Successfully");
            return loadedRoster;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
