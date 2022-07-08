package ДЗЗадачаАвтопарк;

/**
 * Created by Гріша on 02.07.2017.
 */
public class Avto {
private int plaice;
private String name;
    public Avto(int i, String bus){

    }

    public Avto(String name,int plaice){
        this.name=name;
        this.plaice=plaice;
    }


    public Avto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlaice() {
        return plaice;


    }
}
