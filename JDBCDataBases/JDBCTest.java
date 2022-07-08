package JDBCDataBases;

import java.sql.*;

public class JDBCTest { public static void main(String[] args) throws SQLException, ClassNotFoundException {
    String userName = "root";
    String password = "qwerty";
    String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";
    Class.forName("com.mysql.cj.jdbc.Driver");

    try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password)
    ){System.out.println("Connected");
    }
    try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
         Statement statement = connection.createStatement()) {


//        statement.executeUpdate("CREATE TABLE `collcompany`.`new_table` (\n" +
//                "  `id` INT NOT NULL,\n" +
//                "  `Name` VARCHAR(45) NULL,\n" +
//                "  `Age` INT NULL,\n" +
//                "  `facultet` VARCHAR(45) NULL,\n" +
//                "  PRIMARY KEY (`id`));");


//        statement.executeUpdate("CREATE TABLE `collcompany`.`customers` (\n" +
//                "  `id` INT(10) NOT NULL,\n" +
//                "  `customer_name` VARCHAR(45) NOT NULL,\n" +
//                "  `customer_adres` VARCHAR(45) NOT NULL,\n" +
//                "  `customer_city` VARCHAR(45) NULL,\n" +
//                "  `customer_country` VARCHAR(45) NOT NULL,\n" +
//                "  PRIMARY KEY (`id`)); ");




//        ResultSet resultSet = statement.executeQuery("SHOW databases");
//        while (resultSet.next()) {
//
//            //System.out.println(resultSet.getString(1));


        //statement.executeUpdate("INSERT INTO `collcompany`.`customers` (`id`, `customer_name`, `customer_adres`, `customer_city`, `customer_country`) VALUES ('5', 'Oleg', 'Ivasyka38', 'IF', 'UA'); ");



       // System.out.println("Sucses");



        }

    }
}

