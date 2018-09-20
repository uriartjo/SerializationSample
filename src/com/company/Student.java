package com.company;

import java.io.Serializable;

public class Student implements Serializable {

    public String name;
    public String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        this.name = null;
    }

    public void saveStudent() {
        SaveObjects save = new SaveObjects(this.name,this);
        save.executeSave();
    }

    public Object loadStudent(String studentName) {
        LoadObjects load = new LoadObjects(studentName);
        return load.executeLoad();
    }
}
