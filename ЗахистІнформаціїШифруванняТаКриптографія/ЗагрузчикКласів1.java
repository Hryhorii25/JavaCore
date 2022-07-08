package ЗахистІнформаціїШифруванняТаКриптографія;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.Policy;

/**
 * Created by Гріша on 04.12.2017.
 */
public class ЗагрузчикКласів1 {
}
//Реалізація захисту інформації на JAVA
//Для релізації захисту в JAVA викоритовують декілька механізмів переший із них це (class loader) загрузчик класів
//Для виконня будь якої програми на JAVA порібно використовувати класи написні самим програмістом або зашиті в бібліотеках JAVA
 //Коли іде виконання програми віртуальна машина через загрузчик класів підгружає класи які потрібні для роботи програми і дані
 // класи проходять ніби через сито контролю яке поеревіряє безпечність даного класу.
//Є декілька видів загрузчика класів кожен з яких виконує якусь свою певну функцію:

//1)Bootstrap class loader (реалізований на мові C) являє собою невідємну частину віртуальної машини виконує заргузку файла rt.jar
// це як правило системні класи

//2)Extennsion class loader (розширений загрузчик класів) від підружає усе із jre.lib.ext

//3)System class loader основний загрузик класів який загружає прикладні класи із бібліотеки JAVA

//4)Plagin class loader являє собою власний клас зарузки  в якому можна реалізувати якусь свою логіку роботи



//Приклад реалзілації class loader
class Main extends Policy{public static void main (String[] args ) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
    URLClassLoader pluginClassLoader = new URLClassLoader(new URL[]{new URL("Шлях до файлу")});
    Class cl=pluginClassLoader.loadClass("myClass");
    cl.newInstance();
}



//Приклад створення власного  class loader з для реалізації власної логіки
}
class MyLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}