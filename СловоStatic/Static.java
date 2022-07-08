package СловоStatic;

/**
 * Created by Гріша on 20.06.2017.
 */
public class Static {
    public static void main (String[] args ) {

        Human human1=new Human("Vova",25);
        human1.getInfo();
        Human human2=new Human("Ivan",30);

        human2.getInfo();
        Human.deskription="Clin";//Дану перемінну можна викликати зразу із Класу
                                 // без присвоєння обєкту вона  належить усьому класу і при ініціалізації буде
                                // присвоїна усім обєктам класу
           Human.getDescription();//Даний статичний метод викликається одразу в класі
        human1.getDescription();//Виклик статичного метода в обєкті
//Human.deskription="Hepi";//Зміна статичного поля через клас
human1.printNumberpipl();
human2.printNumberpipl();


        //System.out.println(human1.);
    }}
class Human {
    private String name;
   private int age;
  public static String deskription="Hapi";//Створення статичної перемінної(поля)
    private static int countPeople;




    public Human(){};
   public Human(String name, int age ){
       this.name=name;
       this.age=age;

   countPeople++;}


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("Імя " + name + " Вік " + age + "Стан "+deskription);
    }
public static void getDescription(){
        System.out.println(deskription);
}//Створення статичного методу
static void printNumberpipl(){
    System.out.println("Number of people is"+countPeople);
}


}

