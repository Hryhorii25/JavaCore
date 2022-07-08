package pag1ОПП;

/**
 * Created by Гріша on 17.06.2017.
 */
public class Інкапсуляція {
    public static void main(String[] args){

        Person person1=new Person();
        //person1.name="";
        //person1.age=-5;
         person1.setName("Імя");
         person1.setAge(-3);
         person1.speak();//Вивід значень через створений  метод
        // System.out.println(person1.getName());//Вивід значень через метод main
         //System.out.println(person1.getAge());

        class Person{
            private String name;
            private int age;

            public void setName(String username){//Створення сетеру
                name=username;
            }
            public String getName(){//Створення гетера
                return name;
            }
public void setAge(int userAge){//Створення сетеру
    age=userAge;
}

public int getAge(){//Створення гетера

    return age;
}

}


    }
}


