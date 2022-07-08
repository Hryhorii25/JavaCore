package Properties;
//https://habrahabr.ru/post/194658/

//Properties - це спеціальний вид файлу у якому розробник розміщує усі налаштування які він буде використовувати у свої
// програмі(коді).Це можуть бути налаштування до бази даних. Пропетрі файл потрібен щоб розробник міг швидко занйти потрібні
// налаштування



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Properties{}
   /* public Properties(Properties defaultproperties) {
    System.out.println("Property #1:" + new  Until().getPropertyValue("PROPERTY_1"));
    System.out.println("Property #2:" + new  Until().getPropertyValue("PROPERTY_2"));

    }

}

class Until{
    public String getPropertyValue(String propertyName){
        String propertyValue = "";
        Properties properties = new Properties();
        try
                (InputStream inputStream = this.getClass().getResourceAsStream("application.propertyes"){
                properties.load(inputStream);
                propertyValue = properties.getProperty(propertyName);
            }catch(IOException e){
                System.out.println(e);
                }
        }return propertyValue;


    }
}*/