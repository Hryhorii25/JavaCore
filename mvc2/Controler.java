package mvc2;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Controler {

    static Model add(Model m1, Model m2) {
        Model result = new Model();
        result.setDetnomenator(m1.getDetnomenator() * m2.getDetnomenator());
        result.setNumerator(m1.getNumerator() * m2.getDetnomenator() + m2.getNumerator() * m1.getDetnomenator());

        return result;
    }

       static Model sub(Model m1, Model m2){
        Model result = new Model();
        result.setDetnomenator(m1.getDetnomenator() * m2.getDetnomenator());
        result.setNumerator(m1.getNumerator() * m2.getDetnomenator() - m2.getNumerator() * m1.getDetnomenator());
       return result;

}
    static Model mnoRes(Model m1, Model m2){
        Model result = new Model();
        result.setDetnomenator(m1.getDetnomenator() * m2.getDetnomenator());
        result.setNumerator(m1.getNumerator() * m2.getNumerator());
        return result;

    }

    static Model divRes(Model m1, Model m2){
        Model result = new Model();
        result.setDetnomenator(m1.getDetnomenator() * m2.getNumerator());
        result.setNumerator(m1.getNumerator() * m2.getDetnomenator());
        return result;

    }

    static void contraction (Model m) {
        for (int i = m.getDetnomenator(); i > 1; i--) {
            if (m.getDetnomenator() % i == 0 && m.getNumerator() % i == 0) {
                m.setNumerator(m.getNumerator() / i);
                m.setDetnomenator(m.getDetnomenator() / i);
                break;


            }
        }


    }
}