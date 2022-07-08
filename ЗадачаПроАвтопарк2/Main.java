package ЗадачаПроАвтопарк2;

public class Main {

    public static void main(String[] args) {

        AutoPark autoPark = new AutoPark(new Auto[]{
                new Car(4),
                new Car(4),
                new Car(4),
                new MiniBus(6),
                new MiniBus(6),
                new MiniBus(6),
                new Bus(8),
                new Bus(8),
                new Bus(8)

        });
        autoPark.getAuto(50);
    }
}
