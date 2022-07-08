package ЗадачаПроАвтопарк2;

/**
 * Created by hanz on 06.07.2017.
 */
public class AutoPark {
    private Auto[] autos;
    private View view = new View();

    public AutoPark(Auto[] autos) {
        this.autos = autos;
        sort();
    }

    private void sort() {
        for (int i = 0; i < autos.length - 1; i++) {
            for (int j = i + 1; j < autos.length; j++) {
                if (autos[i].getPlace()
                        > autos[j].getPlace()) {
                    Auto temp = autos[i];
                    autos[i] = autos[j];
                    autos[j] = temp;
                }
            }
        }
    }

    public void getAuto(int people) {
        for (Auto auto : autos) {
            if (people <= auto.getPlace()) {
                view.show(auto.getPlace());
                return;
            }
        }

        for (int i = autos.length - 1; i >= 0; i--) {
            view.show(autos[i].getPlace());
            getAuto(people - autos[i].getPlace());
            return;
        }
    }

}
