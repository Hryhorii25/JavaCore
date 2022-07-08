package Collections;
// Щоб пройтися по елементам колекції найчастіше використовують спосіб використяння ітератора, який придставляє собою обєкт, реалізуючий один
// із двох інтефейсів Iterator або ListIterator.Ітератор дозволяє організовувати цикл для проходу по колекції, отримаючи або видаляючи елементи.
// ListIterator розширює Iterator дл забезпечення двохнаправленого проходу по списку.
//Методи 481 Шилд

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ДоступДоКолекційЧерезІтератори {public static void main (String[] args ) {

    //Демонстрація прикладу використання ітератора


    ArrayList<String> al = new ArrayList<String>();
    //Додавання елеметів в колекцію
    al.add("F");
    al.add("H");
    al.add("C");
    al.add("D");
    al.add("B");
    al.add("A");
    Iterator<String> itr =al.iterator();
    while (itr.hasNext()){
        String element = itr.next();
        System.out.print(element+"");
    }
System.out.println("");
    ListIterator<String> litr= al.listIterator();
    while (litr.hasNext()){
        String element = litr.next();
        litr.set(element + "+");
        System.out.print("Модифіковане вмістиме al");
    }
itr=al.iterator();
    while (itr.hasNext()){
        String element = itr.next();
        System.out.print(element+"");
    }



}}
