package HashCodeAndEquals;

public class Test2 {
    public static void main(String[] args) {
        AB ab = new AB();
        AB ab1 = new AB();

        System.out.println(ab.hashCode());


    }
}



class AB{
    int x =1;

    @Override
    public String toString() {
        return "AB{" +
                "x=" + x +
                '}';
    }



}