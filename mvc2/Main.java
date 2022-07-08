package mvc2;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Main {
    public static void main(String[] args) {
    Model m1 = new Model(4,9);
    Model m2= new Model(2,4);
    Model addRes=Controler.add(m1,m2);
    View.display(addRes);
    Model sadRes=Controler.sub(m1,m2);
View.display(sadRes);
        Model mnoRes=Controler.mnoRes(m1,m2);
        View.display(mnoRes);

        Model divRes =Controler.divRes(m1,m2);
        View.display(divRes);


    }
}
