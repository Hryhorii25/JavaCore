//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.*;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//import javax.imageio.ImageWriter;
//import java.io.FileInputStream;
//
////Робота з графікою у JAVAFX
//public class FX7РаботаЗЗображенням extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Блок коду який перетворює зораження  у файл з яким можна працювати програмно змінюючи зображення
//        Image image = new Image(new FileInputStream("smile.jpg"));
//        ImageView imageView = new ImageView(image);
//
//
//        //Блок коду зчитування зображення по пікселям цикл проходиться по зображенню по піксельно
//        PixelReader pixelReader = image.getPixelReader();
//        for (int i = 0; i < image.getWidth() ; i++) {
//            for (int j = 0; j<image.getHeight(); j++){
//                pixelReader.getColor(i,j);
//            }
//
//        }
//
////Блок коду для запису інформації у зображення
//        WritableImage writableImage = new WritableImage((int)image.getWidth(),(int)image.getHeight());
//        PixelWriter pixelWriter = writableImage.getPixelWriter();
//        for (int readY = 0; readY < image.getHeight() ; readY++) {
//            for (int readX = 0; readX < image.getWidth(); readX++) {
//                pixelWriter.setColor(readX, readY, Color.ALICEBLUE);
//
//
//            }
//        }
//
//
//        Group group = new Group();
//        group.getChildren().add(imageView);
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//    }
//}
