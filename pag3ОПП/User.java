package pag3ОПП;

/**
 * Created by Гріша on 18.06.2017.
 */
public class User {
    int year;
    static int count;
    User(int y ){
        year=y;
        count++;
        System.out.println("con user");

    }
    {
       count++;
        System.out.println("year" + year);//Створення блоку
    }




    void setYear(int y) {
        System.out.println("setYear "+y);
        year = y;
        System.out.println("after year"+ year);
    }

   static int getCount(){
        return count;
    }



    int getYear() {
        return year;
    }
void setUser(User y){
    System.out.println("this user year :"+ y.getYear());
        y.year=2001;

}





}


