package Exceptions;

//https://www.youtube.com/watch?v=mLpMtc62530
// https://www.youtube.com/watch?v=64hA_lXw-gk
// https://www.youtube.com/watch?v=odgwVoWPU0Y
//https://www.youtube.com/watch?v=DElNhj71YCk
//https://www.youtube.com/watch?v=jL7-VdBeh9s
//https://www.youtube.com/watch?v=P7dByA1rz5c
//https://www.youtube.com/watch?v=9gw81XDJoKs

//Усі виключення в JAVA діляться на Checked і Unchecked
//Checked це виключення під час  написання програми
//Unchecked(Runtaime exeptions) це виключення під час виконання, компіляції програми

public class CheckedAndUncheckedExceptions {
    public static void main(String[] ards) {

   //Найчастіші Unchecked(Runtaime exeptions) виключення
        //String name = null;//Зсилання на нуль
        //name.trim();

int[] array= new int[2];
System.out.println(array[3]);//Вивід нескінченного поля масиву або вихід за межі масиву
    }
}
//Основні правила при роботі з exeptions
//Завжди де потрібно пропрацьовувати виключення їх не потрібно ігнорувати просто викинувши виключення в головний метод
// або просто записати блок trye catch і не прписати ніякої логіки або логера
//завжди порібно логірувати уcі значення