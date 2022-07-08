package String;

/**
 * Created by Гріша on 21.06.2017.
 */
public class Begin2 {
    public static void main(String[] args){

                                                                  // System.out.printf викорстовується для форматування тексту при виводі
        System.out.printf("Thsis is %d a string, %s\n",10,"NiSE");//За допомогою %s можна вставляти різні значення у строку
                                                           //буква після знаку % відповідає типу змінної яка буде вставлена
                                                            // \n здійсню перенос на іншу строку

        System.out.printf("String %-10d\n",5);// Значення %10d буде виділяти наступному запису велечину рядка 10 знаки+- відповідають з якої сторонибудуть відображатися цифри
        System.out.printf("String %-10d\n",10);
        System.out.printf("String %-10d\n",100000);
        System.out.printf("String %-10d\n",10466456);
        System.out.printf("String %-10d\n",1045654645);



        System.out.printf("Заукруглення");

        System.out.printf("String %.0f\n",10.466456);
        System.out.printf("String %.2f\n",10.466456);//Заукруглення чисел
        System.out.printf("String %.4f\n",104.565);


    }}
