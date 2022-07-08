package JDBCDataBases;

//JDBC це інтерфейс який представляє собою інструмент роботи з  базами даних в JAVA найпоширинішими робочими  базами є MySQL і Oracle
//База даних структурований набір даних представлений у вигляді таблиці

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1BeginConect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//В даній програмі розлядається як підключитися до бази даних. Таке підключення складається з двох етапів
        //1)Програмне підключення InlegIdea до  бази даних
        //http://fetisovvs.blogspot.com/2016/04/mysql-intellij-idea-community-java.html інструкція по підкюченню  і налаштування бази даних


        //2)Кодове підлючення для роботи з базами даних через  JAVA
        /////Даний блок коду являє собою універсальний спосіб кодового підключення до баз даних в InlegIdea
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";//URL береться в налаштуваннях підключення до бази даних

        //Тут відбувається підключення спеціального драйвера бази даних для взаємодії InlegIdea  і бази  у різних баз він різний його потрібно
        // завантажувати  і підключати до проекту як jre файл бібліотеки

       Class.forName("com.mysql.cj.jdbc.Driver");

       //Підключення
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password)){
            System.out.println("Connected");}

        //////

    }

}
