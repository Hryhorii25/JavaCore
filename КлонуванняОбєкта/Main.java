package КлонуванняОбєкта;
//Клонування обєктів буває двух видів просте(примітиве) і сладне (глибоке клонування)
//Просте це коли в обєкта який клонують є тільки прості поля(int,double...)
//Складне це коли у обєкта є ссилочні поля(String,Integer, Character...)
public class Main {
    public static void main (String[] args ) throws Exception {
 Myobgect myobgect= new Myobgect();
        myobgect.i =1;
        Myobgect myobgect1= myobgect;//Створення двох обєктів їхні поля будуть однакові адреса цих обєктів ведуть в одне місце памяті
        // коли міняється значення поля в однім обєкті воно міняється і в інших обєктах
        myobgect1.i=2;
        Myobgect myobgect2= myobgect.clone();//Тут відбувається просте клонування обєкта методом clone() на обєкті клон якого потрібно створити
        // тепер це різні обєкти які перебувають у різних місцях памяті із незалежними значеннями полів
myobgect2.i=5;
System.out.println(myobgect.i);
System.out.println(myobgect2.i);


//Складне клонування обєкта
NewObgect newObgect = new  NewObgect();
NewObgect newObgect1 =newObgect.clone();







    }}
