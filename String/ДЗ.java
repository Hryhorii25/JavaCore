package String;

/**
 * Created by Гріша on 18.06.2017.
 */
public class ДЗ {
    public static void main(String[] args) {
        String s = "Hellow World";
        char a = 'a';
        char b = 'e';
        char c = 'i';
        char d = 'o';
        char h = 'u';
        char m = 'y';
        char k = '*';
        char[] q = new char[s.length()];


        for (int i = 0; i < s.length(); i++) {
            q[i] = s.charAt(i);

        }


        for (int i = 0; i < s.length(); i++) {
            if ((q[i] == a) || ((q[i] == b) || ((q[i] == c) || ((q[i] == d) || ((q[i] == h) || ((q[i] == m))))))) {
                q[i] = k;

            }

        }


System.out.println(q);
    }}







//System.out.println(s.charAt(i));