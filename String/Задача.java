package String;

/**
 * Created by Гріша on 18.06.2017.
 */
public class Задача {
    public static void main(String[] args) {
        String s ="Javajava";//Створення строки
        char searchChar = 'v';
        boolean  isFound = false;
        for (int i =0;i<s.length();i++){

if (s.charAt(i)==searchChar){
    isFound = true;
    break;
}
        }
        System.out.println(message(isFound));
}

    static String message(boolean isFound){
        return " Ваш символ " +(isFound ? "  " :  "не " )+ "був знайдений";
    }
}
