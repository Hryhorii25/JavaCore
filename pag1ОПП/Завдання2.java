package pag1ОПП;

/**
 * Created by Гріша on 25.05.2017.
 */
 class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Lova");
        //human1.getInfo();
        Human human2=new Human("Ivan", 36 );
        human2.getInfo();
    }
}
 class Human{
    String name="Vova";
    int age= 25 ;

public Human(){};
public Human(String n,int a ){
    name=n;
    age=a;
}

    public void setName(String name){
       this.name = name;
    }
    public void setAge(int age){
       this.age = age;
    }
     public String getName(){
        return name;
     }
public int getAge(){
         return age;
}
public void getInfo(){
    System.out.println(name+" "+age);
}
}

