package mvc2;

/**
 * Created by Гріша on 25.06.2017.
 */
public class View {
static void display(Model m){
    System.out.println(m.getNumerator()+ "/" + m.getDetnomenator() );
}

    static void dispay(int numerator, int denominato){
    System.out.println(numerator+"/"+denominato);

    }

static void dispay(){
    System.out.println("null");
}
}
