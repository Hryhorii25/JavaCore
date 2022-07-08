package JDBCDataBases;


import java.sql.*;
//В даній програмі показано приклад програмного скролу по базі даних
public class JDBC7ScrollableRowSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null, dt DATE  PRIMARY KEY (id) ));");
      Statement statement1 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    //  PreparedStatement preparedStatement = connection.prepareStatement("",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            //Методи для скролу по БД
            ResultSet resultSet = statement1.executeQuery("select * from Books");
if  (resultSet.next());
System.out.println(resultSet.getString("name"));
if (resultSet.next())
    System.out.println(resultSet.getString("name"));
if (resultSet.previous())
    System.out.println(resultSet.getString("name"));


        }
    }}