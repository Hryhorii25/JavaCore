package mvsМасив;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        //int[] array ={5,12,-3,5,16};
        Model model =new Model(10);
        for (int i=0;i<10;i++){
model.adding(i+2);
        }
model.setIndex(0);
        Controler.move(model);
    }
}
