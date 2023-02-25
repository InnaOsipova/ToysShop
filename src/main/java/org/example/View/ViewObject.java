package org.example.View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ViewObject {
    public ViewObject() {
    }

    public void writeObject (Object object, String fileName){

        try {
            //new FileOutputStream(fileName).close();
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(object);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }

    public Object readObject (String fileName){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();

            ois.close();

            return obj;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
