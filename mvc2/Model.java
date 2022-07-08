package mvc2;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Model {
    int numerator;
    int detnomenator;
    public Model(){};
    public Model(int numerator,int detnomenator){
        this.numerator=numerator;
        this.detnomenator=detnomenator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDetnomenator(int detnomenator){
        this.detnomenator = detnomenator;
    }

    public int getDetnomenator(){
        return detnomenator;
    }

    public int getNumerator(){
        return numerator;
    }
}
