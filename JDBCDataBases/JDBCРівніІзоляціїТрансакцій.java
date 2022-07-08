package JDBCDataBases;


import java.sql.*;

//Ізоляція Трансакцій це набір команд SQL або блоків переважно зусрічається при роботі з банківськими програмами


// Diry Reads це ніби як проблема  багатокопотокової програми коли з одним обєктом працює декілька
// потоків змінюючи одночасно дані в обєкті  внаслідок чого програма працює неправильно. Diry Reads це проблема  SQL команд коли делька блоків
// працює над одними даними проводячи з ними якісь дії дані записються і виводяться неправильно

//В даній програмі показано приклад програми де є помилка Diry Reads і показанояк її ліквідувати
public class JDBCРівніІзоляціїТрансакцій {
   static String userName = "root";
   static String password = "qwerty";
   static String conenctionUrl = "jdbc:mysql://localhost:3306/mysql";
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {

        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            statement.execute("update Books set name = 'new value' where id =1"  );
            new  OtherTransaction().start();
            Thread .sleep(2000);
            connection.rollback();
        }
    }
static class OtherTransaction extends Thread{

    @Override
    public void run() {
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            ResultSet resultSet = statement.executeQuery("select * from Films");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }


    }catch (SQLException e){
            ;
        }
}
}
}


