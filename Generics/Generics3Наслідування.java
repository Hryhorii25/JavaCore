package Generics;

/**
 * Created by Гріша on 10.09.2017.
 */
public class Generics3Наслідування {
    public static void main(String[] ards) {
    }
}


//1)В данім прикладі показано що при наслідуванні нащадок син може мати дженерік якщо у батька його не було
// (це загальне правило наслідування син може бути такий самий як батько або більший ), і то що нащадок може
// не мати дженеріка навіть ящо батько його мав
class Parent{}//Створюємо даний клас який не є дженеріком
class GenParent<T> extends Parent{} //Створюємо другий клас з дженеріком який наслідується від Parent

class Child extends GenParent{}//Строємо ще один калас без дженеріка який наслідується від класу який має дженерік



//2)Інші варіанти наслідування
class Child1 extends GenParent<String>{}
class Child2<T> extends GenParent<T>{}
class Child3<T,Y,O> extends GenParent<T>{}
class Child4<T> extends GenParent{}




//3)Робота з дженеріками при імплементації інтерфейсів
// У даному прикладі створюється інтерфейс який має дженерік тип з певним методом який оперує даним джинеріком
// далі показані можливі способи імплементації даного інтерфейсу із дженеріком

interface GenericInterfice<T>{
    T getT();
}

class One implements GenericInterfice{      //Імплементація при якій дженерік не задіюється ніби його і нема у інтерфейсі
    @Override
    public Object getT() {
        return null;
    }
}



class Two implements GenericInterfice<String>{  //Імплементація при якій дженерік заміняється певним типом тобто у мететоді уже можна
                                                // буде оперувати тільки  певним типом даних
    @Override
    public String getT() {
        return null;
    }
}

class Three<T> implements GenericInterfice<T>{  //Імплементація при якій дженерік передається з інтерфейсу у клас тобто у методі буде оперуватись дженерік типом
    @Override
    public T getT() {
        return null;
    }
}