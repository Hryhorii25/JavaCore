//package ГрафікаJAVAFX;
//
//
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.canvas.*;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.paint.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.ArcType;
//import javafx.scene.shape.Line;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import java.awt.*;
//import static java.awt.SystemColor.text;
//
////Рисування фігур в JAVAFX за допомогою елемента Canvas
//public class FX3Canvas extends Application {
//    public static void main(String[] args) {
//        launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Canvas canvas = new Canvas(400,400);
//        GraphicsContext context = canvas.getGraphicsContext2D();
//        grawShapes(context);
//
//        Group group = new Group();
//        Scene scene = new Scene( group,400,400);
//        group.getChildren().add(canvas);
//
//
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//private  void grawShapes(GraphicsContext graphicsContext){
//        graphicsContext.setFill(Color.GREEN);
//        graphicsContext.setStroke(Color.BLUE);
//        graphicsContext.setLineWidth(5);
//        graphicsContext.strokeLine(40,10,10,40);
//        graphicsContext.fillOval(10,60,30,30);
//        graphicsContext.fillRoundRect(160,60,30,30,10,10);
//        graphicsContext.fillArc(10,110,30,45,45,240, ArcType.OPEN);
//        graphicsContext.fillPolygon(new double[]{10,40,10,40},new double[]{210,210,240,240},4);
//        graphicsContext.fillPolygon(new double[]{60,90,60,90},new double[]{210,210,240,240},4);
//        graphicsContext.fillPolygon(new double[]{110,140,110,140},new double[]{210,210,240,240},4);
//
//
//}
//
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
