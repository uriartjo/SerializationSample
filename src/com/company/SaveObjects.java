package com.company;

import java.io.*;

public class SaveObjects {
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutput = null;
    Object objectToSave = null;

    public SaveObjects(String fileName, Object object) {
        try {
            fileOutputStream = new FileOutputStream(new File(fileName+".txt")); //Subclass of output stream
            objectOutput = new ObjectOutputStream(fileOutputStream); //Allows you to write out objects, we wrap FileOutputStream in an objectoutput object
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        objectToSave = object;
    }

    public void executeSave() {
        try {
            objectOutput.writeObject(this.objectToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
