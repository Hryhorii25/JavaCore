package JDBCDataBases;


import java.sql.*;

// https://www.w3schools.com/sql/sql_injection.asp список SQL інйекцій
//В даній програмі показано приклад протидії SQL інйекціям
//SQL інйекції це фактично спосіб зламу SQL бази даних з метою діставання закритих даних за допомогою введення спеціальних команд
public class JDBC3SQLInjectionPreparementStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {


           String userId = "1";
           ResultSet resultSet = statement.executeQuery("select  * from  users where id = '" +userId + "'" );
           while (resultSet.next()){
               System.out.println("userName:" + resultSet.getString("name"));
               System.out.println("userPassword:" + resultSet.getString("password"));
            }

///Даний блок коду показує приклад блокування некоректних SQL команд інйекцій
            PreparedStatement preparedStatement = connection.prepareStatement("select  * from  Users where id= ?");
           preparedStatement.setString(1,userId);
           ResultSet resultSet1 = preparedStatement .executeQuery();
           while (resultSet.next()){
               System.out.println("userName:" + resultSet.getString("name"));
               System.out.println("userPassword:" + resultSet.getString("password"));

           }


        }

    }
}

