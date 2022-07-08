package pag1ОПП;

/**
 * Created by Гріша on 07.06.2017.
 */
public class Begin {
    public static void main (String[] ards){

        class Person {   //1)Створємо клас з полями (параметрами)
            public String name ="Vova";//Поле1
            public int age = 25;//Поле2
            public int vusota = 180;//Поле3 //2)Добавляєм поля(параметери) цьому класу дані параметери за замовчуванння будуть передаватися кожному обєкту цьго класу.
            void  say(String name){System.out.println("Hellow,"+ name); }//5)Створення метода,Функції(дії) у класі

            int obraxunoc() {  //
    int year = 70 - age;        //7)Створення методу який обраховує і повертає певне значення в програму
    System.out.println("Повернене значення "+year);//
                return year;//
            }



        }



        Person vova = new Person(); //3)Створення обєкта класу Person назва обєкта (vova)
        vova.vusota =120;//Змінення параметру  поля конкретного обєкта
        System.out.println( vova.vusota+vova.age);//4)Виводимо поле обєкта vusota яке э зміненим
        Person vlad = new Person();//Створення ще одного обєкта у класі Person
        System.out.println();//Вивід поля vusota значення передається за замовчуванням від параметра класу
        vova.say("Vasa");//6)Використання методу заданого у класі.Іде вилик медоду у обєкта vova даний метод нічого не портає в програму
    int year=vlad.obraxunoc();//7)Виклик методу з повернення значення в програму і одночасне присвоєння поверненої величини змінні int year
        int year2= 100 - vova.age;//8)Створення процедури 7) у public static void main на другому обєкті


    }
}



//void  say(String name){System.out.println("Hellow,"+ name);Розбір метода: void означає що метод нічого не поветає у програму
                                                             //а тільки виводить значення на екран