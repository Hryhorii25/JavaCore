package Enums;

/**
 * Created by Гріша on 21.07.2017.
 */
public enum Muzic {
CLASSIC(1,2),ROC(3,4),POP(5,6);
int a;
private int b;

    Muzic(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    void say(){
    System.out.println("Muzic");}

}
