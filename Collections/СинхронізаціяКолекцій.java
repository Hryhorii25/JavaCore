package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Гріша on 14.10.2017.
 */
public class СинхронізаціяКолекцій {
    public static void main(String[] args) {

        HashMap <String,Integer> hashMap = new HashMap <String,Integer>();
        Map<String,Integer> map = Collections.synchronizedMap(hashMap);}}
        //Даний метод дозволяє звертатися до обєкта map з різних потоків
