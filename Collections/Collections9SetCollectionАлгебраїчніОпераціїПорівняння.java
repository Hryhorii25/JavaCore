package Collections;


import java.util.HashSet;
import java.util.Set;

//Set колекції можуть брати участь у алгебраїчних операція в теорії множин дані операції використовуються у програмуванні для знаходження
  //різниці та однаковості двох якигось величин або обєктів. В даній програмі за допомогою певних методів буде реалізовані дані операції
public class Collections9SetCollectionАлгебраїчніОпераціїПорівняння {
    public static void main(String[] args) {

      Set<Integer> hashSet1 = new HashSet();

//Створення двох різних Set колекції на основі яких будуть виконкватись операції множин
      hashSet1.add(1);
      hashSet1.add(2);
      hashSet1.add(3);
      hashSet1.add(4);
      hashSet1.add(5);

      Set<Integer> hashSet2 = new HashSet();

      hashSet2.add(6);
      hashSet2.add(7);
      hashSet2.add(3);
      hashSet2.add(4);

//Обєднання - отримання тих елемнів обєкта які різнми однакових береться тільки один екзимпляр
      hashSet1.addAll(hashSet2);

    }
}


//Перетення - отримання тих елементів які є однаковими для двох обєків

//Різність - отримання тих елементів обєкта які є тільки унікальними для одного обєкта ті елементи що повторюються видаляються
