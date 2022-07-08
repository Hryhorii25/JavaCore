package Scaner;



import java.io.*;
import java.util.Scanner;
import java.util.WeakHashMap;

public class ScannerMain {
    public static void main(String[] args) throws IOException {
        File dir = new File("Dir");
        dir.mkdir();

        for (int i = 0; i <5 ; i++) {
            File file = new File (dir, "file"+ i+ ".txt");
            file.createNewFile();

        }
    String[ ] files= dir.list();
        System.out.println("file list :");

        for(String file: files){
            System.out.print(file+",");

        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int x=0;
        while (x<=2){
        System.out.println("Enter a filename:");
        String nameFile = scanner.nextLine();
        if (nameFile!=null){
            boolean isFile=false;
            for (String file: files){
                if (file.equals(nameFile)){
isFile=true;
                    break;
                }
            }
            if (isFile){
                ioFile(dir,nameFile,scanner);
                break;
            }else{
                System.out.println("file does not exist");
                x++;
            }

        }}
    }


    private  static  void  ioFile(File dir,String nameFile, Scanner scanner){
        File file= new File(dir,nameFile);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            System.out.println("Enter Data:");

            String temp;


            while ((temp = scanner.nextLine()) !=null && temp.length()>0){
                char[]c =new char[temp.length()];
                for (int i = 0; i <temp.length() ; i++) {
                    c[i]= (char) (temp.charAt(i) *6/2);

                }
                printWriter.println(c);
            }

        printWriter.flush();
            printWriter.close();

            System.out.println("data has been successfully added");

            System.out.println("reading file data :");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((temp=bufferedReader.readLine()) !=null){
                char []c = new char[temp.length()];
                for (int i = 0; i <c.length ; i++) {
                    c[i]=(char) (temp.charAt(i)*2/6);
                }
            System.out.println(c);}

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;



    }
}
