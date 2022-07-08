package JDBCDataBases;

import java.sql.*;

//Metadata це споcіб зберігання інформації у БД
public class JDBC10Metadata {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {


          //  statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null,PRIMARY_ key(id) ));");
            statement.executeUpdate("insert  into Films (name) values ('Гра Престолів')");
            statement.executeUpdate("insert  into Films (name) values ('Аватар')");

            DatabaseMetaData databaseMetaData = connection.getMetaData();
           // databaseMetaData.getTables(null,null,null,new String[]{"Table"});
          //  ResultSet resultSet = databaseMetaData.getTables(null,null, new String() );
            //while (resultSet.next()){
               // System.out.println(resultSet.getString(1));
                //System.out.println(resultSet.getString(2));
               // System.out.println(resultSet.getString(3));
            }

           //ResultSet resultSet1 = statement.executeQuery("select * from Films");
           // ResultSetMetaData resultSetMetaData = resultSet1.getMetaData();
            //for (int i = 0; i < resultSetMetaData.getColumnCount() ; i++) {
               // System.out.println(resultSetMetaData.getColumnLabel(i));

         //   }

}}
