package mvc3Масив;

/**
 * Created by Гріша on 29.06.2017.
 */
public class View {
    public static   void show(Model model){
        for (int i=0;i<model.array.length;i++){
            System.out.println(model.array[i]);
        }
    }
}
