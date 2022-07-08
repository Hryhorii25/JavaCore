package NetworkJAVA;



import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

//Тут показаний приклад створення простої програми для забезпечення звязку в мережі інтернет через обєкт класу Socket.
// Socket це абстрактне поняття, яке дозволяє здійснювати операції обміну даними через мережу.
// Конструктору сокета передається адрес віддаленого сервера і номер порта.
public class ПрограмаПростогоМережевогоЗєднання {
    public static void main(String[] args) throws IOException {


    try {
        Socket s = new Socket("time -A.timefreq.bldrdoc.gov", 13);//Cтворення сокету для підлючення до вузла мережі по даному порту
        try {


            InputStream inputStream = s.getInputStream();//Створення потоку який дозволяє зчитувати дані які передаються по мережі
            java.util.Scanner in = new java.util.Scanner(inputStream);
            //

            while (in.hasNextLine()) {

                String line = in.nextLine();
                System.out.println(line);
            }

        } finally {
            s.close();
        }
    }




    catch (IOException e){
            e.printStackTrace();
        }



        //Додаткові методи і можливості сокета





    }
    }


