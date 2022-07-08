package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Гріша on 26.09.2017.
 */

//В даній програмі розлядається метод бінарного пошуку даний метод є класичним стандартним методом пошуку елементів по масиву оснований на ділення масиву на половини
public class ListCollectionБінарнийПошук {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
arrayList.add("A");
arrayList.add("B");
arrayList.add("C");
Collections.sort(arrayList);//1)Перешочергово щоб провести бінарний пошук по колекції потрібно її відсортувати

//Collections.binarySearch(arrayList, "B");//2)Метод бінарного пошуку по ключу
  System.out.print(arrayList.get(Collections.binarySearch(arrayList, "B")));
    }
}