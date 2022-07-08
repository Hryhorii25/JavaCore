package ДЗЗадачаАвтопарк;

/**
 * Created by Гріша on 02.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        int people = 3;
        Avto[] avtos = {new Car(4, "Car"), new Bus(22, "Bus"), new MiniBus(8, "MiniBas")};
        bubleSort(avtos);

        for (Avto avto : avtos) {
            if (avto.getPlaice() >= people) {
                System.out.println(avto.getName());
                break;
            }
        }
    }


    private static void bubleSort(Avto[] avtos) {
        boolean swapped = true;
        Avto avto;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < avtos.length - j; i++) {
                if (avtos[i].getPlaice() > avtos[i + 1].getPlaice()) {
                    avto = avtos[i];
                    avtos[i] = avtos[i + 1];
                    avtos[i + 1] = avto;
                    swapped = true;
                }
            }
        }

    }
}
