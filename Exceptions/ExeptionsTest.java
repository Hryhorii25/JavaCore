package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExeptionsTest {
    public static void main(String[] args)  {
        File file = new File("D:\\ProgramingCodi\\JAVA projects\\JavaCore\\src\\Exceptions\\abcd1");


        try {
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
}
