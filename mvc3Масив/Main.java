package mvc3Масив;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model(new int[]{1, 2, 3, 4, 56, 5, 6, 8});
        Controler.setNigativChange(model);
        View.show(model);
    }
}