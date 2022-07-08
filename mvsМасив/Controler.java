package mvsМасив;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Controler {
    public static void move(Model model){
       boolean isEnable = false;
       while (model.isNext()){
           View.display(model.current());
           model.iterator();
           if (!isEnable){
               isEnable= true;
           }
       }
    if (!isEnable){
           View.display();
    }
    }
}
