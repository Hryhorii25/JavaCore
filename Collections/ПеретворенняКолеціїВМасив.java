package Collections;

import java.util.ArrayList;
import java.util.Collection;

//Приклад перетворення колекції в масив
public class ПеретворенняКолеціїВМасив {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();//Створення колекції з використанням дженеріка дану колекцію можна помістити тільки String
       collection.add(1);
       collection.add(2);
       collection.add(3);
       collection.add(4);
    Integer array [] = new Integer[collection.size()];
    array= collection.toArray(array);


    }}
