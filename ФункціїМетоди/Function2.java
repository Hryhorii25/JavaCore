package ФункціїМетоди;

/**
 * Created by Гріша on 07.06.2017.
 */
public class Function2 {

    public static void main(String[] args) {
      int temp = func (3, 4); //a це число b це степінь піднесення
    System.out.println(temp);
    }

     public static int func (int a,int b){ // Коли в даному рядку прописуємо public static int
                                          // дана функція стане публічною і буде брати параметри з фунції яка прописана вище
        int result = 1;                   // public static void main(String[] args) {
                                         // int temp = func (3, 4);
        for (int i = 0; i < b; i++)
            result *= a;
        return result;

    }
}