package pag1ОПП;

/**
 * Created by Гріша on 19.06.2017.
 */
public class SetGet {
    public static void main (String[] ards){

        Humans humans1 = new Humans();
         humans1.setAge(25);
        humans1.setName(" ");
        Humans humans2 = new Humans();
        humans1.getInfo();
//System.out.println("Звати "+ humans1.getName()+" Років "+humans1.getAge() );

    }}

class Humans {
   private String name = "Vova";
  private int age = 25;
    public void setAge(int a) {
        if (a<0){System.out.println("Неправильний вік");}
        else
            age = a;
    }


    public void setName(String n) {
       if (n.isEmpty()|n==""|n==" " ){System.out.println("Введено пусте поле");}else //Перевірка чи не введено порожнє значення в поле isEmpty()
    name=n;
    }
    public int getAge(){
        return age;
    }

    public  String getName(){
        return name;
    }

    void getInfo(){
        System.out.println(name+" "+age);}

    }



