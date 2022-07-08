package pag_1Begin;

/**
 * Created by Гріша on 24.05.2017.
 */
public class OperatorBreak {
    public static void main(String[] args) {
   int i = 0;
        while(true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
            System.out.println("Вихід із циклу");

    }
}
