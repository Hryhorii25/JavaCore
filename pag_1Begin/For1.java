package pag_1Begin;

/**
 * Created by Гріша on 08.06.2017.
 */
public class For1 {
    public static void main (String[]args){
        mark:
        for (int i = 0; i<3;++i){
            for ( int j = 0; j<2;j++){
                if (j==0){
                    continue   mark;
                }
            System.out.println(" " + i + " " + j);
            }

        }
    }
}
