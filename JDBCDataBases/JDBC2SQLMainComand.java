package JDBCDataBases;

import java.sql.*;


public class JDBC2SQLMainComand {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {

       //В даній програмі показано стандартні способи роботи з SQL базою даних через JAVA код у якому є спеціальні методи для вводу SQL команд


           /////Блок коду для створення таблиці в базі




            //statement.executeUpdate( "INSERT INTO `books_db`.`cars` (`Name`) VALUES ('Jeep')");
            //statement.executeUpdate("use books_db");
statement.executeUpdate("CREATE TABLE Customers1 (\n" +
        "ID CHAR(10) NOT NULL Primary key, \n" +
        "Custom_name CHAR(25) NOT NULL, \n" +
        "Custom_address CHAR(25) NULL, \n" +
        "Custom_city CHAR(25) NULL, \n" +
        "Custom_Country CHAR(25) NULL, ");



            // statement.executeUpdate("CREATE SCHEMA_NAME IF NOT EXISTS  Cars (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null,PRIMARY_ key(id) ));");
//            statement.executeUpdate("insert  into Cars (name) values ('БМВ')");
//            statement.executeUpdate("insert  into Cars (name) values ('Ауді')");


           //Блок коду для виводу таблиць з бази значень
            ResultSet resultSet = statement.executeQuery("SHOW databases");
            while (resultSet.next()) {
                //System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(1));

            }


        }

    }
}

