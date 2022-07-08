package Серіалізація3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Color color = new Color("red");

        Dog dog = new Dog(color,7);

        try {
            FileOutputStream fs = new FileOutputStream("fileSer.txt");

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(dog);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try

        {
            FileInputStream fileInputStream = new FileInputStream("fileSer.txt");
            ObjectInputStream ios = new ObjectInputStream(fileInputStream);
            dog = (Dog) ios.readObject();
                ios.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("dog:  "+ dog.getAge() + " name: " +dog.getColor().getName());}
}