package ExceptionsMy;

/**
 * Created by Гріша on 21.08.2017.
 */
public class getPerimeter {

    public void getPerimeter(){
        Square square = new Square();
        try {
            square.setSide(5);
        } catch (VlasniExceptions vlasniExceptions) {
            vlasniExceptions.printStackTrace();
        }
    }
}
