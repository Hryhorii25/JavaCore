package Codewars;

public class Test3Kata8 {
    public static void main(String[] args) {

        System.out.println(Kata.getVolumeOfCuboid(2,2,2));
        }
    }


    class  Kata {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}


