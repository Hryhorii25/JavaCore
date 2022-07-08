//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.shape.Line;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import Серіалізація3.Color;
//
////Рисування фігур в JAVAFX
//public class FX2Shapes extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Блок коду рисування лінії
//        Line line = new Line(0,0,100,100);
//        line.setStroke(javafx.scene.paint.Color.GREEN);
//
////Таким чином можна рисувати фігури і текст у графічному вікні
//
//        //Блок коду виводу тексту
//        Text text = new Text(0,50,"hello world");
//
//        //
//
//        Group group = new Group();
//        Scene scene = new Scene( group,400,400);
//
//        group.getChildren().add(line);//Будь який обєкт і текст для прорисовки  потрібно добавити у групу (добавити у графічне вікно)
//        group.getChildren().add(text);
//
//        primaryStage.setTitle("Hello world");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
//
