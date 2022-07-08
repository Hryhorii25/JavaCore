package Наслідування2;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Animale {
private  int height;
private  int weight;
private  int windth;
public Animale() {
    System.out.println("Animale");
}

    public Animale(int height, int weight, int windth) {
        this.height = height;
        this.weight = weight;
        this.windth = windth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWindth() {
        return windth;
    }

    public void setWindth(int windth) {
        this.windth = windth;
    }
}
