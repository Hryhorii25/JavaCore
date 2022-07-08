package Потоки26ГрупиПотоків;
//Потоки які виконують схожу по функціоналу роботу можуть бути обєднані в групу потоків для цьго є спеціальний клас TheadGroup
public class Main {public static void main(String[] args){
   ThreadGroup threadGroup = new ThreadGroup(" ");
  Thead1 thead1 = new Thead1();
}}

class Thead1 extends Thread {

    @Override
    public void run() {
        String groupName = "Threadgroup";
        ThreadGroup g = new ThreadGroup(groupName);
        if (g.activeCount()==0);//Даним метом можна перевірити чи є активні потоки у даній групі
        g.interrupt();// перериває усі потоки у даній групі

        }

    }







