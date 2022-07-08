package RegExРеджекси;

/**
 * Created by Гріша on 16.12.2017.
 */
public class RegExp13AtomicGroups {
    public static void main(String[]args){
   System.out.println("abcc".matches("a(bc|b)c"));
   System.out.println("abc".matches("a(bc|b)c"));

        System.out.println("abcc".matches("a(?>bc|b)c"));
        System.out.println("abc".matches("a(?> bc|b)c"));



   //System.out.println("integers".matches("\\b(integer|insert|in\\b"));
   //System.out.println("integer".matches("\\b(?>integer|insert|in\\b"));





    }
}
