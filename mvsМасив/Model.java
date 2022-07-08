package mvsМасив;

/**
 * Created by Гріша on 25.06.2017.
 */
public class Model {
    private int array[];
    private int index=0;
    public Model(int size){
        array=new int[size];
    }

    public void adding(int element){
        if (index<array.length){
            array[index++]=element;
        }
    }
    public void setIndex(int index){
        this.index=index;
    }

    public int current(){
        return array[index];
    }

    public boolean  isNext(){
    return this.index <array.length;

}

public void iterator(){
    if (index<array.length)
        index++;
}

public int leng(){
    return array.length;
}

}
