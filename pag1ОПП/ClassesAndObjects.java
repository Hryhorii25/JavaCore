package pag1ОПП;

/**
 * Created by Гріша on 24.05.2017.
 */
public class ClassesAndObjects {
    public static void main(String[] args){

        Person person1 = new Person();
        person1.setName(" V ");
        person1.setAge(30);
        System.out.println("Виводим значення в main методі" + person1.getName());
        System.out.println("Виводим значення в main методі" + person1.getAge());
        person1.speak();



    }
}
class Person {
    private String name;   // Створення класу
    private int age;

    public void setName(String username) {
        name = username;
    }//Створення методів  Setery i Getery
        public String getName(){
            return name;
    }
    public void setAge(int userAge){
            age = userAge;
    }
    public int getAge(){
        return age;
    }
    public void sayHello(){System.out.println("hello");}

    void speak(){ //  Створення методу
        System.out.println("Мене звати "+name + ",мені "+ age + " років");
    }
}

