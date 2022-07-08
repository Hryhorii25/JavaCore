package pag_1Begin;

/**
 * Created by Гріша on 24.05.2017.
 */
public class OperatorContinue {
    public static void main(String[] args){
     for(int i = 0; i<=15; i++){
         if (i%2==0){
             continue;
         }
         System.out.println("Це не чотне чило"+i);
     }
    }
}
