package Annotations1;


@Company
class MyCompani{
int a;
String name;
String city;
Double b ;


    public class Multiply {
        public Double multiply(Double a, Double b) {
            return a * b;
        }
    }



//    public MyCompani() {
////
//   }

    public void getMycompanyInfo(){
        System.out.println("Employee a: " + a);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee sity: " + city);
    }
}

//public class MyTestAnntotation {
//    public static void main(String[] args) {
//        MyCompani mycompani = new MyCompani();
//        mycompani.getMycompanyInfo();
//    }
//}
