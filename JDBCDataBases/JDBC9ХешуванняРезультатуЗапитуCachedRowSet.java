package JDBCDataBases;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

//Програма хешування даних в БД
public class JDBC9ХешуванняРезультатуЗапитуCachedRowSet {
    static String url = "jdbc:mysql://localhost:3306/mysql";
    static String userName = "root";
    static String password = "qwerty";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = getData();
    while (resultSet.next()){
        System.out.println(resultSet.getInt("id"));
        System.out.println(resultSet.getInt("name"));

    }
    CachedRowSet cachedRowSet = (CachedRowSet) resultSet;
    cachedRowSet.setCommand("select * from Films where id = ?");
    cachedRowSet.setInt(1,1);
    cachedRowSet.setPageSize(20);
    cachedRowSet.execute();
    do {
        while (cachedRowSet.next()) {
            System.out.println(cachedRowSet.getInt("id"));
            System.out.println(cachedRowSet.getInt("name"));
        }
        } while (cachedRowSet.nextPage());
    }






            static ResultSet getData() throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");
    try (Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();)
        {
            //statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null,PRIMARY_ key(id) ));");
            statement.executeUpdate("insert  into Films (name) values ('Гра Престолів')", statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate("insert  into Films (name) values ('Аватар')", statement.RETURN_GENERATED_KEYS);


            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = factory.createCachedRowSet();


            Statement statement1 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement1.executeQuery("select  * from Films");
            cachedRowSet.populate(resultSet);
            return cachedRowSet;
        }

    }}








