package ЗахистІнформаціїШифруванняТаКриптографія;

import javax.crypto.*;
import java.security.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;



public class Шифрування {


}


//Одним з важливих засобів забезпечення безпеки та захисту інформації є шифрування(encryption).Інформація відмічена цифровим
// підписом є доступною для перегляду а підпис тільки підтерджує що ця інформація не була змінена.Часто
// буває так що деяка програма яка має конфеденційну інформацію  яку необхідно приховати від посторонніх.

//Спочатку тут буде розглянуто взагалі що таке шифрування та його види а потім як шифрування реалізоване в JAVA
//Шифрува́ння — оборотне перетворення даних, з метою приховання інформації
//Шифрування поділяється на два основні види симетричне і асиметричне шифруваняя

//Симетричне шифрування
//В симетричному шифруванні один і той самий ключ (що зберігається в секреті) використовується як для шифрування, так і для розшифрування.
// Розроблено ефективні (швидкі й надійні) методи шифрування.Шифрування з симетричними ключами — схема шифрування, у якій ключ шифрування,
// та ключ дешифрування збігаються, або один легко обчислюється з іншого та навпаки, на відміну від асиметричного, де ключ дешифрування важко обчислити.


//Асиметричні криптосистеми — ефективні системи криптографічного захисту даних, які також називають криптосистемами з відкритим ключем.
// В таких системах для зашифровування даних використовують один ключ, а для розшифровування — інший (звідси і назва — асиметричні).
// Перший ключ є відкритим і може бути опублікованим для використання усіма користувачами системи, які шифрують дані.
// Розшифровування даних за допомогою відкритого ключа неможливе. Для розшифровування даних отримувач зашифрованої інформації використовує другий ключ, який є секретним (закритим).
// Зрозуміло, що ключ розшифровування не може бути визначеним з ключа зашифровування.
//Головне досягнення асиметричного шифрування в тому, що воно дозволяє людям, що не мають наперед наявної домовленості про безпеку,
// обмінюватися секретними повідомленнями. Необхідність відправникові й одержувачеві погоджувати таємний ключ по спеціальному захищеному каналу цілком відпала.



//Реалізація шифрування в JAVA



//При шифруванні інформації в JAVA інформацію яку потрібно зашифрувати спочатку перетворюють в байт код(хеш код)
//і дана інформація в базах даних переважно зберігається в захешованому вигляді є два основні алгоритми хешування
//це MD5 SHA-1


class ШифруванняПеретворенняВБайтКод {
    public static void main (String[] args ) throws NoSuchAlgorithmException {

        //Перетворення інформації в хеш код алгоритм MD5
        String string = "Hello world";
        MessageDigest md5 = MessageDigest.getInstance("MD5");


        byte[] bytes = md5.digest(string.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b:bytes){
            builder.append(String.format("%02X ",b));
        }
        System.out.println(builder.toString());


        //Перетворення інформації в хеш код алгоритм SHA-1
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        byte[] bytes1 = sha.digest(string.getBytes());
        StringBuilder builder1 = new StringBuilder();
        for (byte b:bytes1){
            builder1.append(String.format("%02X ",b));
        }
        System.out.println(builder1.toString());

    }}








//AES является симметричным блочным алгоритмом шифрования.
//Оперирует блоком в 128 бит, ключом размера 128/192/256 бит.
//В даній програмі показоно приклад шифрування і дешифрування інформації

class AESШифрування {
    public static void main (String[] args ) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
        String s = "hello world";//Слово яке шифрується
        Cipher cipher =  Cipher.getInstance("AES");//Даний клас являється універсальним шифрувальником через який можна вказати метод шифрування

        //1)Метод з рамдомним задаванням ключа шифрування
        KeyGenerator kgen =KeyGenerator.getInstance("AES");
        kgen.init(128);
        SecretKey key = kgen.generateKey();
        cipher.init(Cipher.ENCRYPT_MODE,key);
//2)Метод коли сам задаєш ключ шифрування
        // SecretKeySpec key  = new SecretKeySpec("Bar1234Bar1234".getBytes(),"AES");
        // cipher.init(Cipher.ENCRYPT_MODE,key);

        byte[] bytes = cipher.doFinal(s.getBytes());
        for (byte b:bytes){
            System.out.print(b);
        }




//Розшифрування

        Cipher decriptChiper = Cipher.getInstance("AES");
        decriptChiper.init(Cipher.DECRYPT_MODE,key);
        byte[] decriptionBytes= decriptChiper.doFinal(bytes);
        for (byte b: decriptionBytes)
            System.out.print((char)b );


    }}








 class RSAШифрування { public static void main (String[] args ) throws NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException {

    String s = "hello world";//Слово яке шифрується

    Cipher cipher = Cipher.getInstance("RSA");
    KeyPairGenerator pairGenerator = KeyPairGenerator.getInstance("RSA");
    KeyPair keyPair = pairGenerator.generateKeyPair();
    Key publicKey = keyPair.getPublic();
    Key privateKey = keyPair.getPrivate();
    cipher.init(Cipher.ENCRYPT_MODE,publicKey);
    byte[] bytes = cipher.doFinal(s.getBytes());
    for (byte b:bytes){
        System.out.print(b);
    }
    System.out.println("\n");



//Розшифрування

    Cipher decriptChiper = Cipher.getInstance("RSA");
    decriptChiper.init(Cipher.DECRYPT_MODE,privateKey);
    byte[] decriptionBytes= decriptChiper.doFinal(bytes);
    for (byte b: decriptionBytes)
        System.out.print((char)b );


}}
