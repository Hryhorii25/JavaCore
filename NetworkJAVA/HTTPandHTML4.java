package NetworkJAVA;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//В даній програмі показано роботу програми яка звязується по мережі з іншою програмою( httml сайтом) через  httml HTTP протокол
public class HTTPandHTML4 {public static void main(String[] args) throws IOException {

    URLConnection connection = new URL("https://www.google.com.ua").openConnection();
    Scanner scanner = new Scanner(connection.getInputStream());
    while (scanner.hasNextLine()){
        System.out.println(scanner.nextLine());
    }



}
}
