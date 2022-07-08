package pag_1Begin;

/**
 * Created by Гріша on 23.05.2017.
 */

public class Arifmetica {

    public static void main(String[] args) {
        int helium = 2;
        int beryllium = 4;
        int oxygen;
        int sulfur;
        int germanium;
        Arifmetica a = new Arifmetica();
        oxygen = helium * beryllium; // x = 2 * 4 = 8
        sulfur = beryllium*4; //x = 4 * 4 = 16
        helium  = sulfur/oxygen; //2 = 16 / 8
        germanium = (2*sulfur) + oxygen + beryllium + helium - (sulfur - helium); //x = 16*2 + 8 + 4 + 2 - (16 - 2) = 32
        System.out.println(germanium); //Заметьте, println() может печатать на консоль всё что угодно включая числа

    }

}
