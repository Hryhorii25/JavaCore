package Collections;

import java.util.Stack;

//Stack це реалізація черги(queue) в інтефейсі List  останній приходить перший іде має синхронізовані методи (робота з потоками)
public class Collections15Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);//Добавляє елемент в стек
    stack.push(3);
    stack.push(1);

       // System.out.println(stack.pop());//Дістає останній елемент з колекції
        System.out.println(stack.peek());//Показує останній елемент з колекції

        //Цикл який дістає елементи з кінця
        while (!stack.empty()){
            System.out.println(stack.pop());
        }


    }
}
