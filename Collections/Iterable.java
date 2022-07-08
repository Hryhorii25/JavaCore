package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //З використанням ітератора можна проходячи циклом по колекціх змінювати значення у колекції
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());



        for (int x:list)
            System.out.println(x);
    }
}
