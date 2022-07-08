package ReflectionРефлексія;

import java.lang.reflect.*;

//В даній темі розгладається рефлексія(Reflection).Рефлексія дозволяє зайти  в закритий недоступний клас і отримати доступ до всіх полів
// і методів, конструкторів  каласу тобто дозволяє працювати з даним класом
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
SomeClass someClass = new SomeClass();//Створення обєкта недоступного  класу

//Є декілька способів рефлексії(доступу до якось класу);
        Class class1 = someClass.getClass();//1)Доступ до закритого класу через створення іншого класу і виклику метода getClass на обєкті
      //Class class2 = Class.forName("ReflectionРефлексія.SomeClass");
      Class class3 = SomeClass.class;
    SomeClass someClass1 = (SomeClass) class1.newInstance();
    System.out.println(class1.getName());//Метод який виводить імя класу

    //Рефлексія доступ до конструкторів,полів,методів
        Constructor[] constructors = class1.getConstructors();
        Constructor[] constructors1 = class1.getDeclaredConstructors();
        Field[] fields = class1.getFields();
       Method[] methods = class1.getMethods();

       //Цикли які виводять потрібні параметри
       for (Constructor constructor:constructors){System.out.print(constructor.getName());
        Parameter[] parameters = constructor.getParameters();
        for (Parameter parameter:parameters){
        System.out.println(parameter.getName());
        System.out.println(parameter.getType().getName());

//Цикл якій виводить параметри метода
        for (Method method :methods){System.out.println(method.getName());
           // System.out.println(method.getParameters());

        }

        }

       //Робота з філдами
           Field[] fields1 = class1.getFields();
           for (Field field:fields){
               System.out.println(field.getName());
               System.out.println(field.getType());
               System.out.println(Modifier.toString(field.getModifiers()));

               //Доступ до приватних полів

           field.setAccessible(true);//Щоб отримати доступ до приватних полів класу потрібно поставити true в данім методі
field.setInt(someClass, 5);//Давши доступ проводим дії з класом міняючи значення

           }
       }}





//1)Створення класу до якого потрібно дістати доступ через рефлексію
static class SomeClass{
    private int i;
    String s;
    public SomeClass() {}

    public SomeClass(int i, String s) {
        this.i = i;
        this.s = s;
    }
public String Somemetod(String s)
{System.out.print(s);
    return s;}


}}