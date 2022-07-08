package ПерегрузкаМетодів;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Bird extends Animal {
public Bird(int i){
    //this i=i;
}
@Override
public boolean equals(Object obj){
    return this.i==((Bird)obj).i;
}}