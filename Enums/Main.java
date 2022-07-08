package Enums;

/**
 * Created by Гріша on 21.07.2017.
 */
public class Main {
    public static void main(String[] args) {
Muzic mc = Muzic.CLASSIC;
for (Muzic element:Muzic.values()){
    System.out.println(element);
}

   Muzic mc2= Muzic.valueOf(Muzic.class,"ROC");

System.out.println(mc2);
Muzic muzic1 = Muzic.CLASSIC;
muzic1.getB();



    }
}
