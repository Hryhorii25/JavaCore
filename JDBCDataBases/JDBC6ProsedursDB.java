package JDBCDataBases;

import java.sql.*;

//Робота з процедурами у БД фактично запис команд SQL у таблицю бази даних і спрацювання даних команд
public class JDBC6ProsedursDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement())
        {System.out.println("Connected");



            //Запис процедури у БД
//            CallableStatement callableStatement = connection.prepareCall("call myprocedure1(?)}");
//            callableStatement.registerOutParameter(1,Types.INTEGER);
//           callableStatement.execute();
//          System.out.println(callableStatement.getInt(1))
//          System.out.println("----------------------");

//Запис процедури у БД
//          CallableStatement callableStatement1 = connection.prepareCall("{call getBooks(?)}");
//          callableStatement1.setInt(1,1);
//          if (callableStatement1.execute()){
//              ResultSet resultSet = callableStatement1.getResultSet();
//              while (resultSet.next()){
//                  System.out.println(resultSet.getInt("id"));
//                  System.out.println(resultSet.getString("name"));
//              }
//          }

            CallableStatement callableStatement = connection.prepareCall("call getCount()}");
            boolean hasResults = callableStatement.execute();
            while (hasResults){
                ResultSet resultSet = callableStatement.getResultSet();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1));
                }
            hasResults = callableStatement.getMoreResults();
            }


        }
    }
}
