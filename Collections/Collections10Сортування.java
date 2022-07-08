package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections10Сортування {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("bird");
        animals.add("frog");
        animals.add("cat");
        animals.add("qwertyu");
        animals.add("dog");
        animals.add("a");


       List<Integer> numbers = new ArrayList<>();
       numbers.add(5);
       numbers.add(4);
       numbers.add(3);
       numbers.add(2);
       numbers.add(1);


        ///Даний блок показує що відбувається сортування обєктів у колекції(станртне сортування)
//        System.out.println(animals);
      Collections.sort(animals);//Метод сортування обєктів колекції(по алфавіту)
//        System.out.println(animals);
//
//        System.out.println(numbers);
//        Collections.sort(numbers);//Метод сортування обєктів колекції(по чилах)
//        System.out.println(numbers);


        ///


//Метод проведення сортування із застусування власного типу сортування
        System.out.println(animals);

        Collections.sort(animals,new MyComparatorString());// Для задання власного типу сортування в конструктор даного методу приймає обєкт(колекцію) і обєкт який сортувальником new MyComparatorString
     System.out.println(animals);






     //В данім випадку для релізації власного сортування використовується анонімний клас  не потрібно створювати власний клас і записувати там один метод компаратор
        // а зразу прописувати логіку
        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        });
        System.out.println(animals);

    }
}



//Є такі випадки коли не підходить стандартний спосіб сортування обєктів у колеціях наприклад подрібно сортуати колекцію String по довжині
// строк в такому випадку використовується спеціальний інтерфейс Comparator який можна реалізувати і прописати в нім ту логіку сортування
// колекції яка потрібна для виконня задачі


//Щоб реазіувати власне сортування буде створено новий клас який імплементує Comparator і оверайдить його один метод після цього обєкти даного
// класу зможуть задавати сортування

class MyComparatorString implements Comparator<String> {//<String> це тип обєктів з якими буде працювати даний клас сортування

    // Метод в якім прописується уся логіка сортування даний метод має певні нюанси він може повертати тільки int і приймає завжди два
//     обєкта незалежно від їхніх типів далі в логіці методу прописується яким чином порівнювати дані обєкти результатом порівння цих
//     обєктів є o1>o2 return 1
//                o1<o2 return -1
//                o1==o2 return 0
//    Незалежно від реалізації методу метод має повернути тільки одне з  цих трьох значеннь(1,-1,0)
//    В данім випадку метод релізований так щоб відбувалось сортування по довжині строк

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }


    //Реалізація сортування чисел
    //    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1>o2){
//            return 1;
//        }else if (o1<o2){
//            return -1;
//        }else {
//            return 0;
}
