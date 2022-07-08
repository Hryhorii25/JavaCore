package Масиви.ДЗ;

/**
 * Created by Гріша on 11.06.2017.
 */
public class Zavdanna17 {
    public static void main(String[]ards){
        int[] array ={7,-3,-12,18,-3,18};
        int max =array[0];
        int min = array[0];
        for (int arr:array){
            if (max<arr){
                if (max<arr) {
                    max = arr;
                }else if (min>arr){
                    min= arr;
                }
            }
             boolean isEnableMin = false,isEnableMax = false;
            for (int i=0;i<array.length;i++){
                if (array[i]==min){
                    if (isEnableMin) {
                        array[i] = 0;
                    }else{
                        isEnableMin= true;
                    }
                } else if (array[i]==max){
                    if (isEnableMax) {
                        array[i] = 0;
                    }else{
                            isEnableMax= true;
                        }
                    }
                }
            }
           for (int arr: array){
                System.out.println(arr);
           }
        }
}

