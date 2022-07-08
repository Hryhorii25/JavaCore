package ВнутрішніКласи2;
public class MyOuter {
    private  String field = "Field my MyClass";
    public MyOuter(String field){System.out.println("MyOuter");}

private void someMetod() {

}

    public static class MyInner{
        private String field;
        public MyInner(){
            System.out.println("MyInner");

        }
private void some(){System.out.println();}
    }
}
