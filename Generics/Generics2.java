package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Гріша on 30.08.2017.
 */
public class Generics2 {
    public static void main (String[] ards) {
        //До появи дженеріків
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
    String animal=(String) animals.get(1);//Утакому випадку потрібно робити кастинг
    System.out.println(animal);

    //З появою дженеріків
        List<String>animals2= new ArrayList<String>();//При використанні дженериків в дану колекцію можна буде помістити тільки String
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        String animal2 = animals2.get(1);


        //Запис в JAVA 7
        List<String>animals3= new ArrayList<>();

    }
}
