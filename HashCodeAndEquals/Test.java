package HashCodeAndEquals;

import java.util.*;

//hashCode повертає для обєкта номер згенерованого хеш коду  відносно полів обєкта

//equals даний метод порівнює два обєкти по значеннях полів всередені обєктів




//При роботі із set  колекціями прослідковується закономірність що за правилами set  не повинен добавляти два іденчичні обєкти у колекцію
// але якщо створити власний клас і делька його однакових обєктів( з одинаковими полями ) тоді set бачить кожен з цих обєктів як різні
// обєкти хоч дані обєкти і будуть мати ідентичні поля і добаляє їх в колеккцію. Це відбувається через те що set не заходить в реалізацію
// власного обєкта і не читає його полів set робить висновок що вони різні лиш з того що в памяті це два окремі обєкти які займають окремі адреси памяті.
//Якщо брати вбудовані JAVA класи то обєкти цих класів set розрізняє по внутрішнім полям за рахунок реалізації методів hashcode і equals

//ПРИКЛАД
public class Test{
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person person1 = new Person(1,"Mike");
        Person person2 = new Person(1,"Mike");


        String s = new String("a");
        String s1 = new String("a");




       //Set додає два обєкти з ідентичними полями
        set.add(person1);
        set.add(person2);

//        System.out.println(set);
//      System.out.println(set.size());
     System.out.println(s.equals(s1));
       System.out.println(s.hashCode());
       System.out.println(s1.hashCode());
//        System.out.println(s1.hashCode());

    }}


    //В данім класі були оверайджені методи equals hashCode після цього колекція set може заходити
    // всредени цих обєктів і перевіряти їх поля без оверайду даних методів будуть використовуватися
    // ті методи які реалізовані у класі Object які порівнюють обєкти по розташуванню у комірках памяті
    class Person {
        private int id;
        private  String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person{"+
                "id=" + id +
                ", name=" + name +'/' + '}';
    }


    //Для порівняння обєктів викликються два методи першим викликаються hashCode він швидко перевіряє обєкти і повертає результат
    // якщо даний метод виконався правильно тобто два обєкта мають різний хеш тоді метод equals уже не запускається але якщо ні тоді запускається іще метод equals.
    //Чому викликається саме два метода для порівння дане питання завязано на внутрішній релізації методу hashCode даний метод
    // якщо два обєкта різні повинен видавати різний хеш код обєктів відносно того які поля в обєктів але буває так що у різних
    // обєктів у яких різні значення полів метод hashCode повертає одинаковий хеш код це відбувається через те що хеш код це число яке
    // генерує 32 бітний генератор який зашитий в метод в данім генераторі обжена кількість комбінацій тоді як обєктів з різними
    // варіаціями полів не обмежена кількість тому можуть відбуватись колізії при якийх хеш код двох різних обєктів однаковий.Якщо хеш код
    // обєктів однаковий тоді додатково ще запускається метод equals який ще додатково пробігається по полям кожного обєкта
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }


   //Яким чином працює метод hashCode він конветує будь який обєкт у ціле число відносно значень полів обєкта якщо два обєкта мають
   // ідентичні поля тоді і даний метод вирахує для них однакові числа(за умови що метод hashCode оверайджений)
    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}


