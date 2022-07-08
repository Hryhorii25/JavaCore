package ХорошийКод;

import java.util.ArrayList;
import java.util.List;

//В даній програмі показано практику використання спеціального метода finalize даний метод дає вказівку на
// запуск інструмента garber colection(збірник мусору), сам запукс garber colection може відбутися а може і ні
public class BestPractice5Finalize {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        List<BestPractice5Finalize> list = new ArrayList<>();
        for (int i = 0;i < 1000000; i++){
            list.add(new BestPractice5Finalize());


        }
    System.out.println(System.currentTimeMillis()- begin);

    }


    //При застусуванні finalize() сильно збільшується час виконня програми


   @Override
  protected void finalize() throws Throwable {
    super.finalize();
    }
    // Є декілька варантів коли потрібно застосовувати  finalize()
    //1)Логірування помилок
    //2)Для нативних методів як деструктори


    //Замість застосування finalize() краще застосовувати внутрішні анонімні класи даний підхід кращий тим що даний метод завжди буде створюватись
    // якщо буде задіючатись зонішній клас
    private  final  Object finalizer = new Object(){
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };






}
