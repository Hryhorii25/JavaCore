package ExceptionsMy;

// Іноді існують випадки коли код не викликає ніякого виключення вбудованого в JAVA але порушує  логіку програми
// тоді потрібно створювати власні виключення
//Даний клас є класом в якому можна створювати власні Exception
public class VlasniExceptions extends Exception {
public VlasniExceptions(String description){}
//Щоб створити повноцінний власний клас Exception потрібно прописати усі конструктори якіє у класі Exception

    public VlasniExceptions() {//Констуктр пустий
    }

    public VlasniExceptions(Throwable cause) {//Констуктр який приймає повідомлення яке потрібно передати користувачеві
        super(cause);
    }


    public VlasniExceptions(String message, Throwable cause) {//Констуктр який приймає повідомлення і прчину які потрібно передати користувачеві
        super(message, cause);
    }

    public VlasniExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

























