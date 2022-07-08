package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections7LinkedHashMapTreeMap {
    public static void main(String[] args) {


        //При використанні HashMap не зберігається пордок введення в масив обєкти зберігаться хаотично
        Map<String,String> translations  = new HashMap<>();
        translations.put("Кіт","Cat");
        translations.put("Собака","Dog");
        translations.put("Слон","Elephant");

//        for (Map.Entry entry:translations.entrySet()){
//            System.out.println(entry.getKey()+" : " + entry.getValue());
//        }


        Map<Integer,String> hashMap = new HashMap<>();//Обєкти зберігаються хаоично

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();//В якім порядку були додані обєкти в такім порядку вони будуть повернуті

        Map<Integer,String>  treeMap = new TreeMap<>();//Сортування по ключу


testMap(treeMap);

    }
//Даний метод показує як зберігаються обєкти у кожній з колекції
    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(12,"Mike");
        map.put(78,"Tom");
        map.put(0,"Tim");
        map.put(1500,"Lewis");
        map.put(7,"Bob");

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());

        }
}

}
