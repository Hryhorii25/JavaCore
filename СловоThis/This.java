package СловоThis;

//Використання в стеррі і гетері слова this
public class This {
    public static void main (String[] args ) {

Human human1=new Human();
human1.setName("Vova");
human1.setAge(25);
human1.getInfo();
Human human2=new Human();
human2.setName("Ivan");
human2.setAge(30);
human2.getInfo();


    }}
    class Human{
    String name;
    int age;
   public void setName(String name){//Використовуєть ключове слово this і можна однаково називати змміну
                                    // класу і метода(обєкта) програма бу розуміти яка є яка
      this.name=name;
   }
public void setAge(int age){
       this.age=age;
}
    public int getAge(){
        return age;
    }

    public  String getName(){
        return name;
    }
public  void  getInfo(){System.out.println("Імя "+name +" Вік "+age);}

}


//Ключове слово This використовується для того щоб розрізняти змінну класу від змінної методу(обєкта).



