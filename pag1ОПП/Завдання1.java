package pag1ОПП;

/**
 * Created by Гріша on 11.06.2017.
 */
public class Завдання1 {

    public static void main(String[] args) {

        class Car {

            public int weight = 1800;
            public String model = "Shkoda";
            public char color = 'R';
            public float speed = 123.5f;
            public String name = "Vova";

            public Car() {}//Порожній конструктор даний конструктор передає усі поля класу створеним обєктам

           public Car(int n, String  model,char color,float speed ){//Створення констуктора з полями
weight=n;
           }//Конструктор з параметрами

            void outPut() {System.out.println(model + " weight is " + weight + ", it is colored in " + color + " and it's max speed is " + speed);}
          void setName(String username){name=username;}

       int rozrahunok(){
           int probih = 30000-weight;
           return probih;
           }
        }
        Car vova = new Car();
        //vova.outPut();
Car ivan = new Car();
        ivan.weight = 150;
        //ivan.outPut();
       Car oleg = new Car(6,"Lada",'B',127);
        //oleg.outPut();
    vova.rozrahunok();
    System.out.println();
    vova.setName("Volda");


    }
}