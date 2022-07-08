package NetworkJAVA;

import java.io.IOException;
import java.net.*;

//В данім розділі описується як в загальному функціонує мережа інтернет і за допомогою  яких засобів в JAVA можна працювати з мережею
//Для роботи з інтернет мережею в JAVA використовують пакет класів JAVA.net

public class Begin {
    public static void main(String[] args) throws UnknownHostException {

        // Клас InternetAdress - використовується для інкапсуляції як числового так і доменного імені для цього адреса
// даний клас приховує всередені себе число. Обєктом даного класу можна задати IP адрес або імя хоста з яким потрібно
// працювати  через мережу. Даний не має видимих конструкторів щоб створити обєкт даного класу потрібно
// використовувати  методи фабрики(factory method) це договір відповідно якому статичні методи класу повертають
// екземпляр цього класу, це робиться заміть перегрузки конструктора з різними списками параметрів

       //Статичні методи даного класу
        InetAddress.getLocalHost();//Просто повертає обєкт InetAddress який предствляє собою локальний хост
        InetAddress.getByName("");//Поветає InetAddress хоста того яке імя йому передано
       InetAddress.getAllByName("");//Даний метод поветає масив InetAddress


    //InetAddress inetAddress = new InetAddress();
    //inetAddress.getHostName();//Повертає імя хоста
   // inetAddress.getAddress();// Поветає байтовий масив який предствляє IP адрес в бат коді
    //inetAddress.getHostAddress();//Повертає адрес хоста
    //inetAddress.isMulticastAddress();//Поветає trye якщо адрес хота є груповим
    //inetAddress.toString();// Поветає імя хоста і IP адрес
    //inetAddress.equals(inetAddress);//Повертає trye якщо обєкт має той же адрес що і other





}}
//В джава існує два вида сокетів TCP. Один для серверів, другий для клієнтів
//SeverSocet клас для серверів
//Socet клас для клієнтів

class MySocket extends Socket{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.getInetAddress();//Метод IP адрес асоційований з обєктом якщо сокед не підключений поветає null
        socket.getPort();//Повертає віддалений порт до якого підключений викликаючий обєкт
        socket.getLocalPort();//Повертає локальний порт

        //Методи які дозволяють оримати доступ до вхідного і вихідного потоків
        socket.getInputStream();
        socket.getOutputStream();


    }}

