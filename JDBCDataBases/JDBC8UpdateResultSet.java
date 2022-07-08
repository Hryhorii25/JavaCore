package JDBCDataBases;


import java.sql.*;
//У даній програмі показано як записувати або перезаписувати у БД великі обєми інформації
public class JDBC8UpdateResultSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {
            Statement statement1 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
ResultSet resultSet = statement.executeQuery("select  * from Books");
while (resultSet.next()){
    System.out.println(resultSet.getInt("id"));
    System.out.println(resultSet.getInt("nama"));

    resultSet.last();
    resultSet.updateString("name","new Value");
    resultSet.updateRow();

    resultSet.moveToInsertRow();
    resultSet.updateString("name","inser row");
    resultSet.insertRow();

    resultSet.beforeFirst();
    while (resultSet.next()){
        System.out.println(resultSet.getInt("id"));
        System.out.println(resultSet.getString("name"));
    }

}

        }
    }
}
