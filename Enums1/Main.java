package Enums1;
//Енами використовують у задачах де наперед знаєш якісь перелічині типи, точна кількість елементів якогось типу
    enum Season{
    WINTER("Win",12,1,2), SPING("Spin",3,5), SUMMER("Sum",6,8), AUTUMN("Autum",9,11);//Енами можуть оголошуватись в класі та поза класом
    private String s;
    private int[] numberOfMounts;

    Season(){}
    Season(String s, int... numberOfMounts){
    this.s=s;
}


public String getS(){
        return s;}
}

public class Main {
    public static void main(String[] args) {
Season season = Season.SUMMER;
System.out.println(season.ordinal());
for (Season s: Season.values()){//Метод який виводить список  усі костант в енами Season
    System.out.println(s);

}
    }
}


