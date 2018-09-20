package com.company;

import java.io.*;

public class LoadObjects {
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInput = null;
    Object objectToLoad = null;

    public LoadObjects(String studentName) {
        try {
            fileInputStream = new FileInputStream(new File(studentName+".txt")); //Can be any file extension, most use .ser
            objectInput = new ObjectInputStream(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object executeLoad() {
        try {
            Object loadedObject = objectInput.readObject();
            return loadedObject;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
