package Collections;

import java.util.HashMap;
import java.util.Map;

//Maps це є сховище обєктів у яке можна помістити і витягти обєкти по певному ключі використовується переважно для
// зберігання чогось в базі даних
public class MapProgram {
    public static void main(String[] args){
        Book book =new Book("Karnagi","Hay to get froinds");
        Book book1 =new Book("Xornel","JAVA");
        Tiked tiked = new Tiked(10);
        Map<Tiked, Book> libery = new HashMap<>();//Створення Maps сховища обєктів класу Book,із стрінговим ключом запису
        libery.put(tiked,book);//Метод який записує обєкти у Maps у якості ключа виступає поле name


        //Колекції.Book karnagiBook= libery.get(book.name);// Метод який витягує обєкти із Maps через поле name
        //System.out.println(karnagiBook);
        Book karnagiBook= libery.get(tiked);
        System.out.println(karnagiBook.name);



    }
}
class Book {
    String autor;
    String name;

    public Book(String autor, String name) {
        this.autor = autor;
        this.name = name;
    }
}
class Tiked {
    int number;

    public Tiked(int number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tiked tiked = (Tiked) o;

        return number == tiked.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}