package ФункціїМетоди;
//Фунція яка знаходить спепінь числа
public class Function1 {
    int a =1;

public static void main (String[] args) {
    func(3, 4); //a це число b це степінь піднесення
}
    public static void func (int a, int b) {
    int result = 1;
    for (int i = 0; i < b; i++)
        result *= a;

        System.out.print(result);

    }
}



