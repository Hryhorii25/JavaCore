package pag_1Begin;

/**
 * Created by Гріша on 25.05.2017.
 */
public class If2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        boolean d = false;
        if (a > b || d) {

            System.out.println("if");
        } else {
            if (!d)
                System.out.println("else if ");
            else {
                System.out.println("else");
            }
        }
if (b > a && !d){
    System.out.println("d "+d);

}
    }

}