package pag_1Begin;

/**
 * Created by Гріша on 23.05.2017.
 */
public class MathOp {
    public static void main(String args[]) {
        int k;
        int a = 25;
        int b = 15;

        k = a + b;
        System.out.println("Сума:  а + b = " + k);
        System.out.println("Добуток:  a * b = " + a * b);
        System.out.println("Результат ділення цілочисельних: а / b = " + a / b); //дробова частина відкидається
        System.out.println("Залишок по модулю:  a % b = " + a % b);
    }
}
