package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Гріша on 27.09.2017.
 */
public class ListEquals {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        String[] strings= new String[arrayList.size()];
        strings = arrayList.toArray(strings);
        List <String>stringList= Arrays.asList(strings);
        System.out.println(arrayList);//
        System.out.println(arrayList.equals(strings));//

    }
}

