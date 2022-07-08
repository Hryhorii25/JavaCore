package JDBCDataBases;

import java.sql.*;

//Транзакції (Transactions) це фактично блок SQL команд при якому якщо одна команда з блоку не виконується тоді не виконується увесь блок
public class JDBC11ТранзакціїTransactions {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {

connection.setAutoCommit(false);
            //statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null,PRIMARY_ key(id) ));");
            statement.executeUpdate("insert  into Films (name) values ('Гра Престолів')");
            statement.executeUpdate("insert  into Films (name) values ('Аватар')");
            Savepoint savepoint = connection.setSavepoint();



connection.rollback(savepoint);
connection.commit();
connection.releaseSavepoint(savepoint);
        }
    }
}
