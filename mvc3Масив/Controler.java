package mvc3Масив;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Controler {
    static void setNigativChange(Model model){
        for (int i=0;i<model.array.length;i++){
            if (model.array[i]<0){
                model.array[i]*= -1;
            }
        }
    }
}
