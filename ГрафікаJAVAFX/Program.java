//package ГрафікаJAVAFX;
//
//import com.sun.javafx.geom.Vec2f;
//import javafx.application.Application;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseButton;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//import java.util.Random;
//
///**
// * Created by Гріша on 17.08.2017.
// */
//public class Program extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Simple App");
//        primaryStage.setScene(createScene());
//        primaryStage.show();
//    }
//private Scene createScene(){
//    Group group = new Group();
//    Scene scene= new Scene(group,600,600);
//    for ( int i = 0; i<13;i++){group.getChildren().add(createLabel());}
//    return scene;
//}
//
//private Label createLabel(){
//    Label label = new Label();
//    label.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.DOTTED, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//    label.setText("JAVA 8 FX");
//    label.setPrefHeight(50);
//    label.setPrefWidth(100);
//    label.setAlignment(Pos.CENTER);
//    label.setLayoutX(new Random().nextInt(600-100));
//    label.setLayoutY(new Random().nextInt(600-100));
//    label.setStyle("-fx-background-color: red;");
//
//    addTranslateListener(label);
//
//    return label;
//
//
//}
//private Vec2f delta;
//private boolean isRotate;
//private  void addTranslateListener(Node node){
//    node.setOnMousePressed(new EventHandler<MouseEvent>() {
//        @Override
//        public void handle(MouseEvent event) {
//            delta= new Vec2f((float)(event.getSceneX()- node.getLayoutX()),
//                    (float)(event.getSceneY()-node.getLayoutY()));
//            if (event.getButton()== MouseButton.SECONDARY){
//                isRotate= true;
//            }
//        }
//    });
//    node.setOnMouseDragged(new EventHandler<MouseEvent>() {
//        @Override
//        public void handle(MouseEvent event) {
//           if (isRotate){
//               double dx1 = event.getSceneX()- node.getLayoutX();
//               double dy1 = event.getSceneX() - node.getLayoutY();
//               double l = Math.sqrt(dx1*dx1+dy1*dy1);
//               dx1/=l;
//               dy1/=l;
//               double angle =Math.PI/2;
//               double dx2 =Math.sin(angle);
//               double dy2 = Math.cos(angle);
//
//               double cosA = dx1*dx2 + dy1*dy2;
//               angle =Math.acos(cosA);
//               if (dy1<0)
//                   angle= Math.PI - angle;
//               node.setRotate(angle/Math.PI*180);
//
//           }else{
//            node.setLayoutX(event.getSceneX()-delta.x);
//           node.setLayoutY(event.getSceneY()-delta.y);
//        }
//        }
//    }
//    );
//}
//}
//
