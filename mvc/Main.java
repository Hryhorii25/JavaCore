package mvc;

/**
 * Created by Гріша on 22.06.2017.
 */
public class Main {
    public static void main(String[] args){
       Model model =new Model(2,2);
       Model model1=new Model(5,5);

        Contoller.add(model);
        View.show(model);


    }
    }

