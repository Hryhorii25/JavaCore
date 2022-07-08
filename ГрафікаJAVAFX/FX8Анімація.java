//package ГрафікаJAVAFX;
//
//import javafx.animation.*;
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.*;
//import javafx.scene.paint.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.awt.*;
//import java.awt.Image;
//import java.io.FileInputStream;
//
//
////В даній прграмі показано створення анімації - анімація це рухомі картинки на графічній формі
//public class FX8Анімація extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//
//        //////Блок коду створення простої анімації рухомого квадрата
//        Rectangle rectangle = new Rectangle(0,0,50,50);//Створення фігури яка буде рухатись
//
//        //Прописуються значення як будуть змінюватись при анімації це може бути зміна положення обєкта тобто рух або зміна кольору форми розмірів
//        KeyValue xValue = new KeyValue(rectangle.xProperty(),100);
//        KeyValue yValue = new KeyValue(rectangle.yProperty(),100);
//
//        //Тут задається час за який відбувається анімація і параметри анімації
//        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000),xValue,yValue);
//        Timeline timeline = new Timeline();
//
//        //Код який запускає анімацію в часі і робить її циклічною вона повторювана
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(true);
//        timeline.getKeyFrames().addAll(keyFrame);
//        timeline.play();
//
////////////////
//
//
//        ////Блок коду анімації із графічною картинкою
//        javafx.scene.image.Image image = new javafx.scene.image.Image(new FileInputStream("smile.jpg"));
//        ImageView imageView = new ImageView(image);
//        imageView.setFitHeight(300);
//        imageView.setFitWidth(400);
//
//        FadeTransition fadeTransition = new FadeTransition(Duration.millis(1000),imageView);
//        fadeTransition.setFromValue(1.0);
//        fadeTransition.setFromValue(0.0);
//        fadeTransition.setCycleCount(Timeline.INDEFINITE);
//        fadeTransition.setAutoReverse(true);
//        fadeTransition.play();
////////
//
////Блок коду створення складної рухомої анімації обєкта
//        Rectangle rectangle1 = new Rectangle(0,0,40,40);
//       rectangle1.setFill(Color.AZURE);
//        Path path = new Path();
//        path.getElements().add(new MoveTo(20,20));
//        path.getElements().add(new CubicCurveTo(380,0,380,120,200,120));
//        path.getElements().add(new CubicCurveTo(0,120,0,240,380,240));
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setDuration(Duration.millis(4000));
//        pathTransition.setPath(path);
//        pathTransition.setNode(rectangle1);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//       pathTransition.setCycleCount(Timeline.INDEFINITE);
//        pathTransition.setAutoReverse( true);
//        pathTransition.play();
///////
//
//
//        Group group = new Group();
//        group.getChildren().add(rectangle);
//        group.getChildren().add(imageView);
//       group.getChildren().add(rectangle1);
//
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//
//
//
//
//
//
//    }
//}
//
