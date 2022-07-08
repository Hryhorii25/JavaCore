package JDBCDataBases;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

//В даній програмі показано як записувати у таблицю певний великий обєкт у даному випадку це заображення
public class JDBC4BLOBBinaryLargeObjects {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        String userName = "root";
        String password = "qwerty";
        String conenctionUrl = "jdbc:mysql://localhost:3306/collcompany";//URL береться в налаштуваннях підключення до бази даних
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(conenctionUrl,userName,password)){
            System.out.println("Connected");


        ////Блок запису файла зображення у БД

//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS  Films (id MEDIUMINT  NOT NULL auto_increment,name CHAR(30) not null, img BLOB, PRIMARY_ key(id) ))");
            BufferedImage  image = ImageIO.read(new File("\\D:\\ProgramingCodi\\JAVA projects\\JavaCore\\src\\JDBCDataBases\\smile1.jpg"));
            Blob blob = connection.createBlob();
            try (OutputStream outputStream = blob.setBinaryStream(1)){
                ImageIO.write(image,"jpg",outputStream);
            }


            PreparedStatement statement1 = connection.prepareStatement("insert into mypic (name, img) values(?,?)");
            statement1.setString(1,"pictures");
            statement1.setBlob(2,blob);
            statement1.execute();



           //Блок виводу і перезапису файла
//            ResultSet resultSet = statement1.executeQuery("select * from Books");
//            while (resultSet.next()){
//                Blob blob1 = resultSet.getBlob("img");
//                BufferedImage image1 = ImageIO.read(blob1.getBinaryStream());
//                File outputFile = new File("saved.png");
//                ImageIO.write(image1,"png",outputFile);
            }


        }}
