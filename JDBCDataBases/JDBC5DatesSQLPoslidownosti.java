package JDBCDataBases;

import java.sql.*;

//В даній програмі показано приклад запису в БД дати
public class JDBC5DatesSQLPoslidownosti {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl, userName, password);

            //Блок запису в часу БД
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null, dt DATE  PRIMARY KEY (id) ));");
            PreparedStatement preparedStatement = connection.prepareStatement("insert  into Books(name, dt) VALUES ('someName',?)");
            preparedStatement.setDate(1,new Date(1520664935027L));
            preparedStatement.execute();
            System.out.println(preparedStatement);

            //Блок виводу
            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getDate("dt"));
            }




        }
    }
}