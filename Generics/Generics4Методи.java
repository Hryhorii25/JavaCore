package Generics;

import java.util.ArrayList;
import java.util.List;

//Дженерік методи це методи які можуть приймати загальні типи параметрів та повертати загальний тип параметрів
public class Generics4Методи {
    public static void main (String[] ards) {
    }


    //Загальний запис методу при використанні дженеріка(запис джнерік методу не в дженерік класі)
    <T> T metod(T t){
        return t;
}




}class Cell1<Y>{
    Y y;

    public Cell1(Y y) {
        this.y = y;
    }
    <P> P metod(P p){        //У даному класі можна створювати метод який має оремі дженеріки від класу або локальні дженерикі

        return p;
    }


}


class Utilities {


    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}

class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        System.out.println("Список до обработки дженерик-методом: " + intList);
        Utilities.fill(intList, 0);
        System.out.println("Список после обработки дженерик-методом: "
                + intList);
    }
}