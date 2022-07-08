package GenericsЗадачаПроРобота;
//У даній програмі розгладається використання параметризації generics. Задача полягає в тому щоб скласти роботів з двох частин голови і корпуса.
//Корпус у нас один а голови для робота можна вибирати у кожної голови різні можливості(методи), щоб створювати таких роботів використаєм generics
// у клас робот вводять змінну T і дану змінну присвоюємо голові яка буде змінюватись відносно того що нам потрібно
//www.youtube.com/watch?v=5gU2wrQnbJs
public class GenericsProgramRobot {
    public static void main(String[] ards) {
        Body body = new Body();
        Head1 head1 = new Head1();
        Head2 head2 = new Head2();
        Head3 head3 = new Head3();
Legs legs = new Legs();
Robot robot3 = new Robot (body,head1);

Robot<Head1> robot = new Robot<Head1>(body,head1);
Robot<Head2> robot1 = new Robot<Head2>(body,head2);
robot.getHead().say1();
robot1.getHead().say2();




    }
}

 class Robot<T extends Head>{//Вводим в клас параметер Т даний парамер дозволяє змінювати  поля створюваного обэкта Якщо добавити extends
                             // в записі тоді змінний тип можна буде внносити обєкти тільки цього типу Head а також його наслідників
    private Body body;
    private T head;// Запис означає що поле head буде мати змінні параметри (змінний тип)

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }




}




class Body{}


    class Head{}

class Head1 extends Head{
    public void say1(){
        System.out.println("Робот 1");}
}

class Head2 extends Head{
    public void say2(){System.out.println("Робот 2");}
}


class Head3 extends Head{
    public void say3(){System.out.println("Робот 3");}
}



class Legs{

}