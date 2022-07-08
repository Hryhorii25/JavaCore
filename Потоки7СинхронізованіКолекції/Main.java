package Потоки7СинхронізованіКолекції;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Гріша on 26.10.2017.
 */
public class Main {
    public static void main(String[] args) {
Namelist namelist =new Namelist();
namelist.add("first");

class MyThead extends   Thread{
    @Override
    public void run() {
        System.out.println(namelist.removeFirst());
    }
}
  MyThead myThead = new MyThead();
myThead.setName("one");
        myThead.start();
     new MyThead().start();

    }
    static class Namelist {
        private List list = Collections.synchronizedList(new ArrayList<>());// Створення колекції у якій усі методи будуть синхронізовані

        public void add(String name) {list.add(name);
        }


        public synchronized String removeFirst() {
            if (list.size()>0)
            {if ( Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
                return (String) list.remove(0);


        }
            return null;


        }
    }
}

