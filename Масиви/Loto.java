package Масиви;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Loto {
    public static void main(String[] args) {
        Object[] A = new Integer[1000];
        int[] B = {5,22,14,65,44,54,8,9,11,80};
        int b = 80;
        int x ;
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        Iterator iterator = linkedHashSet.iterator();




        for (Object o: linkedHashSet) {
            linkedHashSet.add((int) Math.random());
        }



       A=linkedHashSet.toArray();


        //        for (int i = 0; i < A.length; i++) {
//            x=(int) (Math.random()*b);
//           System.out.println(x);
//            for (int j = 0; j <B.length ; j++) {
//                if (x==B[j]) System.out.println(x+" loto@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ "+i);

                System.out.println(A.length);
                System.out.println(linkedHashSet.size());
        }


    }






//for (int i = 0; i < A.length; i++) {
//          A[i]= (int) (Math.random()*b);
//
//        }
//System.out.println(x);
//        for (int i = 0; i < B.length; i++) {
//        System.out.println(String.valueOf(B[i]));

//        for (int i = 0; i < 1000; i++) {
//            A[i]= (int) Math.random();
//        }



//    //Тут показоно метод пробігання по колекції з допомогою Iterator
//    Iterator iterator = collection.iterator();//Створюється обєкт типу Iterator  і цьому присвоюється повернення методу iterator викликаному на колекції
//        while (iterator.hasNext()){System.out.println(iterator.next());}//Пробігання по елеметам колекції циклом з виводом на екран
//
//                for (String s: collection1){System.out.println(s);}//Другий спосіб пробігання по колекції