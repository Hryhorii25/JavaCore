package JDBCDataBases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//приклад запису інформації у базу даних банчом
public class JDBC12SQLBatch {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {
            statement.addBatch(" brob table Books");
            statement.addBatch("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null,PRIMARY_ key(id) ));");
            statement.addBatch("insert  into Films (name) values ('Гра Престолів')");
            statement.addBatch("insert  into Films (name) values ('Аватар')");
            if (statement.executeBatch().length==5){
                connection.commit();
            }else {
                connection.rollback();
            }

        }
    }
}
