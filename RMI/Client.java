package RMI;
// Тут показано роботу інструмента RMI який ніби звязує дві машини компютера на яких запущено JAVA даний інстмент звязує код програми на декількох
// окремих компютерах так ніби даний код написаний на однім тім самім коппютері, наприклад клас створений на однім копютері а обєкти даного класу сторюються на іншім
// обєкт створений на однім комютері а його методи можна виклакати на іншім. Тобто  усі калси які сторються на деклькох компютерах переносяться на якись локальний сервер
// який їх ніби обєднює і усі копютери які перебувають у даному взаємозвязку взаємодіють


//Програмно даний інструмент працює наступним чином на однім комютері створюється клас клієнт а на іншім сервер і за допомогою певних
// обєктів забезпечується взаємодія

//Загальний приклад роботи
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        Enumeration<NameClassPair> enumeration = context.list("rmi://localhos/");
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement().getName());


        IMath iMath = (IMath)context.lookup("rmi://localhost/imath");
        int result = iMath.add(1,2);
        System.out.println(result);


    }
}
