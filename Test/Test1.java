package Test;

public class Test1 {
    public static void main(String[] args) {
        System.out.printf("Hello");
    }
}


class A{
    int x;
    int y;
    char q;

    public A(int x, int y, char q) {
        this.x = x;
        this.y = y;
        this.q = q;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getQ() {
        return q;
    }

    public void setQ(char q) {
        this.q = q;
    }
}